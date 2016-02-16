/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import byu.cit260.theHunt2.model.Player;
import java.util.Scanner;

/**
 *
 * @author AlleciaMitchell
 */
public class StartProgramView {

    private String playersName;
    private Object ProgramControl;
        
       public StartProgramView(){
       }
           public void startProgram(){
               // Display the banner screen
               this.displayBanner();
               
               // Prompt the player to enter the name of the player
               String playersName = this.getPlayersName();
               
               // Create and save the player object
               Player player = ProgramControl.createPlayer(playersName);
               // Display a personalized welcome message
               
               // Display the Main Menu
           }

    private void displayBanner() {
      System.out.println("\n\n*******************************************************************************");
      System.out.println("*                                                                                                                                                                        "
                                   +"\n*This is a game to explore a virtual world full of riddles and treasure.                                              *"
                                   +"\n*You will enjoy an intriguing story andadventure every step of teh way. You will be                      *"
                                   +"\n*encouraged to continue the treasure hunt until ultimately you uncover the hiddent treasure    *"
                                   +"\n*that is hidden away on the mysterious island that you have been placed on.                               *");
       System.out.println("*                                                                                                                                                                       "
                                   +"\n*You will be presented with a section of dialogue describing a tropical island and a mysterious   *"
                                   +"\n*map that you will aquire. You will be presented with options to move througout the land          *"
                                   +"\n* using a series of command prompt entries. After exploring the island for a shortime you          *"
                                   +"\n*to obstecales that will block your path that will prevent you from further travel. You will the    *"
                                   +"\n*need to answer the riddle inorder to overcome the obstacle. Hidden within each of these          *"
                                   +"\n*obstacles is a clue which may be useful for solving the final riddle to find the treasure.             *");
        System.out.println("*                                                                                                                                                                      "
                + "\n*Many paths exist within the island, but only one leads to the hidden treasure. You may encounter peril   *"
                + "\n*along any path, and a wrong step, or answer, that will lead you an untimely demise .                                  *");
        
    }

    private String getPlayersName() {
       boolean valid = false; // indicates if the name has been retrieved
       String playerName = null;
       Scanner keyboard = new Scanner(System.in);   // keyboard input stream
       
       while (!valid) { // while a valid name has not been retrieved
           
           //propt for the player's name
           System.out.println("Enter the player's name below:");
          
           // get the name from the keyboard and trim off the blanks
           playersName = keyboard.nextLine();
           playersName = playersName.trim();
           
           //if the name is invalid (less than two character in lenght))
           if (playersName. lenght() <2){
               System.out.println("Invalid name - the name must not be blank");
               continue; // and repeat again
               
           }
           break; // out of the (exit) the repetition
       }
       return playersName; //return the name
    }
       
}
