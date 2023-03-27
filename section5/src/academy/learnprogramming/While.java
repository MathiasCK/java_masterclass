package academy.learnprogramming;

public class While {

    public static void main(String[] args) {

        printEvenNumbers(10, 100);
        System.out.println(sumDigits(111));
    }

    public static void printEvenNumbers(int start, int end) {
        int oddNumbers = 0;

        while(start <= end) {
            start++;
            if(!isEvenNumber(start)) {
                oddNumbers++;
                continue;
            }
            System.out.println("Even number " + start);
            if(oddNumbers > 5) break;
        }
    }

    public static boolean isEvenNumber(int value) {
            if (value < 0) return false;

            return value % 2 == 0;
    }

    public static String sumDigits(int number) {
        if (number < 10) return "Invalid";

        int sum = 0;
        while(number > 0) {
            sum = sum + number % 10;
            System.out.println("Sum " + sum);
            number = number / 10;
            System.out.println("Number " + number);
        }
       return "The sum of " + number + " is " + sum;
    }

    public static void whileLoops() {

        int count = 0;

        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count != 5);
    }
}
