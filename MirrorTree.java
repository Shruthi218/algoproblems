import java.util.Stack;
 

class Node {
 
    int data;
    Node left, right;
 
    public Node(int item) {
        data = item;
        left = right = null;
    }

 


public void BTreetoMirror(Node root)
{

if(root==null)
return;

BTreetoMirror(root.left);
BTreetoMirror(root.right);
Node temp = root.left;
root.left = root.right;
root.right = temp;

}

public void inorder(Node root)
{
    
    if(root==null)
    return;
    
    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);

}


    
    public static void main(String args[])
    {
        
        Node t = new Node(1);
        
        t.left = new Node(2);
        t.right = new Node(3);
        t.left.left = new Node(4);
        t.left.right = new Node(5);
        t.right.left = new Node(6);
        t.BTreetoMirror(t);
        t.inorder(t);
        
    }
}

