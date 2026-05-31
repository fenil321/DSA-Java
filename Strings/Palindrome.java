class Palindrome {
    public static boolean isPalindrome(String s) {
            s=s.toLowerCase();
            //s=s.replaceAll("[^a-z0-9]","");             
        for(int i=0;i<s.length()/2;i++){
            int n=s.length();
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str ="ABCBA";
        System.out.println(isPalindrome(str));
    }
}