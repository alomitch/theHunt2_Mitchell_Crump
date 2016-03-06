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
            +"\n| Save Game                             |"
            +"\n-----------------------------------------"
            +"\nS - Save Game"
            +"\nR - Return to Main Menu"
            +"\n-----------------------------------------";

    

    public boolean doAction(String value) {
        char choice = value.charAt(0);
        
        switch (choice){
            case 'S':// save current game
                this.saveGame();
                break;     
            case 'R':// Return to Main Menu
              // this.returnToMainMenu();
               return true;
            default:
               System.out.println("\n*** Invalid selection *** Try again ");
               break;          
               
        }
        
        return false;
    }

    private void saveGame() {
        System.out.println("*** start saveGame function called ***");
    }
       
}