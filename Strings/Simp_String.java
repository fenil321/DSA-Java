import java.util.*;

public class Simp_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First Name : ");
        String fname = sc.nextLine();
        System.out.println("The First Name is : "+fname);

        //concatenation
        System.out.print("Enter a Last Name : ");
        String lname = sc.nextLine();
        System.out.println("The Last Name is : "+lname);
        String fullname = fname +" "+ lname;
        System.out.println("The Full Name is : "+fullname);

        //length of string
        System.out.println("The Length of Full Name is : "+fullname.length());

        //CharAt
        System.out.println("Each Character of Fullname: ");
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }

        //compare two string
        if (fname.compareTo(lname) == 0) {
            System.out.println("Strings are Equals");
        }else{
            System.out.println("Strings are Differents");
        }

        //substring
        String sentence = "My name is Heisenberg";
        String name = sentence.substring(11,sentence.length());
        System.out.println("The Substring : "+name);

        sc.close();

    }
}