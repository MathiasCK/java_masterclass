package academy.learnprogramming;


public class NumberToWords {

    public static void numberToWords(int number) {
        if(number < 0) System.out.println("Invalid Value");

        number = reverse(number);

        while(number >= 0) {
            int digit = number % 10;
            switch(digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Not a valid number");
                    break;
            }
            number /= 10;
        }
    }

    public static int getDigitCount(int num) {
        if (num < 0) return -1;

        int length = 0;
        long temp = 1;

        if(num == 0) {
            length = 1;
            return length;
        }

        while (temp <= num) {
            length++;
            temp *= 10;
        }
        return length;
    }

    public static int reverse(int num) {
        int reversed = 0;
        while(num != 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;

            num /= 10;
        }
        return reversed;
    }

}
