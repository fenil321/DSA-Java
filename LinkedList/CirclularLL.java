public class CirclularLL{
    static class Node{
        int data;
        Node next;
    }

    static Node addLast(Node last, int data){
        
        Node newNode = new Node();
        newNode.data=data;
        // Case 1: List is currently empty
        if(last==null){
            newNode.next=newNode; // Points to itself to maintain circular structure
            return newNode;         // New node becomes the 'last' node
        }
        // Case 2: List is NOT empty
        newNode.next=last.next;  // Point new node to head (first node)
        last.next=newNode;  // Connect current last node to new node
        last=newNode;      // Move 'last' pointer to the new node
        return last;
    }

    static Node addFirst(Node last, int data){
        Node newNode=new Node();
        newNode.data=data;
        // Case 1: List is currently empty
        if(last==null){
            newNode.next=newNode; // Points to itself to maintain circular structure
            return newNode;         // New node becomes the 'last' node
        }
        // Case 2: List is NOT empty
        newNode.next=last.next;  // Point new node to head (first node)
        last.next=newNode;  // Connect current last node to new node
        return last; // 'last' remains unchanged, as we are adding at the beginning
    }
    static void traverse(Node last){
        if(last==null){
            System.out.println("Circular LL is empty");
            return;
        }
        Node first=last.next;
        do{
            System.out.print(first.data+" ");
            first=first.next;
        }while(first!=last.next);
    }
    public static void main(String[] args) {
        Node last = null;
        last = addLast(last, 1);
        last = addLast(last, 2);
        last = addLast(last, 3);
        last = addLast(last, 0);
        last = addFirst(last, 4);
        traverse(last);
    }
}