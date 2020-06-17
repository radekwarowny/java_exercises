// BMI Calculator

import java.util.Scanner;

public class Exercise_20 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double height, weight, bmi;

        System.out.print("Your height in m: ");
        height = keyboard.nextDouble();

        System.out.print("Your weight in kg: ");
        weight = keyboard.nextDouble();

        System.out.println();

        bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);
    }
}