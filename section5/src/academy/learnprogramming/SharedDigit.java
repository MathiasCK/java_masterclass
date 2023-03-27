package academy.learnprogramming;

public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {

        if(!isInRange(num1) || !isInRange(num2)) return false;

        int a1 = num1 % 10;
        int b1 = num2 % 10;

        int a2 = num1 / 10;
        int b2 = num2 / 10;

        return (a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2);
    }

    public static boolean isInRange(int number) {
        return (number >= 10 && number <= 99);
    }
}
