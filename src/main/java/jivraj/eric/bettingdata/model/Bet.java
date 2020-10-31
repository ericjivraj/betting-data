package jivraj.eric.bettingdata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** This class forms part of the model layer
 * This is the Bet class and it is an object that represents the information contained in a bet
 * This class is meant to mirror/map what the table Bet in MySQL database would look like
 */
@Entity
public class Bet
{
  private @Id @GeneratedValue Long id;
  private int numbets;
  private String game;
  private double stake;
  private double returns;
  private int clientid;
  private String date;

  /**
   * Empty constructor
   */
  public Bet()
  {

  }

  /** Constructor with parameters
   * @param numbets Number of bets
   * @param game Game being played
   * @param stake Stake that was put forward
   * @param returns Returns made from that stake
   * @param clientid Client ID of the client betting
   * @param date Date in which the bet was made
   */
  public Bet(int numbets, String game, double stake, double returns, int clientid, String date)
  {
    this.numbets = numbets;
    this.game = game;
    this.stake = stake;
    this.returns = returns;
    this.clientid = clientid;
    this.date = date;
  }

  /** Getter method for the ID
   * @return ID of the record in the database associated to a given bet data
   */
  public Long getId()
  {
    return id;
  }

  /** Setter method for the ID
   * @param id ID of the record in the database associated to a given bet data
   */
  public void setId(Long id)
  {
    this.id = id;
  }

  /** Getter method for the number of bets
   * @return Number of bets
   */
  public int getNumbets()
  {
    return numbets;
  }

  /** Setter method for the number of bets
   * @param numbets Number of bets
   */
  public void setNumbets(int numbets)
  {
    this.numbets = numbets;
  }

  /** Getter method for the game name
   * @return Game name
   */
  public String getGame()
  {
    return game;
  }

  /** Setter method for the game name
   * @param game Game name
   */
  public void setGame(String game)
  {
    this.game = game;
  }

  /** Getter method for the stake gambled
   * @return Stake gambled
   */
  public double getStake()
  {
    return stake;
  }

  /** Setter method for the stake gambled
   * @param stake Stake gambled
   */
  public void setStake(double stake)
  {
    this.stake = stake;
  }

  /** Getter method for the returns made
   * @return Returns made
   */
  public double getReturns()
  {
    return returns;
  }

  /** Setter method for the returns made
   * @param returns Returns made
   */
  public void setReturns(double returns)
  {
    this.returns = returns;
  }

  /** Getter method for the client ID
   * @return Client ID
   */
  public int getClientid()
  {
    return clientid;
  }

  /** Setter method for the client ID
   * @param clientid Client ID
   */
  public void setClientid(int clientid)
  {
    this.clientid = clientid;
  }

  /** Getter method for the date the bet was made
   * @return Date bet was made
   */
  public String getDate()
  {
    return date;
  }

  /** Setter method for the date the bet was made
   * @param date Date bet was made
   */
  public void setDate(String date)
  {
    this.date = date;
  }
}