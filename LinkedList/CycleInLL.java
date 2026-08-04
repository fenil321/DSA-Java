public class CycleInLL{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean hasCycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
            if(slow==fast){
                return true; //cycle exists
            }
        }
        return false; //no cycle
    }

    //remove cycle
    public static void removeCycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }

        //find meeting point
        slow=head;
        Node prev=null; //to remove cycle
        while(slow!=fast){
            prev=fast;
            slow=slow.next; //+1
            fast=fast.next; //+1
        }
        //remove cycle => lastNode.next=null
        prev.next=null;
    }
    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        // head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=temp; //cycle created
        System.out.println(hasCycle());
        removeCycle();      
        System.out.println(hasCycle());
    }
}