/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

/**
 *
 * @author mikec_000
 */

public abstract class SaveGame extends View{
 
        private final String MENU = "\n"
            +"\n-----------------------------------------"
            + "\n| Save Game                            |"
            +"\n-----------------------------------------"
            +"\nS - Save Game"
            +"\nR - Return to Main Menu"
            +"\n-----------------------------------------";

    

    private void doAction(char choice) {
        switch (choice){
            case 'S':// save current game
                this.saveGame();
                break;     
            case 'R':// Return to Main Menu
               this.returnToMainMenu();
               return;
            default:
               System.out.println("\n*** Invalid selection *** Try again ");
               break;          
               
        }
    }

    private void saveGame() {
        System.out.println("*** start saveGame function called ***");
    }
       
    private void returnToMainMenu() {
       MainMenuView mainMenu = new MainMenuView();
       mainMenu.display();
    }

}