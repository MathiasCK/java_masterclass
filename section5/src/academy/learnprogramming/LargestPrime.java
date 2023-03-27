package academy.learnprogramming;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;

        int divider = 2;

        while (divider < number) {
            if (number % divider != 0) {
                divider++;
            } else {
                number = number / divider;
                divider = 2;
            }
        }
        return number;

    }
}
