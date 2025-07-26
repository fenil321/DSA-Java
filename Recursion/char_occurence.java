public class char_occurence {
    public static int first = -1;
    public static int last = -1;

    public static void findoccurence(String str, int idx, char element){
        
        if (idx == str.length()) {
            System.out.println("First Occurence : "+first);
            System.out.println("Last Occurence : "+last);
            return;
        }
        char currchar = str.charAt(idx);
        if (currchar == element) {
            if (first == -1) {
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findoccurence(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "abbcaddaeraah";
        findoccurence(str,0,'a');
    }
}
