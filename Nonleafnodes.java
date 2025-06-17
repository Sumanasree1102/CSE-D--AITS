class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
class Nonleafnodes {
    Node root;
    public int countNonLeafNodes(Node node) {
        if (node == null || (node.left == null && node.right == null)) {
            return 0;
        }
        return 1 + countNonLeafNodes(node.left) + countNonLeafNodes(node.right);
    }
    public static void main(String[] args) {
        Nonleafnodes tree = new Nonleafnodes();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        int nonLeafCount = tree.countNonLeafNodes(tree.root);
        System.out.println("Number of non-leaf nodes: " + nonLeafCount); // Output: 3
    }
}