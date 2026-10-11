package lab4.Q1andQ2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentScannerTest {
    public static void main(String[] args) {
        double gpa;
        int age;
        Scanner scan = new Scanner(System.in);

        try {
        System.out.print("Enter age: ");
        age = scan.nextInt();
        System.out.print("Enter GPA: ");
        gpa = scan.nextDouble();

        PSUStudent p1 = new UndergradStudent(age, gpa);
        System.out.println(p1.getAge());
        System.out.println(p1.getGPA());
        PSUStudent p2 = new GradStudent(age, gpa);
        System.out.println(p2.getAge());
        System.out.println(p2.getGPA());

        } catch (IllegalArgumentException e) {
            System.out.println("Error age cannot be negative or gpa cannot be less than 0 or more than 4");
        } catch (InputMismatchException e) {
            System.out.println("Error");
        } finally {
            scan.close();
        }
    }
}
