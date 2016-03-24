/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import byu.cit260.theHunt2.control.GameControl;
import byu.cit260.theHunt2.control.InventoryItem;

/**
 *
 * @author mikec_000
 */
public abstract class Clues extends View{
     
       public Clues(){
           super("\n"  
            +"\n-----------------------------------------"
            +"\n| Clues                                 |"
            +"\n-----------------------------------------"
            +"\nW - Water Scene Clue"
            +"\nH - Half-Gallon Clue"
            +"\nM - Monkey Clue"
            +"\nO - Old Cell Phone clue"   
            +"\nR - Return to Main Menu"
            +"\n-----------------------------------------");
       }
    

       @Override
     public boolean doAction(String value) {
        char choice = value.charAt(0);
        
        switch (choice){
            case 'W':// display Water Scene clue
                this.water();
                break;
            case 'H': // display Half Gallon clue
                this.half();
                break;
            case 'M': // display Monkey clue
                this.monkey();
                break;
            case 'O':// display old cell phone clue
                this.oldCellPhone();
                break;                   
            case 'R':// Return to Main Menu
               this.returnToMainMenu();
               return true;
            default:
               ErrorView.display(this.getClass().getName(),
                       "\n*** Invalid selection *** Try again ");
               break;          
               
        }
        return false;
    }

    private void water() {
        System.out.println("*** start water clue function called ***");
    }

    private void half() {
       System.out.println("***start half gallon clue function called ***");
    }

    private void monkey() {
        System.out.println("***start monkey function called ***");
    }

    private void oldCellPhone() {
        System.out.println("*** start oldCellPhone function called ***");
    }    
    
    private void returnToMainMenu() {
       MainMenuView mainMenu = new MainMenuView();
       mainMenu.display();
    }

    private void viewClues() {
        //get the sorted list of clues acquired
        InventoryItem[] clue = GameControl.getSortedClueList() ;
        
        this.console.println("\nList of clues");
        this.console.println("Description" + "\t" +
                            "In Backpack");
        
        //for each clue
        for (InventoryItem inventoryItem : clue) {
            //DISPLAY the clue and how many in inventory
            this.console.println(inventoryItem.getDescription() + "\t     " +
                    inventoryItem.getQuantityInStock());
        }
    }
}

