import java.util.Deque;
import java.util.LinkedList;

public class StackwithDeque {
    static class Stack{
        Deque<Integer> d=new LinkedList<>();
        void push(int x){
            d.addLast(x);
        }
        int pop(){
            return d.removeLast();
        }
        int peek(){
            return d.getLast();
        }
        boolean isEmpty(){
            return d.isEmpty();
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        //System.out.println(s.peek());

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
