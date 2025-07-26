public class remov_duplicate {
    public static boolean[] map = new boolean[26];
    public static void removeallduplicate(String str, int idx, String newString){
        if (idx == str.length()) {
            System.out.print(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            removeallduplicate(str, idx+1, newString);
        }
        else{
            newString += currchar;
            map[currchar - 'a'] = true;
            removeallduplicate(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccdeefgg";
        removeallduplicate(str,0,"");
    }
}
