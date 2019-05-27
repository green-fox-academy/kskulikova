
public class TennisGame1 implements TennisGame {

  private int score1 = 0;
  private int score2 = 0;
  private String player1;
  private String player2;
  private int gap;

  TennisGame1(String player1, String player2) {
    this.player1 = "player1";
    this.player2 = "player2";
  }

  public void wonPoint(String playerName) {
    if (playerName.equals("player1")) {
      score1 += 1;
    } else {
      score2 += 1;
    }
    gap = Math.abs(score1 - score2);
  }

  @Override
  public String getScore() {
    if (reachedFourty()) {
      if (isGapEnough()) {
        return getWinner();
      } else if (isEqual()) {
        return "Deuce";
      } else {
        return "Advantage " + ((score1 > score2) ? player1 : player2);
      }
    } else if (isEqual()) {
      return getSetScore(score1) + "-All";
    } else {
      return getSetScore(score1) + "-" + getSetScore(score2);
    }
  }


  private boolean reachedFourty() {
    return (score1 >= 4 || score2 >= 4);
  }

  private boolean isGapEnough() {
    return (gap >= 2);
  }

  private String getWinner() {

    return "Win for " + ((score1 > score2) ? player1 : player2);
  }

  private boolean isEqual() {
    return score1 == score2;
  }

  private String getSetScore(int score) {
    switch (score) {
      case 0:
        return "Love";
      case 1:
        return "Fifteen";
      case 2:
        return "Thirty";
      case 3:
        return "Forty";
      default:
        return "Deuce";
    }
  }
}