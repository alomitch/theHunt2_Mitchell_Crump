/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import byu.cit260.theHunt2.control.ProgramControl;
import byu.cit260.theHunt2.model.Player;
import citbyu.cit260.theHunt2.exceptions.ProgramControlException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.BufferedReader;
import thehunt2.theHunt2;


/**
 *
 * @author AlleciaMitchell
 */
public class StartProgramView {
    
    protected final BufferedReader keyboard = theHunt2.getInfile();
    protected final PrintWriter console = theHunt2.getOutfile();

    private String playersName;
       public StartProgramView(){
       }
           public void startProgram() throws ProgramControlException{
               // Display the banner screen
               this.displayBanner();
               
               // Prompt the player to enter the name of the player
               String playersName = this.getPlayersName();
               
               // Create and save the player object
               Player player = ProgramControl.createPlayer(playersName);
               // Display a personalized welcome message
               this.displayWelcomeMessage(player);
               // Display the Main Menu
               MainMenuView mainMenu = new MainMenuView();
               mainMenu.display();
           }

    private void displayBanner() {
      this.console.println("\n\n*****************The Hunt*********************");
      this.console.println("*                                                                                                                                                                        "
                                   +"\n*Welcome to The Hunt!  In this game, you will explore a virtual world full of riddles and treasure. *"
                                   +"\n*You will enjoy an intriguing story and adventure every step of the way, and you will be encouraged *"
                                   +"\n*to continue the treasure hunt until you ultimately uncover the hiddent treasure that is hidden away*"
                                   +"\n* on the mysterious island that you have been placed on.                                            *");
       this.console.println("*                                                                                                                                                                       "
                                   +"\n*You begin your adventure after beaching your boat on a tropical island.  You have with you a       *"
                                   +"\n*mysterious map of the island. You will be presented with options to move througout the land using a*"
                                   +"\n* series of command prompt entries. After exploring the island for a short time you will encounter  *"
                                   +"\n*items which can be acquired, and obstacles that will block your path from further travel.  You will*"
                                   +"\n* need to answer riddles in order to overcome the obstacles. Hidden within each of these obstacles  *"
                                   +"\n*is a clue which may be useful for solving the final riddle to find the treasure.                   *");
        this.console.println("*                                                                                                                                                                      "
                                   +"\n*Many paths exist within the island, but only one leads to the hidden treasure. You may encounter   *"
                                   +"\n*peril along any path, and a wrong step or answer will lead you to an untimely demise.                 *"
                                   +"\n*                                                                                                   *");      
    }

    private String getPlayersName() {
       boolean valid = false; // indicates if the name has been retrieved
       String playerName = null;
       Scanner keyboard = new Scanner(System.in);   // keyboard input stream
       
       while (!valid) { // while a valid name has not been retrieved
           
           //propt for the player's name
           this.console.println("Enter your name below:");
          
           // get the name from the keyboard and trim off the blanks
           playersName = keyboard.nextLine();
           playersName = playersName.trim();
           
           //if the name is invalid (less than two character in lenght))
           if (playersName. length() <2){
               ErrorView.display(this.getClass().getName(),
                       "Invalid name - the name must be at least two characters.");
               continue; // and repeat again
               
           }
           break; // out of the (exit) the repetition
       }
       return playersName; //return the name
    }

    private void displayWelcomeMessage(Player player) {
        this.console.println("\n\n===============================================================================");
        this.console.println("\tWelcome to the game, " + player.getName() + ".");
        this.console.println("\tWe hope you have a lot of fun!");
        this.console.println("===================================================================================");
        
    }
       
}
