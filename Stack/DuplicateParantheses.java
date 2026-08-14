import java.util.Stack;

public class DuplicateParantheses {
    public static boolean isDuplicate(String str) {
        Stack<Character> s =new Stack<>();

        for(int i=0;i<str.length(); i++){
            char ch = str.charAt(i);

            //closing
            if(ch==')'){
                int count = 0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true; // Duplicate parentheses found
                }else{
                    s.pop(); // Remove the opening parenthesis
                }
            } else{
                //opening, operator, operand
                s.push(ch);
            }
        }
        return false; // No duplicate parentheses found
    }
    public static void main(String[] args) {
        String str = "((a+b))";
        String str1 = "(a+b)";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
    }
}
