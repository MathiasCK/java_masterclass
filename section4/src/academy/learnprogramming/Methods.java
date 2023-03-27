package academy.learnprogramming;

public class Methods {

    public static void main(String[] args) {

        String first = calcScore(true, 500, 6, 200);
        String second = calcScore(false, 100, 12, 400);

        System.out.println(first);
        System.out.println(second);

        int playerPosition = calculateHighScorePosition(500);
        String playerScore = displayHighScorePosition("Mathias", playerPosition);
        System.out.println(playerScore);
    }

    public static String calcScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (!gameOver) return "Game is not over";

        int finalScore = score + (levelCompleted * bonus);
        return "finalScore: " + finalScore;
    }

    public static String displayHighScorePosition(String name, int position) {
        String letters = getCorrectLetters(position);
        return name + " managed to get into " + position + letters + " on the scoreboard";
    }

    public static String getCorrectLetters(int number) {
        switch (number) {
            case 1:
                return "st";
            case 2:
               return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}

