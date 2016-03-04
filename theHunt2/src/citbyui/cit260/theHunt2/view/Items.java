/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import java.util.Scanner;

/**
 *
 * @author mikec_000
 */
public abstract class Items extends View{
 
        private final String MENU = "\n"
            +"\n-----------------------------------------"
            + "\n| Items Menu                            |"
            +"\n-----------------------------------------"
            +"\nC - Clues"
            +"\nT - TNT"
            +"\nA - Aid Bag"
            +"\nO - Old Cell Phone"
            +"\nM - Monkey"    
            +"\nR - Return to Main Menu"
            +"\n-----------------------------------------";

    

    private void doAction(char choice) {
        switch (choice){
            case 'C':// display information on game clues
                this.clues();
                break;
            case 'T': // display information on TNT
                this.tnt();
                break;
            case 'A': // display information on the aid bag
                this.aidBag();
                break;
            case 'O':// display information on the old cell phone
                this.oldCellPhone();
                break;
            case 'M':// display information on the monkey
                this.monkey();
                break;              
            case 'R':// Return to Main Menu
               this.returnToMainMenu();
               return;
            default:
               System.out.println("\n*** Invalid selection *** Try again ");
               break;          
               
        }
    }

    private void clues() {
        System.out.println("*** start clues function called ***");
    }

    private void tnt() {
       System.out.println("***start tnt function called ***");
    }

    private void aidBag() {
        System.out.println("***start aidBag function called ***");
    }

    private void oldCellPhone() {
        System.out.println("*** start oldCellPhone function called ***");
    }
    private void monkey() {
        System.out.println("*** start monkey function called ***");
    }
    
    private void returnToMainMenu() {
       MainMenuView mainMenu = new MainMenuView();
       mainMenu.display();
    }

}

