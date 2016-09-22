import java.util.Stack;
 

class Node {
 
    int data;
    Node left, right;
 
    public Node(int item) {
        data = item;
        left = right = null;
    }
}
 

class BinaryTree {
 
    Node root;
 
    void inorder() {
        if (root == null) {
            return;
        }
        
        
        Stack<Node> stack = new Stack<Node>();
        Node node = root;
         
        
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
         
       
        while (stack.size() > 0) {
           
            // visit the top node
            node = stack.pop();
            System.out.print(node.data + " ");
            if (node.right != null) {
                node = node.right;
                 
                // the next node to be visited is the leftmost
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
    }
 
    public static void main(String args[]) {
         
        /* creating a binary tree and entering 
         the nodes */
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.inorder();
    }
}
