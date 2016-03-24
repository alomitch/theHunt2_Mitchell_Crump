/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import byu.cit260.theHunt2.control.GameControl;
import byu.cit260.theHunt2.model.Map;
import thehunt2.theHunt2;

/**
 *
 * @author AlleciaMitchell
 */
public class MainMenuView extends View {
    
    public MainMenuView(){
        super("\n"
            +"\n-----------------------------------------"
            + "\n| Main Menu                            |"
            +"\n-----------------------------------------"
            +"\nN - Start a new Game"
            +"\nG - Start  existing game"
            +"\nH - Get help on how to play the game"
            +"\nS - Save game"
            +"\nE - Exit"
            +"\nR - Return to Main Menu"
            +"\nA - About us"
            +"\n-----------------------------------------");
    }    

    @Override
    public boolean doAction(String value) {
        char choice = value.charAt(0);
        
        switch (choice){
            case 'N'://create and start a new game
                this.startNewGame();
                break;
            case 'G': //get and start and existing game
                this.startExistingGame();
                break;
            case 'H': // display the help menu
                this.helpMenuView();
                break;
            case 'S':// save current game
                this.saveGame();
                break;
            case 'R':// Return to Main Menu
               //this.returnToMainMenu();
               break;
            case 'A':// About us
                this.aboutUs();
                break;
            case 'E':// exit current game
                return true;
           default:
               ErrorView.display(this.getClass().getName(),
                       "\n*** Invalid selection *** Try again ");
               break;                        
        }
        return false;
    }

    private void startNewGame() {
       // create new game
       GameControl.createNewGame(theHunt2.getPlayer());
       
       // display the game menu
       GameMenuView gameMenu = new GameMenuView() {};
       gameMenu.display();
       
       }
    
    private void startExistingGame() {
       System.out.println("*** startExistingGame function called ***");
    }

    private void helpMenuView() {
        HelpMenuView helpMenu = new HelpMenuView() {};                 
        helpMenu.display();        
    }

    private void saveGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                            + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveGame(TheHunt2.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void returnToMainMenu() {
       System.out.println("***start returnToMainMenu function called***");
    }

    private void aboutUs() {
       System.out.println("***start aboutUs function called***");
    } 
    
}
