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
            +"\n| Main Menu                             |"
            +"\n-----------------------------------------"
            +"\nN - Start a new Game"
            +"\nG - Start  existing game"
            +"\nH - Get help on how to play the game"
            +"\nP - Print a list of all items"   
            +"\nL - Print a list of all Locations on Map"
            +"\nS - Save game"
            +"\nE - Exit"
            +"\nR - Return to Main Menu"
            +"\nA - About us"
            +"\n-----------------------------------------");
    }    

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
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
            case 'P': // print a list of all items
                this.itemsListView();
                break;   
            case'L'://print a list of all locations on Map
                this.locationsListView();
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
       
       this.console.println("\nAfter dragging your boat ashore, you find yourself on a tropical beach.  "
            + "\nThe brush grows thick before you, but you can make out several paths which "
            + "\nappear to lead deep into the island.  In the distance, you can see tropical"
            + "\n waterfalls cascading from precipitous heights.  High atop distand cliffs, "
            + "\nyou see what appears to be ancient ruins covered in thick vines and ages of"
            + "\n growth.  You beach your craft securely, then consider your backpack resting "
            + "\nin the bow of the boat.  Should you travel light through the brush, or bring "
            + "\nyour pack in case you find anything interesting along the way?");
       
       // display the game menu
       GameMenuView gameMenu = new GameMenuView() {};
       gameMenu.display();
       
       }
    
    private void startExistingGame() {
       
        // prompt for and get the path of the file to load
        this.console.println("\n\nEnter the file path for the game file to be "
                            + "loaded.");
        
        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView() {};
        gameMenu.display();
    }

    private void helpMenuView() {
        HelpMenuView helpMenu = new HelpMenuView() {};                 
        helpMenu.display();        
    }
    
    private void itemsListView() {
        ItemsListView itemsList = new ItemsListView() {};                 
        itemsList.display();        
    }

    private void saveGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                            + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveGame(theHunt2.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void returnToMainMenu() {
       System.out.println("***start returnToMainMenu function called***");
    }

    private void aboutUs() {
       AboutUsMenu aboutUsMenu = new AboutUsMenu() {};                 
       aboutUsMenu.display();        
    } 

    private void locationsListView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
