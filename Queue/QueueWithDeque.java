import java.util.Deque;
import java.util.LinkedList;

public class QueueWithDeque {
    static class Queue{
        Deque<Integer> d=new LinkedList<>();

        void add(int x){
            d.addLast(x);
        }

        int remove(){
            return d.removeFirst();
        }

        int peek(){
            return d.getFirst();
        }

        boolean isEmpty(){
            return d.isEmpty();
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        //System.out.println(q.peek());

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
