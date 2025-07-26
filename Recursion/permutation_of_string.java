public class permutation_of_string {
    public static void printpermutation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            //"abc" -> "ab"
            String newstr = str.substring(0, i) + str.substring(i+1);
            printpermutation(newstr, permutation+currchar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printpermutation(str, "");
    }
}
