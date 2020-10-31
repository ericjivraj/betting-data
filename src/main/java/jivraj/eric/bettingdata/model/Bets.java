package jivraj.eric.bettingdata.model;

/** This class forms part of the model layer
 * This is the Bets class and it is an object that holds a collection of Bet objects
 */
public class Bets
{
  private Bet[] bets;

  /**
   * Empty constructor
   */
  public Bets()
  {

  }

  /** Constructor with parameters
   * @param bets Array of Bet objects
   */
  public Bets(Bet[] bets)
  {
    this.bets = bets;
  }

  /** Getter method for the array of bet objects
   * @return Array of bet objects
   */
  public Bet[] getBets()
  {
    return bets;
  }

  /** Setter method for the array of bet objects
   * @param bets Array of bet objects
   */
  public void setBets(Bet[] bets)
  {
    this.bets = bets;
  }
}
