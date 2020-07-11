// BMI Categories

import java.util.Scanner;
import static java.lang.System.out;

public class Exercise_36 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Your height in m: ");
        float height = keyboard.nextFloat();

        out.print("Your weight in kg: ");
        float weight = keyboard.nextFloat();

        float bmi = weight / (height * height);
        String category = "";

        out.println("Your BMI is " + bmi);

        if (bmi < 18.5) {
            category = "underweight";
        }
        if (bmi > 18.5 && bmi < 24.9) {
            category = "normal weight";
        }
        if (bmi > 25.0 && bmi < 29.9) {
            category = "overweight";
        }
        if (bmi > 30.0) {
            category = "obese";
        }

        out.println("BMI Category: " + category);

    }
}