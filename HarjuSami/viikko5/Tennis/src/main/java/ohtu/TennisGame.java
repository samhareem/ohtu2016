package ohtu;

public class TennisGame {
    
    private int player1score = 0;
    private int player2score = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name)) { player1score += 1; }
        else if (playerName.equals(player2Name)) { player2score += 1; }
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        if (player1score==player2score) {
            score = getStringForEvenScore();
        }
        else if (player1score>=4 || player2score>=4)
        {
            score = getStringEndGame();
        }
        else
        {
            score = getStringScore(player1score) + " - " + getStringScore(player2score);
        }
        return score;
    }

    private String getStringScore(int score) {
        String scoreString = "";
        switch(score) {
            case 0:
                scoreString = "Love";
                break;
            case 1:
                scoreString = "Fifteen";
                break;
            case 2:
                scoreString = " Thirty";
                break;
            case 3:
                scoreString = "Forty";
                break;
        }
        return scoreString;
    }

    private String getStringEndGame() {
        String score;
        int minusResult = player1score-player2score;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private String getStringForEvenScore() {
        String score;
        switch (player1score)
        {
            case 0:
                    score = "Love-All";
                break;
            case 1:
                    score = "Fifteen-All";
                break;
            case 2:
                    score = "Thirty-All";
                break;
            case 3:
                    score = "Forty-All";
                break;
            default:
                    score = "Deuce";
                break;

        }
        return score;
    }
}