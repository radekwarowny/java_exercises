// Age Message 3

import java.util.Scanner;

public class Exercise_34 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Your name: ");
        name = keyboard.nextLine();

        System.out.print("Your age: ");
        age = keyboard.nextInt();

        System.out.println();

        if (age < 16) {
            System.out.println("You can't drive.");
        }
        if (age >= 16 && age <= 17) {
            System.out.println("You can drive but not vote.");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("You can vote but not rent a car.");
        }
        if (age >= 25) {
            System.out.println("You can do pretty much anything.");
        }

    }
}