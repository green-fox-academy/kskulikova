public class TennisGame2 implements TennisGame {

  private int P1point = 0;
  private int P2point = 0;

  private String player1Name;
  private String player2Name;


  TennisGame2(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public String getScore() {
    String score = "";
    if (P1point == P2point) {
      if (P1point < 4) {
        score = getSetScore(P1point);
        score += "-All";
      }
      if (P1point > 3) {
        score = "Deuce";
      }
    }
    if ((P1point > 0 && P2point == 0) || (P2point > 0 && P1point == 0)
        || (P1point > P2point && P1point < 4) || (P2point > P1point && P2point < 4)) {
      score = getSetScore(P1point) + "-" + getSetScore(P2point);
    }

    if ((P1point > P2point && P2point >= 3) || (P2point > P1point && P1point >= 3)) {
      score = "Advantage " + compareScore();
    }

    if (((P1point >= 4 && P2point >= 0) || (P2point >= 4 && P1point >= 0))
        && Math.abs(P1point - P2point) >= 2) {
      score = "Win for " + compareScore();
    }
    return score;
  }

  public void wonPoint(String player) {
    if (player.equals("player1")) {
      P1point++;
    } else {
      P2point++;
    }
  }

  private String compareScore() {
    return (P1point > P2point) ? player1Name : player2Name;
  }

  private String getSetScore(int point) {
    String score = "";
    switch (point) {
      case 0:
        score = "Love";
        break;
      case 1:
        score = "Fifteen";
        break;
      case 2:
        score = "Thirty";
        break;
      case 3:
        score = "Forty";
    }
    return score;
  }
}

