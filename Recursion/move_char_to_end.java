public class move_char_to_end {
    public static void moveallx(String str, int idx, int count, String newString){
        //base case
        if (idx==str.length()) {
            for (int i = 0; i < count; i++) {
                newString+='x';
            }
            System.out.print(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if (currchar == 'x') {
            count++;
            moveallx(str, idx+1, count, newString);
        }
        else{
            newString += currchar;
            moveallx(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbxxcd";
        moveallx(str,0,0,"");
    }
}
