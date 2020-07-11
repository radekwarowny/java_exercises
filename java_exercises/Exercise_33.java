// Choose Your Own Adventure!

import java.util.Scanner;

public class Exercise_33 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
        System.out.println();

        System.out.println("You are in a creepy house! Would you like to go \"upstarts\" or into the \"kitchen\"?");

        String answer = keyboard.nextLine();

        if (answer.equals("kitchen")) {
            System.out.println(
                    "There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. you may open the \"refrigerator\" or look in a \"cabinet\".");
        }

        if (answer.equals("upstairs")) {

        }

    }
}