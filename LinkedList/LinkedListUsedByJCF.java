import java.util.LinkedList;
public class LinkedListUsedByJCF {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addFirst(3);
        System.out.println(ll);
         //remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}