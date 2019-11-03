public class BinaryTree {

    private Node root;

    public BinaryTree() {}

    public BinaryTree(Node root) { this.root = root; }

    public void insert(int value) { insert(this.root, value); }

    private void insert(Node node, int value) {
        if (this.root != null) {
            if (value < node.getKey()) {
                if (node.getLeft() != null) insert(node.getLeft(), value);
                else node.setLeft(new Node(value));
            } else {
                if (node.getRight() != null) insert(node.getRight(), value);
                else node.setRight(new Node(value));
            }
        } else this.root = new Node(value);
    }

    public Node remove(int value) { return remove(this.root, value); }

    public Node remove(Node root, int value) {
        //TODO
        return null;
    }

    public Node search(int value) { return search(this.root, value); }

    public Node search(Node root, int value) {
        if (root == null) return null;
        if (root.getKey() == value) return root;
        if (root.getKey() > value) return search(root.getLeft(), value);
        return search(root.getRight(), value);
    }

    public void preOrder() { preOrder(this.root); }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.getKey() + ", ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    public void inOrder() { inOrder(this.root); }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getKey() + ", ");
            inOrder(root.getRight());
        }
    }

    public void afterOrder() { afterOrder(this.root); }

    public void afterOrder(Node root) {
        if (root != null) {
            afterOrder(root.getLeft());
            afterOrder(root.getRight());
            System.out.print(root.getKey() + ", ");
        }
    }

    public int size() { return size(this.root); }

    public int size(Node root) {
        if (root == null) return 0;
        return size(root.getLeft()) + size(root.getRight()) + 1;
    }

    public Node getRoot() { return this.root; }

    public void setRoot(Node root) { this.root = root; }
}