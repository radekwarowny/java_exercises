// More User Input of Data

import java.util.Scanner;

public class Exercise_17 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String firstName, lastName, grade, gpa, login, student_id;

        System.out.println("Please enter the following information so I can sell it for a profit! ");

        System.out.print("First name: ");
        firstName = keyboard.next();

        System.out.print("Last name: ");
        lastName = keyboard.next();

        System.out.print("Grade (9 - 12): ");
        grade = keyboard.next();

        System.out.print("Student ID: ");
        student_id = keyboard.next();

        System.out.print("Login: ");
        login = keyboard.next();

        System.out.print("GPA (0.0-4.4): ");
        gpa = keyboard.next();

        System.out.println("Your information: ");
        System.out.println("\tLogin: " + login);
        System.out.println("\tID: " + student_id);
        System.out.println("\tGPA: " + gpa);
        System.out.println("\tGrade: " + grade);

    }
}