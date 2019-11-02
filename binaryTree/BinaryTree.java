public class BinaryTree {

    private Node root;

    public BinaryTree() {}

    public BinaryTree(Node root) { this.root = root; }

    public void insert(int value) { insert(this.root, value); }

    public void insert(Node node, int value) {
        if (node != null) {
            if (value < node.getKey()) {
                if (node.getLeft() != null) insert(node.getLeft(), value);
                else node.setLeft(new Node(value));
            } else {
                if (node.getRight() != null) insert(node.getRight(), value);
                else node.setRight(new Node(value));
            }
        } else node = new Node(value);
    }

    public Node getRoot() { return this.root; }

    public void setRoot(Node root) { this.root = root; }
}

    
        
     

    
        
     
         
    
