import java.util.Scanner;

public class Input {
    public static void main(String args[]) {
        int age;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        name = sc.nextLine();

        System.out.println("Enter the age:");
        age = sc.nextInt();

        System.err.println("My name is " + name + ". My age is " + age);
        sc.close();

    }
}
