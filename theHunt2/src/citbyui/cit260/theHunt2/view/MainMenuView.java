/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import byu.cit260.theHunt2.control.GameControl;
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
            +"\nM - Show Game Map"
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
                this.displayHelpMenuView();
                break;
            case 'S':// save current game
                this.saveGame();
                break;
            case 'M': // Show game map
                this.displayGameMap();
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
               System.out.println("\n*** Invalid selection *** Try again ");
               break;                        
        }
        return false;
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
        HelpMenuView helpMenu = new HelpMenuView() {
            @Override
            public boolean doAction(String value) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        helpMenu.display();
    }

    private void saveGame() {
        System.out.println("*** start saveGame function called ***");
    }

    private void displayGameMap() {
        System.out.println("*** display game map function called ***");
    }

    private void returnToMainMenu() {
       System.out.println("***start returnToMainMenu function called***");
    }

    private void aboutUs() {
       System.out.println("***start aboutUs function called***");
    } 
    
}
