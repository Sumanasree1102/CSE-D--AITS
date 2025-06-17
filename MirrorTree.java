class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class MirrorTree{
    Node root;
    public void mirror() {
        root = mirrorTree(root);
    }
    private Node mirrorTree(Node node) {
        if (node == null) {
            return null;
        }
        Node left = mirrorTree(node.left);
        Node right = mirrorTree(node.right);
        node.left = right;
        node.right = left;
        return node;
    }
    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }
    public static void main(String[] args) {
        MirrorTree tree = new MirrorTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Original Tree (Inorder):");
        tree.inorderTraversal(tree.root);
        System.out.println();
        tree.mirror();
        System.out.println("Mirror Tree (Inorder):");
        tree.inorderTraversal(tree.root);
    }
}