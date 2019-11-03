public class Main {

    public static void main(String[] args) {
        
        BinaryTree b = new BinaryTree(new Node(5));
        Node n = new Node();
        b.insert(5);
        b.insert(4);
        b.insert(1);
        b.insert(8);
        b.insert(0);
        b.insert(8);
        b.insert(3);
        b.insert(7);
        b.insert(2);
        int a = b.size();
        System.out.println(a);
    }
}