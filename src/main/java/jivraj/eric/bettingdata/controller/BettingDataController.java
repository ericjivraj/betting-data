package jivraj.eric.bettingdata.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.databind.ObjectMapper;

import jivraj.eric.bettingdata.model.Bet;
import jivraj.eric.bettingdata.model.Bets;
import jivraj.eric.bettingdata.repository.BetsRepository;

/** This class forms part of the controller layer
 * This object represents the router controller that handles requests and responses associated to endpoints for views/requests
 */
@Controller
public class BettingDataController
{
  @Autowired
  private BetsRepository repository;

  /** Default method that gets called when the web app starts running
   * @return Main Menu View which is the initial default view for the web app
   */
  @RequestMapping("/")
  public String mainMenu()
  {
    return "MainMenuView";
  }

  /** Method that gets called when the menu option button for the upload betting data page is selected
   * @return Upload Bets View which allows you to upload betting data to the database
   */
  @RequestMapping("/uploadBets")
  public String uploadBets()
  {
    return "UploadBetView";
  }

  /** Method that gets called when the menu option button for the search for bets page is selected
   * @return Search Bets View which allows you to search for bets by input and filters
   */
  @RequestMapping("/searchBets")
  public String searchBets()
  {
    return "SearchBetView";
  }

  /** Method that gets called when the search for bets button is pressed
   * @param model Model object that will feed data to the view
   * @param bet User input in the search text related to the bets to be searched for
   * @param option Dropdown option selected from which data will be filtered by
   * @return Bet Result View which will display information regarding bets according to the user's search filter
   */
  @RequestMapping(value = "/processSearch", method = RequestMethod.GET)
  public String betResult(Model model, @RequestParam(name = "bet") String bet, @RequestParam(name = "option") String option)
  {
    if(option.equals("Game"))
    {
      final String game = bet.toLowerCase();
      List<Bet> betsByGame = repository.findAllByGame(game);
      model.addAttribute("bets", betsByGame);
    }

    if(option.equals("Client ID"))
    {
      int clientId = Integer.parseInt(bet);
      List<Bet> betsByClient = repository.findAllByClientid(clientId);
      model.addAttribute("bets", betsByClient);
    }

    if(option.equals("Date"))
    {
      List<Bet> betsByDate = repository.findAllByDate(bet);
      model.addAttribute("bets", betsByDate);
    }

    return "BetResultView";
  }

  /** Method that gets called when a POST request is made to this endpoint
   * @param betData Represents the json file uploaded containing bet data
   * @param redirectAttributes Attribute object to allow to add attributes to feed to the view
   * @return Redirect to the view after uploading
   * @throws IOException
   */
  @PostMapping("/bets")
  public String handleFileUpload(@RequestParam("betData") MultipartFile betData, RedirectAttributes redirectAttributes) throws IOException
  {
    String content = new String(betData.getBytes());
    System.out.println(String.valueOf(content));

    ObjectMapper objectMapper = new ObjectMapper();
    final Bets bets = objectMapper.readValue(content, Bets.class);

    for(Bet bet : bets.getBets())
    {
      repository.save(bet);
    }

    redirectAttributes.addFlashAttribute("message", "You successfully uploaded " + betData.getOriginalFilename() + "!");

    return "redirect:/";
  }
}
