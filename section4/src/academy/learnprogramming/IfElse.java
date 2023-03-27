package academy.learnprogramming;

public class IfElse {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score +  (levelCompleted * bonus);
            System.out.println("finalScore: " + finalScore);
        }

        score += 500;
        levelCompleted += 3;
        bonus += 100;

        if (gameOver) {
            int finalScore = score +  (levelCompleted * bonus);
            System.out.println("finalScore: " + finalScore);
        }
    }
}
