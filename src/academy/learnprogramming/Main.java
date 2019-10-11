package academy.learnprogramming;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        
        System.out.println("Final Score: " + highScore); 
        
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println("Final Score: " + highScore);
        
        displayHighScorePosition("Brayden", calculateHighScorePosition(1500));
        displayHighScorePosition("Brayden", calculateHighScorePosition(900));
        displayHighScorePosition("Brayden", calculateHighScorePosition(400));
        displayHighScorePosition("Brayden", calculateHighScorePosition(50));
        displayHighScorePosition("Brayden", calculateHighScorePosition(1000));
        displayHighScorePosition("Brayden", calculateHighScorePosition(500));
        displayHighScorePosition("Brayden", calculateHighScorePosition(100));
        displayHighScorePosition("Brayden", calculateHighScorePosition(99));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
 
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }

    }
    // A void method is sometimes referred to as a procedure.
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }
    // A method generally speaking can also be known as a function, and the two terms can be used interchangeably.
    public static int calculateHighScorePosition(int score) {
        // if (score >= 1000) {
        //     return 1;
        // } else if (score >= 500) {
        //     return 2;
        // } else if (score >= 100) {
        //     return 3;
        // }
        // return 4;
        int position = 4; // assuming position 4 will be returned

        if(score >=1000){
            position = 1;
        } else if(score >= 500) {
            position = 2;
        } else if(score >= 100) {
            position = 3;
        }
        return position;
    }
}