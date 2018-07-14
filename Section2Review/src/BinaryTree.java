import javax.xml.crypto.Data;

public class BinaryTree {

    private Node root;
    
    public BinaryTree(){
        root = null;
    }
    
    class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data = data;
        }
    }
    
    //inserts a new node into the BST
    public void insert(int key){

    	 root = insertRec(root, key);
        
    }
    Node insertRec(Node root, int key) {
    	 
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    }
    
    //prints the inorder traversal of the BST
    public void printInOrder(Node node){
        if (node == null)
        {
        	return;
        }
        
        printInOrder(node.left);
        printInOrder(node.right);
        
    }
    
    //prints the inorder traversal of the BST
    public void printPreOrder(){
        
    }
    
    //prints the inorder traversal of the BST
    public void printPostOrder(){
        
    }
}