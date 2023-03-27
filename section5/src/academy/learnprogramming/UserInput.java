package academy.learnprogramming;

import java.util.Scanner;
import java.util.Date;

public class UserInput {

    public static void main(String[] args) {

        Date date = new Date();
        int year = date.getYear() + 1900;

        Scanner userScanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = userScanner.nextLine();

        System.out.println("Welcome " + name + ", what is your year of birth?");
        boolean hasNextInt = userScanner.hasNextInt(); // Next input is integer

        if(!hasNextInt) {
            System.out.println("Only numbers allowed!");
            return;
        }

        int bYear = userScanner.nextInt();
        int age = year - bYear;

        if(!isValidAge(age)) {
            System.out.println("Invalid year of birth!");
            return;
        }

        System.out.println(name + " is " + age + " years old");
        userScanner.close();
    }

    public static boolean isValidAge(int number) {
        return number <= 120 && number > 0;
    }
}
