public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Heisenberg");
        
        //charAt
        System.out.println(sb.charAt(0));
        //set charAt at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insert
        sb.insert(10, 'H');
        System.out.println(sb);

        //delete
        sb.delete(10, 11); //H
        System.out.println(sb);

        //append
        sb.append("HAT");
        System.out.println(sb);
    }
}
