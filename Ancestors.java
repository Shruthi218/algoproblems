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

	
	public boolean printAncestors(Node node, int key) 
	{
		
		if (node == null)
			return false;

		if (node.data == key)
			return true;

		
		if (printAncestors(node.left, key)
				|| printAncestors(node.right, key)) 
		{
			System.out.print(node.data + " ");
			return true;
		}

		
		return false;
	}

	
	public static void main(String args[]) 
	{
		

              Ancestors a = new Ancestors();
              a.root = new Node(1);
              a.root.left = new Node(2);
              a.root.right = new Node(3);
              a.root.left.left = new Node(4);
              a.root.left.right = new Node(5);
              a.root.left.left.left = new Node(6);
              a.printAncestors(a.root,4);

	}
}


