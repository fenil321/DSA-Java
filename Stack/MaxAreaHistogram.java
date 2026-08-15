import java.util.*;

public class MaxAreaHistogram{
    public static void maxArea(int arr[]){
        int maxArea=0;
        int nsr[]=new int[arr.length]; //next smaller element to the right
        int nsl[]=new int[arr.length]; //next smaller element to the left

        //next smaller element to the right
        Stack<Integer> s=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                //-1
                nsr[i]=arr.length;
            }else{
                //top
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        
        //next smaller element to the left
        s=new Stack<>();

        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] >=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                //-1
                nsl[i]=-1;
            }else{
                //top
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        //current area=height*width
        //width=right-left-1  nsr[i]-nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(maxArea,currArea);
        }

        System.out.println("Max Area of Histogram: "+maxArea);
    }
    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3}; //Height of the histogram bars
        maxArea(arr);
    }
}