import java.util.*;
public class BinaryTree{
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
    static class BinaryTree1{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.Left=buildTree(nodes);
            newNode.Right=buildTree(nodes);
            return newNode;
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree1 tree=new BinaryTree1();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
    }
}