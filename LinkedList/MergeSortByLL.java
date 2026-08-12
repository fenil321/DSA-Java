public class MergeSortByLL {
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

    public void addFirst(int data){
        
        //step1: create a new node
        Node newNode=new Node(data);
        //size increment
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }

        //step2: newNode next = head
        newNode.next=head; //link

        //step3: head = newNode
        head = newNode;
    }

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

    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
        }
        return slow; //mid node
    }

    private Node merge(Node left, Node right){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;

        while(left!=null && right!=null){
            if(left.data<=right.data){
                temp.next=left;
                temp=left;
                left=left.next;
            }else{
                temp.next=right;
                temp=right;
                right=right.next;
            }
        }

        while(left!=null){
            temp.next=left;
            temp=left;
            left=left.next;
        }

        while(right!=null){
            temp.next=right;
            temp=right;
            right=right.next;
        }

        return mergedLL.next; //head of merged LL
    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }

        //find mid
        Node mid=getMid(head);

        //left and right part
        Node rightHead=mid.next;
        mid.next=null;

        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);

        return merge(newLeft,newRight);
    }

    public void zigzag(){
        //find mid
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node mid=slow;

        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        //alternate merge - zig-zag merge
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }

    public static void main(String[] args) {
        MergeSortByLL ll=new MergeSortByLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        //1->2->3->4->5->null
        ll.print();
        //ll.head=ll.mergeSort(ll.head);
        //ll.print();

        ll.zigzag();
        ll.print();
    }
}
