import java.util.ArrayList;

public class BstToBalanceBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    } 
    public static void  preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBalanceBST(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBalanceBST(inorder, st, mid - 1);
        root.right = createBalanceBST(inorder, mid + 1, end);
        return root;
    }
    
    public static Node bstToBalanceBST(Node root) {
        //step 1: inorder traversal of BST
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        //step 2: store the inorder traversal in arraylist
        return createBalanceBST(inorder, 0, inorder.size() - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
    
        preOrder(root);
        System.out.println();
        root = bstToBalanceBST(root);
        preOrder(root);
        System.out.println();
    }
}
