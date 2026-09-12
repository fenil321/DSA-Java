public class SearchBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) { //o(h)
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2,7};
        Node root = null;
        
        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }

        inorder(root);
        System.out.println();
        // System.out.println(search(root, 3));
        if (search(root, 3)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
