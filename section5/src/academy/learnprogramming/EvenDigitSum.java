package academy.learnprogramming;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if(number < 0) return -1;

        int sumOfEvenNums = 0;

        while(number > 0) {

            int digit = number % 10;
            if(digit % 2 == 0) {
                sumOfEvenNums = sumOfEvenNums + digit;
            }
            number /= 10;
        }
        return sumOfEvenNums;
    }
}
