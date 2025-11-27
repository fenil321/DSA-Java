public class test3 {
    public static void lrarr(){
        int[] arr={1,23,4,5,67,0};
        int lr=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>lr){
                lr=arr[i];
            }
        }
        System.out.println("largest element:"+lr);
    }

    public static void seclrarr(){
        int[] arr={1,23,4,5,67,0};
        int lr=arr[0];
        int sec=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>lr){
                lr=arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=lr) {
                if (arr[i]>sec) {
                    sec=arr[i];
                }
            }
        }
        System.out.println("second largest :  "+sec); 
    }

    public static void revarr() {
        int[] arr={1,2,3,4,5};

        int start=0,end=arr.length-1;
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        System.out.print("Reversed array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void arraysortornot() {
        int[] arr={11,2,0,123,45};
        boolean sorted=true;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                sorted=false;
                break;
            }
        }
        if (sorted) {
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("array is unsorted");
        }
    }

    public static void removeduplicare() {
        int[] arr={1,1,2,2,3,4,4,5};
        int j=0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]!=arr[i+1]) {
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[arr.length-1];

        System.out.println("Array without duplicates");

        for (int i = 0; i < j; i++) {
            System.out.println(arr[i]+" ");
        }
    }

    public static void missingnum(){
        int[] arr={1,2,4,5};
        int n=5;
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        int total=n*(n+1)/2;
        System.out.println("Missing Number : "+(total-sum));
    }

    public static void frequencyofelement(){
        int[] arr={1,2,2,3,3,4,4,4};
        boolean[] visited=new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count=1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+" : "+count);
        }
    }

    public static void pairwithgivensum() {
        int[] arr={2,7,4,5,9};
        int target=9;

        System.out.println("Pairs with sum "+target+" :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target) {
                    System.out.println(arr[i]+"+"+arr[j]+"="+target);
                }
            }
        }
    }

    public static void moveallzerotoend(){
        int[] arr={0,1,0,3,12};
        int index=0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                arr[index++]=arr[i];
            }
        }
        while (index<arr.length) {
            arr[index++]=0;
        }
        System.out.println("Array after moving zeros: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void intersecandunion(){
        int[] a={1,2,3,4};
        int[] b={3,4,5,6};

        System.out.println("Intersection: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                }
            }
        }

        System.out.println("union: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        for (int j = 0; j < b.length; j++) {
            boolean found=false;
            for (int i = 0; i < a.length; i++) {
                if (b[j]==a[i]) {
                    found=true;
                    break;
                }
            }
            if (!found) {
                System.out.println(b[j]+" ");
            }
        }

    }
    public static void main(String[] args) {
        //lrarr();
        //seclrarr();
        //revarr();
        //arraysortornot();
        //removeduplicare();
        //missingnum();
        //frequencyofelement();
        //pairwithgivensum();
        //moveallzerotoend();
        intersecandunion();
    }
}