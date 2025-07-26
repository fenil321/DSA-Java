public class rev_string {
    public static void reversestr(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        reversestr(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "ABCDEF";
        reversestr(str, str.length()-1);
    }
}
