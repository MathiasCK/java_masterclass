package academy.learnprogramming;

import java.util.Scanner;

public class ReadingUserInputChallange {

    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter <= 10) {
            System.out.println("Enter number " + counter + ":");
            boolean hasNextInt = numberScanner.hasNextInt();

            if (hasNextInt) {
                int number = numberScanner.nextInt();
                sum += number;
                counter++;
            } else {
                System.out.println("Only numbers allowed!");
            }
            numberScanner.nextLine();

        }
        System.out.println("Total sum: " + sum);
        numberScanner.close();
    }
}
