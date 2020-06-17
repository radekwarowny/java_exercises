// A Dumb Calculator

import java.util.Scanner;

public class Exercise_19 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double num1, num2, num3;

        System.out.print("What is your first number: ");
        num1 = keyboard.nextDouble();

        System.out.print("What is your second number: ");
        num2 = keyboard.nextDouble();

        System.out.print("What is your third number: ");
        num3 = keyboard.nextDouble();

        System.out.println();

        System.out.print("(" + num1 + " + " + num2 + " + " + num3 + ") / 2 is ... " + ((num1 + num2 + num3) / 2));
    }
}