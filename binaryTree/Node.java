public class Node {
    
    private int key;
    private Node left;   
    private Node right;

    public Node() {}

    public Node(int value) { this.key = value; }
    
    public void setKey(int value) { this.key = value; }
    
    public int getKey() { return this.key; }

    public void setLeft(Node value) { this.left = value; }
    
    public Node getLeft() { return this.left; }

    public void setRight(Node value) { this.right = value; }
    
    public Node getRight() { return this.right; }
}
