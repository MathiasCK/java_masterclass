package academy.learnprogramming;

public class For {

    public static void main(String[] args) {

        for (int i = 2; i <= 8; i++) {
            System.out.println(calculateInterest(10000, i));
        }

        System.out.println(findPrimeNumbers(0, 20));

        System.out.println(threeAndFive(1, 100));
    }

    public static String calculateInterest(double amount, double rate) {
        return amount + " with an interest of " + rate + "% = " + amount * (rate / 100);
    }

    public static String findPrimeNumbers(int start, int end) {
        int count = 0;

        for (int i = start; i <= end; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
            }
            if (count == 3) break;
        }
        return "Prime Numbers found between " + start + " and " + end + " = " + count;
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) return false;
        }

        return true;
    }

    public static String threeAndFive(int start, int end) {
        int count = 0;
        int sum = 0;

        for(int i = start; i <= end; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
                sum = sum + i;
            }
        }
        return "Found " + count + " numbers between " + start + " and "
                + end + " that were divisible with 5 and 3" +
                ". The total sum was " + sum;
    }
}
