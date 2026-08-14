import java.util.*;

public class NextGreater {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nxtGreater[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            //1. while stack is not empty and current element is greater than or equal to top of stack, pop the stack
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            //2. if stack is empty, then there is no greater element to the right, so assign -1, else assign the top of stack as the next greater element
            if(s.isEmpty()){
                nxtGreater[i]=-1;
            }else{
                //3. if stack is not empty, then the top of stack is the next greater element for the current element
                nxtGreater[i]=arr[s.peek()];
            }
            //4. push the current index onto the stack
            s.push(i);
        }

        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
}

//next greater right
//next greater left
//next smaller right
//next smaller left
