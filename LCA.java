class Node 
{
	int data;
	Node left, right, nextRight;

	Node(int item) 
	{
		data = item;
		left = right = nextRight = null;
	}
}

class LCA
{
	static Node root;

	
	public Node lca(Node root,Node n1,Node n2)
	{
	    
	    if(root==null)
	    return null;
	    
	    if(root==n1 || root == n2)
	    return root;
	    
	    Node left = lca(root.left,n1,n2);
	    Node right = lca(root.right,n1,n2);
	    
	    if(left!=null && right!=null)
	    {
	        return root;
	    }
	    
	    if(left==null && right==null)
	    {
	        return null;
	    }
	    
	    return left!=null?left:right;
	}
	
	public static void main(String args[]) 
	{
		

              LCA a = new LCA();
              Node n1 = new Node(8);
              Node n2 = new Node(7);
              a.root = new Node(3);
              a.root.left = new Node(6);
              a.root.right = n1;
            //  a.root.right = new Node(8);
              a.root.right.right  = new Node(13);
              //a.root.right.right.left = new Node(7);
              a.root.right.right.left = n2;
              a.root.left.left = new Node(2);
              a.root.left.right = new Node(11);
              //a.root.left.right = n2;
              a.root.left.right.left = new Node(9);
              a.root.left.right.right = new Node(5);
              
              Node answer = a.lca(root,n1,n2);
              System.out.println(answer.data);
            
              
              
	}
}


