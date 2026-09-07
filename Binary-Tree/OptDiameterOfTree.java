import java.util.*;

public class OptDiameterOfTree {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class Info{
        int height;
        int diameter;

        public Info(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static Info optDiameter(Node root){
        if(root==null){
            return new Info(0,0);
        }

        Info leftInfo = optDiameter(root.left);
        Info rightInfo = optDiameter(root.right);

        int diam=Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height + rightInfo.height + 1);
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        return new Info(height, diam);
    }

    public static void main(String[] args) {
       Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //Info result = optDiameter(root);
        System.out.println("Diameter of the tree is: " + optDiameter(root).diameter);
        System.out.println("Height of the tree is: " + optDiameter(root).height);
    }
}
