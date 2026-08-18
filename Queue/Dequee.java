import java.util.LinkedList;
import java.util.Deque;

public class Dequee{
    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();
        d.addFirst(1); //1
        d.addFirst(2); //2 1
        d.addLast(3); //2 1 3
        d.addLast(4); //2 1 3 4
        System.out.println(d);
       // d.removeFirst();
        d.removeLast();
        System.out.println(d);
        System.out.println("First element: " + d.getFirst());
        System.out.println("Last element: " + d.getLast());
    }
}

// Deque is a double-ended queue that allows insertion and removal of elements from both ends. In this code, we create a Deque of integers using LinkedList as the underlying data structure. We add elements to both the front and back of the deque, remove an element from the back, and then print the current state of the deque along with the first and last elements.