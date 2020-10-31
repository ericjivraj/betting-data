package jivraj.eric.bettingdata.model;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class BetsTest {
  private Bets mockBets;

  @Test
  public void testSetBets() {
    Bet bet = new Bet();
    Bet bet1 = new Bet();
    Bet[] betArray = new Bet[]{bet, bet1, new Bet()};
    Bets bets = new Bets();
    bets.setBets(betArray);
    assertSame(betArray, bets.getBets());
  }

  @Test
  public void testCreateEmptyBets() {
    givenEmptyBet();
    verifyEmptyBet();
  }

  private void givenEmptyBet() {
    mockBets = new Bets();
  }

  private void verifyEmptyBet() {
    assertNotNull(mockBets);
  }
}
