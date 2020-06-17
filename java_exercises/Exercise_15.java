// The Forgetful Machine

import java.util.Scanner;

public class Exercise_15 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String word, second_word;
        int number, second_number;

        System.out.println("Give me a word!");
        word = keyboard.nextLine();

        System.out.println("Give me a second word!");
        second_word = keyboard.nextLine();

        System.out.println("Great, now your favourite number? ");
        number = keyboard.nextInt();

        System.out.println("And your second-favourite number...");
        second_number = keyboard.nextInt();

        System.out.println("Whew! Wasn't that fun? ");

    }

}