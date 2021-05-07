package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
        calculateScore(true, 800, levelCompleted, bonus);

        calculateScore(true, 10000, 8, 200);
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScoreResult = calculateHighScorePosition(1500);
        displayHighScorePosition("Cyrano", highScoreResult);
        displayHighScorePosition("Cyrano", 1);
        displayHighScorePosition("Cyrano", calculateHighScorePosition(1500));
        displayHighScorePosition("Doug", calculateHighScorePosition(900));
        displayHighScorePosition("Jasper", calculateHighScorePosition(400));
        displayHighScorePosition("Megan", calculateHighScorePosition(50));



    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;
    }


    public static void displayHighScorePosition(String name, int position) {
        System.out.printf("%s managed to get into position %d on the high score table%n", name, position);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score < 500 && score >= 100){
            return 3;
        } else {
            return 4;
        }

    }

}
