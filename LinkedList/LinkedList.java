public class LinkedList{
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

    public void add(int idx,int data){
        //idx=0; addfirst
        if(idx==0){
            addFirst(data);
            return;
        }
        
        Node newNode=new Node(data);
        size++;

        Node temp=head;
        int i=0;
        if(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1; temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }  else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }

        int val = head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size==0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }  else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }

        //prev: i=size-2,  like n-1 for last index, here for second last index we have to go till n-2
       
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }

        int val = prev.next.data; //tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public int itrSerach(int key){ //o(n)
        Node temp=head;
        int i=0;

        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        //key not found case
        return -1;
    }

    public int helper(Node head, int key){ //o(n)
        if(head==null){
            return -1;
        }
        
        if(head.data==key){
            return 0;
        }

        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
        return helper(head,key);
    }

    //reverse a linked list
    public void reverse(){ //O(n)
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void removeNthFromEnd(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next; //remove first
            return;
        }

        //sz-n
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public static void main(String args[]){
       LinkedList ll=new LinkedList();
       ll.print();
       ll.addFirst(2);
       ll.print();
       ll.addFirst(1);
       ll.print();
       ll.addLast(3);
       ll.print();
       ll.addLast(4);
       ll.addLast(5);
       ll.addLast(6);

       System.out.println("remove from the end: ");
       ll.removeNthFromEnd(2);
       ll.print();

       //ll.add(2,9);
       //ll.print();

       //ll.removeFirst();
       //ll.print();

       //ll.removeLast();
       //ll.print();

       //System.out.println(ll.size);

       System.out.println(ll.itrSerach(2));
       System.out.println(ll.recursiveSearch(3));

       System.out.println("Reverse of linked list: ");
       ll.reverse();
       ll.print();
    }
}