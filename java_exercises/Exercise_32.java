// Twenty Questions... well, acutally just Two

import java.util.Scanner;

public class Exercise_32 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String type;
        String size;
        String answer = "";

        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.");
        System.out.println();

        System.out.println("Question 1) Is it animal, vegetable, or mineral?");

        System.out.print("> ");
        type = keyboard.nextLine();

        System.out.println("Question 2) Is it bigger then a breadbox?");

        System.out.print("> ");
        size = keyboard.nextLine();

        if (type.equals("animal")) {
            if (size.equals("yes")) {
                answer = "squirrel";
            }
        }
        if (type.equals("animal")) {
            if (size.equals("no")) {
                answer = "moos";
            }
        }
        if (type.equals("vegetable")) {
            if (size.equals("yes")) {
                answer = "carrot";
            }
        }
        if (type.equals("vegetable")) {
            if (size.equals("no")) {
                answer = "watermelon";
            }
        }
        if (type.equals("mineral")) {
            if (size.equals("yes")) {
                answer = "paper clip";
            }
        }
        if (type.equals("mineral")) {
            if (size.equals("no")) {
                answer = "Camaro";
            }
        }

        System.out.println("My guess is that you are thinking of a " + answer + ".");
        System.out.println("I would ask you if I'm right, but I don't actually care.");

    }
}