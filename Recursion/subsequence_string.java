public class subsequence_string {
    public static void subsequence(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        //to be
        subsequence(str, idx+1, newString+currchar);
        //not to be
        subsequence(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequence(str,0,"");
    }
}
