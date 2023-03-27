package academy.learnprogramming;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner numberScanner = new Scanner(System.in);

        int numbersEntered = 0;
        double sum = 0;
        double avg = 0;

        while(true) {
            System.out.println("Enter number ");
            boolean isInt = numberScanner.hasNextInt();

            if (!isInt) break;

            int number = numberScanner.nextInt();
            sum += number;
            numbersEntered++;
            numberScanner.nextLine();
        }

        if(numbersEntered > 1) {
            avg = Math.round(sum / numbersEntered);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
