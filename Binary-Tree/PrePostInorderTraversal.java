import java.util.*;

public class PrePostInorderTraversal {
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

        public static void preorder(Node root){ //o(n)
            if(root==null){
                //System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" "); //root
            preorder(root.Left); //left subtree
            preorder(root.Right); //right subtree
        }

        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.Left); //left subtree
            postorder(root.Right); //right subtree
            System.out.print(root.data+" "); //root
        }

        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.Left); //left subtree
            System.out.print(root.data+" "); //root
            inorder(root.Right); //right subtree
        }
    }

    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree1 tree=new BinaryTree1();
        Node root=tree.buildTree(nodes);
        
        tree.preorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.inorder(root);
    }
}
