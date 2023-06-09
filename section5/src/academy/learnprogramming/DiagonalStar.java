package academy.learnprogramming;

public class DiagonalStar {

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row == 1 || row == number || col == 1 || col == number) {
                    System.out.print("*");
                    continue;
                }
                if (row == col) {
                    System.out.print("*");
                    continue;
                }
                if (col == (number - row + 1)) {
                    System.out.print("*");
                    continue;
                } else
                    System.out.print(" ");

            }
            System.out.println("");
        }
    }
}
