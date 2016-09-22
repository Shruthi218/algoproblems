import java.util.*;

class Node
{

int data;
Node left;
Node right;


Node(int d)
{

data = d;
left = null;
right = null;
}
}



public boolean identicaltrees(Node root1,Node root2)
{

if(root1 == null || root2 == null)
return false;

if(root1==null && root2 == null)
return true;

if(root1.data == root2.data)
return identicaltrees(root1.left,root2.left) && identicaltrees(root1.right,root2.right);
}




class identicalTree
{

public static void main(String args[])
{
identicalTree t = new identicalTree();
t.root1 = new Node(1);
t.root1.left = new Node(2);
t.root1.right = new Node(3);
t.root1.left.left = new Node(4);
t.root1.left.right = new Node(5);
  
t.root2 = new Node(1);
t.root2.left = new Node(2);
t.root2.right = new Node(3);
t.root2.left.left = new Node(4);
t.root2.left.right = new Node(5);

if(t.identicaltrees(t.root1,t.root2))
{

System.out.println("identical trees");
}

else
{

System.out.println("Not identical");
}

}
}






