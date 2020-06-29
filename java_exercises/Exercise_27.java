// A Little Quiz

import java.util.Scanner;

public class Exercise_27 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String answer;
        int score = 0;

        System.out.print("Are you ready for a quiz? (Y/N)");
        answer = keyboard.nextLine();

        if (answer.equals("Y")) {
            System.out.println("Okay, here it comes!");
        } else {
            System.out.println("Okay, see you next time.");
            System.exit(0);
        }

        System.out.println("Q1) What is the capital of Alaska? ");
        System.out.println("\t1) Melbourne");
        System.out.println("\t2) Anchorage");
        System.out.println("\t3) Juneau");
        System.out.println();

        System.out.print("> ");
        answer = keyboard.nextLine();

        if (answer.equals("1")) {
            System.out.println("Incorrect answer.");
        } else if (answer.equals("2")) {
            System.out.println("Correct answer.");
            score += 1;
        } else if (answer.equals("3")) {
            System.out.println("Incorrect answer.");
        } else {
            System.out.println("Input Error");
        }

        System.out.println("Q2) Can you store the value of \"cat\" in a variable of type int?");
        System.out.println("\t1) yes");
        System.out.println("\t2) no");
        System.out.println();

        System.out.print("> ");
        answer = keyboard.nextLine();

        if (answer.equals("yes")) {
            System.out.println("Incorrect answer.");
        } else if (answer.equals("no")) {
            System.out.println("Correct answer.");
            score += 1;
        } else {
            System.out.println("Input Error");
        }

        System.out.println("Q3) What is the result of 9+6/3? ");
        System.out.println("\t1) 5");
        System.out.println("\t2) 11");
        System.out.println("\t3) 15/3");
        System.out.println();

        System.out.print("> ");
        answer = keyboard.nextLine();

        if (answer.equals("1")) {
            System.out.println("Correct answer.");
            score += 1;
        } else if (answer.equals("2")) {
            System.out.println("Incorrect answer.");
        } else if (answer.equals("3")) {
            System.out.println("Correct answer.");
            score += 1;
        } else {
            System.out.println("Input Error");
        }

        System.out.println("Overall, you got " + score + " out of 3 correct.");
        System.out.println("Thanks for playing! ");

    }
}