public class all_in_one {
    public static void fibo(int n){
        int a=0,b=1,c,sum=0;
        //System.out.println(a+" "+b);
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            sum+=a;
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("Sum is: "+sum);
    }
    
    public static void geo(int n){
        int a=2,r=2;
        int sum=0;
        System.out.println("Geometry series : ");
        for(int i=1,k=a; i<=n; i++,k*=r){
            System.out.print(k+" ");
        }
    }
    public static void squarenum(int n){
        int sum=0;
        for(int i=1; i<=n;i++){
            int square = i*i;
            System.out.print(square+" ");
            sum+=square;
        }
        System.out.println("Sum : "+sum);
    }
    
    public static void leap(int year){
        boolean first=true;
        for(int i=2000;i<=year;i++){
            if((i%4==0 && i % 100!=0)||(i%400 ==0)){
                if(!first) System.out.print(',');
                System.out.print(i);
                first=false;
            }
        }
    }
    
    public static void largestnuminarr(){
        int[] arr={2,3,4,12,5,8};
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest Num: "+largest);
    }
    public static void secondlr(){
        int[] arr={2,3,4,12,5,8};
        int lr=arr[0];
        int slr=arr[0];
         //find largest
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lr){
                lr=arr[i];
            }
        }
        //find sec largest
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=lr){
                if(arr[i]>slr){
                    slr=arr[i];
                }
            }
        }
        System.out.println("Second Largest : "+slr);
    }
    
    public static void p1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void p2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void hollow(int n){
        //upper
        for(int i=0;i<n;i++){
            //spaces
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<i;j++){
                if(j==1) System.out.print("*");
                else System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        //lower
        //upper
        for(int i=n-1;i>0;i--){
            //spaces
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<i;j++){
                if(j==1) System.out.print("*");
                else System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void prime(int n){
        int[] primes =new int[n];
        int count=0;
        
        for(int i=2;i<=n;i++){
            boolean isPrime=true;
            for(int j=2;j<i/2;j++){
                if(i%2==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                primes[count]=i;
                count++;
            }
        }
        System.out.println("Prime number up to "+n+" : ");
        for(int i=0;i<count;i++){
            System.out.print(primes[i]+" ");
        }
        
    }
    public static void freq(){
        int[] arr = {1,1, 2, 2, 3, 4, 4, 4};
        boolean[] visited = new boolean[arr.length];
        
        for(int i=0;i<arr.length;i++){
            if(visited[i]) continue;
            
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                     visited[j]=true;
                     count++;
                }
            }
            System.out.println(arr[i]+" : "+count);
        }
    }
    
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            if(i%2!=0) {
               for(int j=1;j<=i;j++) System.out.print("*"); 
            }
            else {
                for(int j=1;j<=i;j++) System.out.print(j); 
            }
            System.out.println();
        }
    }
    
    public static void evenodd(){
        int[] arr = {8, 4, 5, 2, 3, 1};
        //sort in desc
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //new arr for result
        int[] result =new int[arr.length];
        int idx=0;
        
        //add even num first
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                result[idx++]=arr[i];
            }
        }
        //add odd num
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                result[idx++]=arr[i];
            }
        }
        //print arr
        for (int i = 0; i < result.length; i++) {
             System.out.print(result[i]);
             if(i<result.length-1) System.out.print(",");
        }
    }
    public static void reverseword(){
        String str="hello fenil, java!";
        String[] words = str.split(" ");
        
        for(int i=words.length-1; i>=0;i--){
            System.out.print(words[i]);
            if(i!=0) System.out.print(" ");
        }
    }
    
    public static void reversearr(){
        int[] arr={1,2,3,4,5};
        int start=0, end=arr.length-1;
        
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reverse arrayy : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void arrsortedornot(){
        int[] arr={1,2,3};
        boolean sorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }
        if(sorted){
            System.out.println("array sorted");
        }else{
            System.out.println("array not sorted");
        }
    }
    
    public static void arrduplicate(){
        int[] arr={1,1,2,2,3,4,4,5,6,7};
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[arr.length-1];
        
        System.out.println("Array without duplicate : ");
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void missingnumarr(){
        int[] arr={1,2,4,5};
        int n=5;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int total=n*(n+1)/2;
        System.out.println("Missing num :"+(total-sum));
    }
    
    public static void pairwithsum(){
        int[] arr = {8, 4, 5, 2, 3, 1};
        int target=9;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+"+"+arr[j]+"="+target);
                }
            }
        }
    }
    
    public static void movezerotoend(){
        int[] arr={0,1,2,0,3,0,5};
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[idx++]=arr[i];
            }
        }
        while(idx<arr.length){
            arr[idx++]=0;
        }
        
        System.out.println("After moving zeros to end :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void rotatearr(int K){
        int[] arr={1, 2, 3, 4, 5, 6, 7};
        int n=arr.length;
        int k=K%n; // Handle cases where k is larger than array length k=2mod7=2
        
        for(int i=0;i<k;i++){
            // Store the very last element of the array
            int lastElement=arr[n-1];
            // Shift all elements one position to the right
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            // Put the saved last element into the first position
            arr[0] = lastElement;
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void reversestr(){
        String str="Fenil";
        String rev="";
        
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println("Reverse String :"+rev);
    }
    
    public static void palindstr(){
        String str="madam";
        String rev="";
        
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome!");
        }
    }
    
    public static void countvowel(){
        String str="education";
        int vowels=0,consonants=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Vowels : "+vowels);
        System.out.println("Consonants : "+consonants);
    }
    
    public static void freqstr(){
        String str="rameshvaram";
        boolean[] visited=new boolean[str.length()];
        
        for(int i=0;i<str.length();i++){
            if(visited[i]) continue;
            
            int count=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(str.charAt(i)+" -> "+count);
        }
    }
    
    public static void removeduplicatechar(){
        String str="programming";
        String result="";
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            if(result.indexOf(ch)==-1){
                result+=ch;
            }
        }
        System.out.println("After removing duplicate : "+result);
    }
    
    //Find First Non-Repeated Character
    public static void firstunique(){
        String str="swiss";
        
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println("First non-repeated character : "+str.charAt(i));
                break; 
            }
        }
    }
    
    //Count Words in a String
    public static void countword(){
        String str="hello fenil im fine.";
        int count=1;
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("Total word in string : "+count);
    }
    public static void main(String[] args) {
        int n=5,year=2020;
        int k=2;
        //fibo(n);
        //geo(n);
        //squarenum(n);
        //leap(year);
        //largestnuminarr();
        //secondlr();
        //p1(n);
        //p2(n);
        //hollow(n);
        //prime(n);
        //freq();
        //pattern(n);
        //evenodd();
        //reverseword();
        //reversearr();
        //arrsortedornot();
        //arrduplicate();
        //missingnumarr();
        //pairwithsum();
        //movezerotoend();
        //rotatearr(k);
        //reversestr();
        //palindstr();
        //countvowel();
        //freqstr();
        //removeduplicatechar();
        //firstunique();
        //countword();
    }
}