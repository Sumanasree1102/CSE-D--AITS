class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}
class SearchElement{
    Node root;
    boolean search(Node node, int key) {
        if (node == null) {
            return false;
        }
        if (node.data == key) {
            return true;
        }
        boolean res1 = search(node.left, key);
        if (res1) return true;
        boolean res2 = search(node.right, key);
        return res2;
    }
    public static void main(String[] args) {
        SearchElement tree = new SearchElement();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        int key = 4;
        if (tree.search(tree.root, key)) {
            return True;
        } else {
           return False
        }
    }
}