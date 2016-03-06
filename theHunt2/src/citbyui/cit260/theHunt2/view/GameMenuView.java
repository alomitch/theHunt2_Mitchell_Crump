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
public abstract class GameMenuView extends View {

 
        private final String MENU = "\n"
            +"\n-----------------------------------------"
            +"\n|  Game Menu                            |"
            +"\n-----------------------------------------"
            +"\nM - Show Map"
            + "\nL-Move To New Location"
            + "\nH-Puzzle Scene HalfGallon"
            + "\nW-Puzzle  SceneWater"
            +"\nR -Return to Main Menu"
            + "\nS-Save GAme"
            +"\n-----------------------------------------";

    

    public boolean doAction(String value) {
        char choice = value.charAt(0);
        
        switch (choice){
            case 'M':// save current game
                this.showmap();
                break;    
            case 'L':// save current game
                this.newLocation();
                break;     
           case 'H':// save current game
                this.halfGallon();
                break;     
           case 'W':// save current game
                this.water();
                break;     
           case 'S'://Save game
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

    private void showmap() {
       System.out.println("***start showmap function called ***");
    }

    private void newLocation() {
       System.out.println("*** start newLocation function called ***");
    }

    private void halfGallon() {
         System.out.println("*** start halfGallon function called ***");
    }

    private void water() {
         System.out.println("*** start water function called ***");
    }

    void displayMenu() {
         System.out.println("*** start return to main menu function called ***");
    }
       
}
    
    



//show map
//move to new location - 
//pick up an item
