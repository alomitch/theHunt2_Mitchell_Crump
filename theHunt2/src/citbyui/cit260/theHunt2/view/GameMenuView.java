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

/**
 *
 * @author mikec_000
 */
public abstract class GameMenuView extends View {


 public GameMenuView(){
      super("\n"
            +"\n-----------------------------------------"
            +"\n|  Game Menu                            |"
            +"\n-----------------------------------------"
            +"\nM - Show Map"
            + "\nI-View List of items in inventory"
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
       Map[] map= Map.getMapLoctionsCurrentGame();
        
        //Display title, and row of columns numbers
        System.out.println("\nTreasure Map");
        System.out.println("\n");   
        
        //for every row in map
        for (Map rowInMap : map){
           System.out.println("---------------------------------");
           System.out.println(rowInMap.getRowCount());
        }
        //for every column in map
        for( Map columnInMap : map){
          System.out.println("|")  
           System.out.println();
        }
        
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
