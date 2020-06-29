// Space Boxing

import java.util.Scanner;

public class Exercise_26 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int weight;
        int planet;
        double new_weight = 0;

        System.out.print("Please enter your current earth weight: ");
        weight = keyboard.nextInt();

        System.out.println("I have information for the follwing plannets: ");
        System.out.println("\t1. Venus    2. Mars    3. Jupiter");
        System.out.println("\t4. Saturn   5. Uranus  6. Neptune");

        System.out.print("Which palnet are you visiting? ");
        planet = keyboard.nextInt();

        System.out.println();

        if (planet == 1) {

            new_weight = weight * 0.78;
        } else if (planet == 2) {
            new_weight = weight * 0.39;
        } else if (planet == 3) {
            new_weight = weight * 2.67;
        } else if (planet == 4) {
            new_weight = weight * 1.17;
        } else if (planet == 5) {
            new_weight = weight * 1.05;
        } else if (planet == 6) {
            new_weight = weight * 1.23;
        } else {
            System.out.print("Input Error");
        }

        System.out.println("Your weight would be " + new_weight + " pounds on that planet. ");

        keyboard.close();

    }
}