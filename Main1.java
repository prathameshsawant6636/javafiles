// class Student {
// String name;
// int rollno;
// int age;
// String mail;

// void student(String name, int rollNo, int age, String mail) {
// System.out.println("Student name is :" + this.name);
// System.out.println("Student rollno is :" + this.rollno);
// System.out.println("Student age is :" + this.age);
// System.out.println("Student mail is :" + this.mail);

// }
// }

// public class Main1 {
// public static void main(String[] args) {
// Student s1 = new Student();
// s1.name = "Prathamesh";
// s1.rollno = 67;
// s1.age = 20;
// s1.mail = "parthameshsawantsaegd@gmail.com";

// s1.student(s1.name, s1.rollno, s1.age, s1.mail);

// }

// }
public class Main1 {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Prathamesh";
        s1.rollno = 67;
        s1.age = 20;
        s1.mail = "parthameshsawantsaegd@gmail.com";

        s1.student();
    }
}