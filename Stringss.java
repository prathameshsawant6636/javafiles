import java.util.Scanner;

public class Stringss {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // name = sc.next();

        // System.out.print("Enter your surname: ");
        // String surname = sc.next();

        // String fullname = name + " " + surname;

        // System.out.println("Full Name: " + fullname.toUpperCase());

        String txt1 = "Please   where'locate'  occures";
        System.out.println(txt1.indexOf("locate"));

        String txt2 = "Hello";

        System.out.println(txt2.charAt(0));
        System.out.println(txt2.charAt(4));

        sc.close();
    }
}
