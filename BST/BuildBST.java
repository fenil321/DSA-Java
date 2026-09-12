public class BuildBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(root.data>val){
            //left subtree
            root.left=insert(root.left,val);
        } else {
            //right subtree
            root.right=insert(root.right,val);
        }
        return root;
    }

    public static void inoder(Node root){
        if(root==null){
            return;
        }
        inoder(root.left);
        System.out.print(root.data+" ");
        inoder(root.right);
    }
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }

        inoder(root);
        System.out.println();
    }

}