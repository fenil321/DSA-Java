public class LinkedList1 {
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
    public static int size;

    public void addLast(int data){
        //step1: create a new node
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }

        //step2: tail next = newNode
        tail.next=newNode; //link

        //step3: tail = newNode
        tail = newNode;
       
    }

    public void print(){
       Node temp=head;
       if(head==null){
        System.out.println("LinkedList is empty");
        return;
       }

       while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
       }
       System.out.println("null");
    }

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
        }

        return slow; //slow is my mid node
    }

    public boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }

        //step1-find mid
        Node midNode=findMid(head);

        //step2-reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev; //right half head
        Node left=head;

        //step3-check left half and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String args[]){
        LinkedList1 ll=new LinkedList1();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.isPalindrome());
    }
}
