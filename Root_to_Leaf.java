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

class Ancestors
{
	Node root;

	
	public boolean root_to_leafsum(Node root,int sum)
	{
	    if(root==null)
	    return sum == 0;
	    
	    
	    int subsum = sum - root.data;
	    return root_to_leafsum(root.left,subsum) ||  root_to_leafsum(root.right,subsum);
	    
	    
	}

	
	public static void main(String args[]) 
	{
		

              Ancestors a = new Ancestors();
              a.root = new Node(10);
              a.root.left = new Node(8);
              a.root.right = new Node(2);
              a.root.left.left = new Node(3);
              a.root.left.right = new Node(5);
              a.root.right.left = new Node(2);
            
              if(a.root_to_leafsum(a.root,23))
              
              System.out.println("path exists");
              else
              System.out.println("no!!");
              
	}
}


