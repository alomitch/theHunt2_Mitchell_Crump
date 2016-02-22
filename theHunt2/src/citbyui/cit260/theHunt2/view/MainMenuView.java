/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import byu.cit260.theHunt2.control.GameControl;
import java.util.Scanner;
import thehunt2.theHunt2;

/**
 *
 * @author AlleciaMitchell
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            +"\n-----------------------------------------"
            + "\n| Main Menu                            |"
            +"\n-----------------------------------------"
            +"\nG - Start game"
            +"\nH - Get help on how to play the game"
            +"\nS - Save game"
            +"\nE - Exit"
            +"\nM - Show Game Map"
            +"\nR - Return to Main Menu"
            +"\n-----------------------------------------";

    public void displayMenu() {
        
        char selection = ' ';
        do {
               
            System.out.println(MENU); // display the main menu
       
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
       
            this.doAction(selection); // do action based on selection
       
        } while (selection != 'E'); // while selection is not "Exit"
       
    }

    private String getInput() {
         boolean valid = false; // indicates if the name has been retrieved
       String getInput = null;
       Scanner keyboard = new Scanner(System.in);   // keyboard input stream
       
       while (!valid) { // while a valid name has not been retrieved
           
           //prompt for the player's name
           System.out.println("Choose Option From Main Menu");
          
           // get the name from the keyboard and trim off the blanks
          getInput = keyboard.nextLine();
           getInput = getInput.trim();
           
           //if the name is invalid (less than two character in lenght))
           if (getInput. length() <1){
               System.out.println("Invalid entry");
               continue; // and repeat again
               
           }
           break; // out of the (exit) the repetition
       }
       return getInput; //return the name
    }

    public void doAction(char choice) {
        switch (choice){
            case 'N'://create and start a new game
                this.startNewGame();
                break;
            case 'G': //get and start and existing game
                this.startExistingGame();
                break;
            case 'H': // display the help menu
                this.displayHelpMenuView();
                break;
            case 'S':// save current game
                this.saveGame();
                break;
            case 'M': // Show game map
                this.displayGameMap();
                break;
            case 'R':// Return to Main Menu
               this.returnToMainMenu();
               break;
            case 'E':// exit current game
                return;
           default:
               System.out.println("\n*** Invalid selection *** Try again ");
               break;
           
               
        }
    }

    private void startNewGame() {
        // create new game
       GameControl.createNewGame(theHunt2.getPlayer());
       
       // display the game menu
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.displayMenu();
       
       }

    private void startExistingGame() {
       System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenuView() {
        System.out.println("*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayGameMap() {
        System.out.println("*** display game map function called ***");
    }

    private void returnToMainMenu() {
       System.out.println("***start returnToMainMenu function called***");
    }

   
    
}
