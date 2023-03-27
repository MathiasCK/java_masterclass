package academy.learnprogramming;

import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        int counter = 1;
        int min = 0;
        int max = 0;
        boolean isFirst = true;

        Scanner numberScanner = new Scanner(System.in);

        while(counter <= 5) {
            System.out.println("Enter number " + counter + ":");
            boolean hasNextInt = numberScanner.hasNextInt();

            if (!hasNextInt) {
                System.out.println("Only numbers allowed!");
                break;
            }
            int number = numberScanner.nextInt();

            if(isFirst) {
                isFirst = false;
                max = number;
                min = number;
            }

            if(max < number) {
                max = number;
            }

            if(min > number) {
                min = number;
            }

            counter++;
            numberScanner.nextLine();
        }

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
        numberScanner.close();
    }
}
