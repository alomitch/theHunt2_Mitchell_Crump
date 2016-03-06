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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void newLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void halfGallon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void water() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
}
    
    



//show map
//move to new location - 
//pick up an item
