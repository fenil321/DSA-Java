import java.util.*;

public class OptLCA {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca2(Node root, int n1, int n2){
        if(root==null){
            return null;
        }

        if(root.data==n1 || root.data==n2){
            return root;
        }

        Node leftLca=lca2(root.left, n1, n2);
        Node rightLca=lca2(root.right, n1, n2);

       //leftLca=val and rightLca=null
       if(rightLca==null){
            return leftLca;
        }
        //leftLca=null and rightLca=val
        if(leftLca==null){
            return rightLca;
        }
        //leftLca=val and rightLca=val
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(lca2(root, 4, 7).data);
        System.out.println(lca2(root, 4, 6).data);
        System.out.println(lca2(root, 5, 6).data);
    }
}
