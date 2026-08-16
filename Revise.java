// package

import java.util.Scanner;

public class Revise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a random number: ");
        int x = sc.nextInt();

        System.out.println("incremented value: " + (x++));
        sc.close();
    }
}
