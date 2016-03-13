/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import byu.cit260.theHunt2.control.GameControl;
import byu.cit260.theHunt2.control.InventoryItem;
import byu.cit260.theHunt2.model.Location;
import byu.cit260.theHunt2.model.Map;
import thehunt2.theHunt2;

/**
 *
 * @author mikec_000
 */
public abstract class GameMenuView extends View {

    private int row;
    private Object MapControl;
    private Object mapControl;


 public GameMenuView(){
      super("\n"
            +"\n-----------------------------------------"
            +"\n|  Game Menu                            |"
            +"\n-----------------------------------------"
            +"\nM - Show Map"
            + "\nI- View List of items in inventory"
            +"\nL - Move To New Location"
            +"\nG - Puzzle Scene HalfGallon"
            +"\nW - Puzzle Scene Water"
            +"\nR - Return to Main Menu"
            + "\nH- Help"
            +"\nS - Save GAme"
            +"\n-----------------------------------------");
}

    

 @Override
    public boolean doAction(String value) {
        char choice = value.charAt(0);
        
        switch (choice){
            case 'M':// save current game
                this.displayMap();
                break;    
            case 'I'://View list of the items in inventory
                this.viewItemInventory();
                break;
            case 'L':// save current game
                this.newLocation();
                break;     
           case 'G':// save current game
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

    private void displayMap() {
        //get the map locations from the current game
       Map map= theHunt2.getCurrentGame().getMap(); // Map.getMapLocationsCurrentGame();
       Location[][] loc = map.getLocations();
        String menu = ""
            + "\n***********************************************************************"
            + "\n" + "The Hunt - Map"  
            + "\n***********************************************************************";
            
            System.out.println(menu);
        
               for(int row = 0; row< loc.length; row++) {    
                      System.out.print("row "+ row + " : " );
                 
                  for(int col=0; col<loc[row].length; col++){
                     System.out.print("|"); 
                     Location curLoc =loc [row][col];
                     if(curLoc.getScene()==null)
                         System.out.print(" ?? "); 
                     else
                         System.out.print(curLoc.getScene().getSymbol()); 
                  }
                  System.out.println("|");
               }
        
    //   System.out.println("***start showmap function called ***");
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

    public void displayMenu() {
         System.out.println("*** start return to main menu function called ***");
    }

    private void viewItemInventory() {
        //get the sorted list of items for the current game
        InventoryItem[] item = GameControl.getSortedInventroyList();
        
        System.out.println("\nList of Items");
        System.out.println("Description" + "\t"+
                                          "Required" + "\t"+ "InStock");
        //for each inventory item
        for (InventoryItem inventoryItem : item){
            //Display the description, the required amount and amount in stock
            System.out.println( inventoryItem.getDescription()); 
                                               
                                         
        }
    }     
}
