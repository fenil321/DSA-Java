public class test4{
    //Reverse a String
    public static void revstr() {
        String str="hello";
        String rev="";
        
        for(int i=str.length()-1;i>=0;i--){ 
            //Logic:
            //Loop from last character to first and append each character.
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed String : "+rev);
    }

    //Check Palindrome String
    public static void palindrome() {
        String str="madam";
        String rev="";
        
        for(int i=str.length()-1;i>=0;i--){ 
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)) 
            //Logic:
            //To check actual string with revrse string.
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    //Count Vowels and Consonants
    public static void countvowels() {
        String str="education";
        int vowels=0,consonants=0;
        
        for(int i=0;i<str.length(); i++){
            char ch =str.charAt(i);
            
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){ //vowels : a,e,i,o,u
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Vowels : "+vowels);
        System.out.println("Consonants : "+consonants);
    }

    //Count Frequency of Each Character
    public static void Frequencyofchar() {
        String str="java";
        boolean[] visited = new boolean[str.length()];
        
        //Outer loop → pick one character
        //Inner loop → count how many times it appears
        //visited[] array → avoid counting the same character again
        //visited[] keeps track of characters that are already counted
        for(int i=0;i<str.length();i++){
            if(visited[i]) continue;  //If a character is already counted, skip it
                                      //This avoids duplicate printing
            
            int count = 1;
            for(int j=i+1;j<str.length();j++){
                //Compare current character with the rest
                    //If match found:
                    //Increase count
                    //Mark that index as visited
                if(str.charAt(i)==str.charAt(j)){
                    count++;                    
                    visited[j]=true;
                }
            }
            System.out.println(str.charAt(i)+" -> "+count);
        }
    }

    //Remove Duplicate Characters
    public static void removedupchar() {
        //str → original string
        //result → stores characters without duplicates
        //Initially, result is empty
        String str="Programming";
        String result="";
        
        //This loop picks one character at a time from str
        for(int i=0;i<str.length();i++){
            //Get Current Character
            char ch=str.charAt(i);
            
            if(result.indexOf(ch)==-1){
                //indexOf(ch) checks if ch exists in result
                //If it returns -1, the character is not present
                result=result+ch;
            }
        }
        System.out.println("After Removing duplicates : "+result);
    }

    //Find First Non-Repeated Character
    public static void firstunique() {
        String str="swiss";
        
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            //Logic: simply the character with count-1 is is non repeated first char
            if(count==1){
                System.out.println("First non-repeated character : "+str.charAt(i));
                break; //use break becoz we are not print second non repeated char
            }
        }
    }

    //Count Words in a String
    public static void countwordinstr(){
        String str="I Love Java Programming";
        int count=1;
        
        //Logic : Here We just increase count whenever the spaces encountered.
        //it will tells How many world have in sentence.
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("Total words : "+count);
    }

    //Check Anagram Strings
   /*  What is an Anagram?
    👉 Two strings are called anagrams if:
        They have the same length
        They contain the same characters
        The order of characters can be different
        ex : 
        l i s t e n
        s i l e n t  */
    
    public static void anagram() {
        //Note : This logic works correctly only when characters are unique or simple cases. ex s1 = "aab"
                           //s2 = "abb"
        String s1="listen";
        String s2="silent";
        
        //If lengths are different → ❌ Not anagram
        //Because anagrams must have the same number of characters
        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return;
        }
        int count=0;
        for(int i=0;i<s1.length();i++){
            count=0;
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("Not Anagram");
                return;
            }
        }
        //Outer loop picks one character from s1
        //Inner loop searches for that character in s2
        //If found:
            //Increase count
            //Break inner loop
        System.out.println("Anagram");

    }
    public static void main(String[] args) {
        revstr();
        palindrome();
        countvowels();
        Frequencyofchar();
        removedupchar();
        firstunique();
        countwordinstr();
        anagram();
    }
}