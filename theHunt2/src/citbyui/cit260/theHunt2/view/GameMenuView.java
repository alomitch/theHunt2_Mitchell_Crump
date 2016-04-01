/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import byu.cit260.theHunt2.control.GameControl;
import byu.cit260.theHunt2.control.InventoryItem;
import byu.cit260.theHunt2.control.MapControl;
import byu.cit260.theHunt2.model.Location;
import byu.cit260.theHunt2.model.Actor;
import byu.cit260.theHunt2.model.Map;
import citbyu.cit260.theHunt2.exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import thehunt2.theHunt2;

/**
 *
 * @author mikec_000
 */
public abstract class GameMenuView extends View {

    private int row;
    public int actor;
    private int coordinates;
//    private Object MapControl;
//    private Object mapControl;


 public GameMenuView(){
      super("\n"
            +"\n-----------------------------------------"
            +"\n|  Game Menu                            |"
            +"\n-----------------------------------------"
            +"\nM - Show Map"
            +"\nI - View List of items in inventory"
            +"\nL - Move To New Location"
            +"\nG - Puzzle Scene HalfGallon"
            +"\nW - Puzzle Scene Water"
            +"\nR - Return to Main Menu"
//            +"\nH - Help"
//            +"\nS - Save GAme"
            +"\n-----------------------------------------");
}

    

 @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
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
//           case 'S'://Save game
//               this.saveGame();
//               break;
            case 'R':// Return to Main Menu
              // this.returnToMainMenu();
               return true;
            default:
               ErrorView.display(this.getClass().getName(),
                       "\n*** Invalid selection *** Try again ");
               break;          
               
        }
        
        return false;
    }

//    private void saveGame() {
//        System.out.println("*** start saveGame function called ***");
//    }

    private void displayMap() {
        //get the map locations from the current game
       String leftIndicator;
       String rightIndicator;
       Map map= theHunt2.getCurrentGame().getMap(); // Map.getMapLocationsCurrentGame();
       Location[][] locations = map.getLocations();
        String menu = ""
            + "\n***********************************************************************"
            + "\n" + "The Hunt - Map"  
            + "\n***********************************************************************";
            
            this.console.println(menu);
            
            System.out.print("   |");
         for( int col = 0; col < locations[0].length; col++){
             System.out.print("  " + col + " |"); // print col numbers to side of map
         }
         System.out.println();
         for( int row = 0; row < locations.length; row++){
             System.out.print(row + "  "); // print row numbers to side of map
             for( int col = 0; col < locations[row].length; col++){
                 leftIndicator = " ";
                 rightIndicator = " ";
                 if(locations[row][col]==map.getCurrentLocation()){
                     leftIndicator = "*"; // can be stars or whatever these are indicators showing visited
                     rightIndicator = "*"; // same as above
                 }
                 else if(locations[row][col].isVisited()){
                     leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                     rightIndicator = "<"; // same as above
                 }
                 // TODO : use if else ladder to check to see if this location is current location and set proper indicators
                 System.out.print("|"); // start map with a |
                 if(locations[row][col].getScene() == null)
                     System.out.print(leftIndicator + "??" + rightIndicator);
                 else
                     System.out.print(leftIndicator + locations[row][col].getScene().getSymbol() + rightIndicator);
             }
             System.out.println("|");
         }
    
        
//               for(int row = 0; row< loc.length; row++) {    
//                      this.console.print("row "+ row + " : " );
//                 
//                  for(int col=0; col<loc[row].length; col++){
//                     this.console.print("|"); 
//                     Location curLoc =loc [row][col];
//                     if(curLoc.getScene()==null)
//                         this.console.print("??"); 
//                     else
//                         this.console.print(curLoc.getScene().getSymbol()); 
//                  }
//                  this.console.println("|");
//               }
        //get count of scenes that are not equal to null(build function) (incriment a counter)
    //   System.out.println("***start showmap function called ***");
    }
//get count of scenes that are not equal to null(build function) (incriment a counter)

    private void newLocation() {
        //Actor actor = null;
        //Coordinates coordinates = null;
        Map map = theHunt2.getCurrentGame().getMap();
        this.console.println("Enter the row:");
               String row = getInput();  
               int iRow = Integer.parseInt(row);
        this.console.println("Enter the column:");
               String column = getInput();
               int iColumn = Integer.parseInt(column);
        try {
            MapControl.movePlayerToLocation (map, iRow, iColumn);
        } catch (MapControlException ex) {
            Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        
        this.console.println("\nList of Items");
        this.console.println("Description" + "\t"+
                                          "Required" + "\t"+ "InStock");
        //for each inventory item
        for (InventoryItem inventoryItem : item){
            //Display the description, the required amount and amount in stock
            this.console.println( inventoryItem.getDescription()); 
                                               
                                         
        }
    }     
}
