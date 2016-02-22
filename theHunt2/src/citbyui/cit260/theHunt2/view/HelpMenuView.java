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
public class HelpMenuView {
    
    private final String MENU = "\n"
            +"\n-----------------------------------------"
            + "\n| Help Menu                            |"
            +"\n-----------------------------------------"
            +"\nG - What is the goal of the game?"
            +"\nM - How to move"
            +"\nA - Answering riddles"
            +"\nI - Picking up items"
            +"\nR - Return to Main Menu"
            +"\nQ - Quit"
            +"\n-----------------------------------------";

    public void displayMenu() {
        
        char selection = ' ';
        do {
               
            System.out.println(MENU); // display the help menu
       
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
           System.out.println("Choose Option From Help Menu");
          
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
            case 'G'://display the goal of the game
                this.gameGoal();
                break;
            case 'M': //How to move
                this.gameMovement();
                break;
            case 'A': // Answering riddles
                this.answerRiddles();
                break;
            case 'I':// Picking up Inventory Items
                this.pickingUpItems();
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

    private void gameGoal() {
        System.out.println("*** start gameGoal function called ***");
    }

    private void gameMovement() {
       System.out.println("***start gameMovement function called ***");
    }

    private void answerRiddles() {
        System.out.println("***start answerRiddles function called ***");
    }

    private void pickingUpItems() {
        System.out.println("*** start pickingUpItems function called ***");
    }

    private void returnToMainMenu() {
       MainMenuView mainMenu = new MainMenuView();
       mainMenu.displayMenu();
    }

    private void quitProgram() {
        System.out.println("***start quitProgram function called ***");
    }
}


    

