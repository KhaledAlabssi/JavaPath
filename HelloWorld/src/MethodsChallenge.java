public class MethodsChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Khaled", 5);
        System.out.println(calculateHighScorePosition(766));
        System.out.println(calculateHighScorePosition(206));
        System.out.println(calculateHighScorePosition(1025));



    }

    public static void displayHighScorePosition (String playerName, int playerScore) {
        System.out.println(playerName + " managed to get into position " + playerScore + " on high score list.");

    }
    public  static  int calculateHighScorePosition (int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }


}
