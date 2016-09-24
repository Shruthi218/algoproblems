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

class CountLeaf
{
	static Node root;

	
	public int count(Node root)
	{
	    
	    
	    if(root == null)
	    return 0;
	    
	    if(root.left == null && root.right == null)
	    return 1;
	    
	    return count(root.left) + count(root.right);
	}

	
	public static void main(String args[]) 
	{
		

              CountLeaf a = new CountLeaf();
              a.root = new Node(10);
              a.root.left = new Node(8);
              a.root.right = new Node(2);
              a.root.left.left = new Node(3);
              a.root.left.right = new Node(5);
              a.root.right.left = new Node(2);
              int value = a.count(root);
              System.out.println(value);
            
              
              
	}
}


