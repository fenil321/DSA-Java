import java.util.*;

public class SumOfNodes {
    static class Node{
        int data;
        Node Left;
        Node Right;
        Node(int data){
            this.data=data;
            this.Left=null;
            this.Right=null;
        }
    }
    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNodes(root.Left);
        int rightSum=sumOfNodes(root.Right);

        return leftSum+rightSum+root.data;
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.Left=new Node(2);
        root.Right=new Node(3);
        root.Left.Left=new Node(4);
        root.Left.Right=new Node(5);
        System.out.println(sumOfNodes(root));
    }
}
