package jivraj.eric.bettingdata.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class BetTest {
  private Bet mockBet;
  private static final int NUMBETS = 5;
  private static final String GAME = "BlackJack";
  private static final double STAKE = 100.00;
  private static final double RETURNS = 10.00;
  private static final int CLIENTID = 1;
  private static final String DATE = "2020-05-17";

  @Test
  public void testConstructor() {
    Bet actualBet = new Bet(10, "Game", 10.0, 10.0, 1, "2020-03-01");
    assertEquals("Game", actualBet.getGame());
    assertEquals(1, actualBet.getClientid());
    assertEquals(10, actualBet.getNumbets());
    assertEquals(10.0, actualBet.getReturns(), 0.0);
    assertEquals(10.0, actualBet.getStake(), 0.0);
    assertEquals("2020-03-01", actualBet.getDate());
  }

  @Test
  public void testSetId() {
    Bet bet = new Bet();
    bet.setId(123L);
    assertEquals(123L, bet.getId().longValue());
  }

  @Test
  public void testSetNumbets() {
    Bet bet = new Bet();
    bet.setNumbets(10);
    assertEquals(10, bet.getNumbets());
  }

  @Test
  public void testSetGame() {
    Bet bet = new Bet();
    bet.setGame("Game");
    assertEquals("Game", bet.getGame());
  }

  @Test
  public void testSetStake() {
    Bet bet = new Bet();
    bet.setStake(10.0);
    assertEquals(10.0, bet.getStake(), 0.0);
  }

  @Test
  public void testSetReturns() {
    Bet bet = new Bet();
    bet.setReturns(10.0);
    assertEquals(10.0, bet.getReturns(), 0.0);
  }

  @Test
  public void testSetClientid() {
    Bet bet = new Bet();
    bet.setClientid(1);
    assertEquals(1, bet.getClientid());
  }

  @Test
  public void testSetDate() {
    Bet bet = new Bet();
    bet.setDate("2020-03-01");
    assertEquals("2020-03-01", bet.getDate());
  }

  @Test
  public void testCreateEmptyBet() {
    givenEmptyBet();
    verifyEmptyBet();
  }

  @Test
  public void testCreateBet() {
    givenBet();
    verifyNumBetsOrClientID(mockBet.getNumbets(), NUMBETS);
    verifyGameOrDate(mockBet.getGame(), GAME);
    verifyStakeOrReturns(mockBet.getStake(), STAKE);
    verifyStakeOrReturns(mockBet.getReturns(), RETURNS);
    verifyNumBetsOrClientID(mockBet.getClientid(), CLIENTID);
    verifyGameOrDate(mockBet.getDate(), DATE);
  }

  private void givenBet() {
    mockBet = new Bet(NUMBETS, GAME, STAKE, RETURNS, CLIENTID, DATE);
  }

  private void givenEmptyBet() {
    mockBet = new Bet();
  }

  private void verifyEmptyBet() {
    assertNotNull(mockBet);
  }

  private void verifyNumBetsOrClientID(int expectedValue, int actualValue) {
    assertEquals(expectedValue, actualValue);
  }

  private void verifyStakeOrReturns(double expectedValue, double actualValue) {
    assertEquals(expectedValue, actualValue);
  }

  private void verifyGameOrDate(String expectedValue, String actualValue) {
    assertEquals(expectedValue, actualValue);
  }
}
