import java.util.Scanner;
import java.time.Year;

public class Agecal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Brith year:");
        int birthYear = sc.nextInt();

        int age = Year.now().getValue() - birthYear;

        System.out.println("My age is:" + age);
        sc.close();
    }

}
