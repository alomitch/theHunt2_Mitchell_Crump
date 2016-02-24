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
public class Items {
 
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
            +"\nQ - Quit"
            +"\n-----------------------------------------";

    public void displayMenu() {
        
        char selection = ' ';
        do {
               
            System.out.println(MENU); // display the Items menu
       
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
       
            this.doAction(selection); // do action based on selection
       
        } while (selection != 'Q'); // while selection is not "Quit"
       
    }

    private String getInput() {
         boolean valid = false; // indicates if the name has been retrieved
       String getInput = null;
       Scanner keyboard = new Scanner(System.in);   // keyboard input stream
       
       while (!valid) { // while a valid option has not been retrieved
           
           //prompt for the player's selection
           System.out.println("Choose Option From Item Menu");
          
           // get the selection from the keyboard and trim off the blanks
          getInput = keyboard.nextLine();
           getInput = getInput.trim();
           
           //if the selection is invalid (less than one character in length))
           if (getInput. length() <1){
               System.out.println("Invalid entry");
               continue; // and repeat again
               
           }
           break; // out of the (exit) the repetition
       }
       return getInput; //return the selection
    }

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
               break;
            case 'Q': // Quit
                this.quitProgram();
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
       mainMenu.displayMenu();
    }

    private void quitProgram() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }
}

