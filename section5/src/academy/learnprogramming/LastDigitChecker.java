package academy.learnprogramming;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if(!isValid(num1) || !isValid(num2) || !isValid(num3)) return false;

        int x = num1 % 10;
        int y = num2 % 10;
        int z = num3 % 10;

        return x == y || x == z || y == z;

    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }
}
