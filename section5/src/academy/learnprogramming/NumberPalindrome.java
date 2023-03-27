package academy.learnprogramming;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int copynumber = number;
        int reversed = 0;

        while(number != 0) {

            int digit = number % 10;
            reversed = reversed * 10 + digit;

            number /= 10;
        }

        return copynumber == reversed;
    }
}
