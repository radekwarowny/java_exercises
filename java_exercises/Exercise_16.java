// Name, Age, and Salary

import java.util.Scanner;

public class Exercise_16 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;
        double wage;

        System.out.println("Hello. What is your name? ");
        name = keyboard.nextLine();

        System.out.println("Hi, " + name + "! How old are you? ");
        age = keyboard.nextInt();

        System.out.println("So you're " + age + ", eh? That's not old at all!\nHow much do you make, " + name + "? ");
        wage = keyboard.nextDouble();

        System.out.println(wage + "! I hope that's per hour and not per year! LOL! ");

    }

}