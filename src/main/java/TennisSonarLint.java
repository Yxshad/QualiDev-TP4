
public class TennisSonarLint implements TennisGame
{
    private int p1Point = 0;
    private int p2Point = 0;

    private String p1Res = "";
    private String p2Res = "";

    public TennisSonarLint(String player1Name, String player2Name) {
    }

    public String getScore1() {
        String score = "";
        if (p1Point == p2Point && p1Point < 4) {
            if (p1Point == 0)
                score = "Love";
            if (p1Point == 1)
                score = "Fifteen";
            if (p1Point == 2)
                score = "Thirty";
            score += "-All";
        }
        if (p1Point == p2Point && p1Point >= 3)
            score = "Deuce";
        return score;
    }

    public String getScore2() {
        String score = "";
        if (p1Point > 0 && p2Point == 0) {
            if (p1Point == 1)
                p1Res = "Fifteen";
            if (p1Point == 2)
                p1Res = "Thirty";
            if (p1Point == 3)
                p1Res = "Forty";

            p2Res = "Love";
            score = p1Res + "-" + p2Res;
        }
        return score;
    }

    public String getScore3() {
        String score = "";
        if (p2Point > 0 && p1Point == 0) {
            if (p2Point == 1)
                p2Res = "Fifteen";
            if (p2Point == 2)
                p2Res = "Thirty";
            if (p2Point == 3)
                p2Res = "Forty";

            p1Res = "Love";
            score = p1Res + "-" + p2Res;
        }
        return score;
    }
    public String getScore4() {
        String score = "";
        if (p1Point > p2Point && p1Point < 4) {
            if (p1Point == 2)
                p1Res = "Thirty";
            if (p1Point == 3)
                p1Res = "Forty";
            if (p2Point == 1)
                p2Res = "Fifteen";
            if (p2Point == 2)
                p2Res = "Thirty";
            score = p1Res + "-" + p2Res;
        }
        return score;
    }

    public String getScore5() {
        String score = "";
        if (p2Point > p1Point && p2Point < 4)
        {
            if (p2Point ==2)
                p2Res ="Thirty";
            if (p2Point ==3)
                p2Res ="Forty";
            if (p1Point ==1)
                p1Res ="Fifteen";
            if (p1Point ==2)
                p1Res ="Thirty";
            score = p1Res + "-" + p2Res;
        }
        return score;}

    public String getScore6() {
        String score = "";
        if (p1Point > p2Point && p2Point >= 3)
        {
            score = "Advantage player1";
        }
        
        if (p2Point > p1Point && p1Point >= 3)
        {
            score = "Advantage player2";
        }
        
        if (p1Point >=4 && p2Point >=0 && (p1Point - p2Point)>=2)
        {
            score = "Win for player1";
        }
        if (p2Point >=4 && p1Point >=0 && (p2Point - p1Point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }
    
    public void setP1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            p1Score();
        }
            
    }
    
    public void setP2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            p2Score();
        }
            
    }
    
    public void p1Score(){
        p1Point++;
    }
    
    public void p2Score(){
        p2Point++;
    }

    public void wonPoint(String player) {
        if (player.equals("player1"))
            p1Score();
        else
            p2Score();
    }
}