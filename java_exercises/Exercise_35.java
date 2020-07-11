// Two More Questions

import java.util.Scanner;

public class Exercise_35 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String thing = "";

        System.out.println("TWO MORE QUESTIONS, BABY!");
        System.out.println();

        System.out.println("Think of something and I'll try to guess it!");
        System.out.println();
        System.out.println("Question 1) Does it stay inside or outside or both? ");
        String answer_1 = keyboard.next();
        System.out.println("Question 2) Is it a living thing? ");
        String answer_2 = keyboard.next();

        if (answer_1.equals("inside") && answer_2.equals("yes")) {
            thing = "houseplant";
        }
        if (answer_1.equals("inside") && answer_2.equals("no")) {
            thing = "shower curtain";
        }
        if (answer_1.equals("outside") && answer_2.equals("yes")) {
            thing = "bison";
        }
        if (answer_1.equals("outside") && answer_2.equals("no")) {
            thing = "billboard";
        }
        if (answer_1.equals("both") && answer_2.equals("yes")) {
            thing = "dog";
        }
        if (answer_1.equals("both") && answer_2.equals("no")) {
            thing = "cell phone";
        }

        System.out.println("Then what eles could you be thinking of besides a " + thing + "!");

    }
}