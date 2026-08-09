// import java.util.Scanner;

// public class JavaArray {

//     public static void main(String[] args) {
//         int citizanAge[] = new int[10];
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the ages");
//         for (int i = 0; i < citizanAge.length; i++) {
//             citizanAge[i] = sc.nextInt();
//         }

//         for (int age : citizanAge) {
//             System.out.println("Age of the citizen is: " + age);

//         }
//         sc.close();
//     }

// }

import java.util.Scanner;

public class JavaArray {

    public static void main(String[] args) {
        int citizanAge[] = { 1, 2, 3, 4, 5, 6 };

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ages");
        for (int i = 0; i < citizanAge.length; i++) {
            citizanAge[i] = sc.nextInt();
        }

        for (int age : citizanAge) {
            System.out.println("Age of the citizen is: " + age);

        }
        sc.close();
    }

}
