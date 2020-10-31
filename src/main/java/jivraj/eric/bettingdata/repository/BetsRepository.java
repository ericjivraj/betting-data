package jivraj.eric.bettingdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jivraj.eric.bettingdata.model.Bet;

/** This class forms part of the repository layer
 * Interface class that serves as a DAO (Data Access Object)
 * This class allows the communication between the application and the database
 */
public interface BetsRepository extends JpaRepository<Bet, Long>
{
  /** This method is used to query the database to find all the bets filtered by game name
   * @param game Game name
   * @return List of bet objects
   */
  List<Bet> findAllByGame(String game);

  /** This method is used to query the database to find all the bets filtered by client ID
   * @param clientId Client ID
   * @return List of bet objects
   */
  List<Bet> findAllByClientid(int clientId);

  /** This method is used to query the database to find all the bets filtered by date the best was made
   * @param date Date the bet was made
   * @return List of bet objects
   */
  List<Bet> findAllByDate(String date);
}
