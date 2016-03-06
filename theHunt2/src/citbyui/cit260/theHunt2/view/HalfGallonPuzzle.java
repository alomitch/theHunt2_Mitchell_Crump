/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import byu.cit260.theHunt2.control.PuzzleHalfGallon;
import java.util.Scanner;


/**
 *
 * @author AlleciaMitchell
 */
public class HalfGallonPuzzle {
    private final String MENU = "\n"
            +"\n-----------------------------------------"
            + "\n| Teaspoon Puzzle                         |"
            +"\n-----------------------------------------"
            +"\nYou have come to an empy half gallon  "
            +"\njug next to a waterfall. You need to fill the  "
            +"\njug as a qualifier with either teaspoons,  "
            +"\ncups, or tablespoons. It is your job to come "
            +"\nup with the exact amount of either cups,"
            +"\ntablespoons, and teaspoons it will take "
            +"\nto fill the half gallon jug before you have access "
            + "\nthe water to even fill up the half gallon jug."
            + "\n-----------------------------------------------"
            + "\n t -Teaspoons"
            + "\n T -Tablespoons "
            + "\n C -Cups"
            +"\n-----------------------------------------";

    public void displayMenu() {
        
        char selection = ' ';
        do {
               
            System.out.println(MENU); // display the main menu
       
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
       
            this.doAction(selection); // do action based on selection
       
        } while (selection != 'E'); // while selection is not "Exit"
       
    }

    private String getInput() {
         boolean valid = false; // indicates if the name has been retrieved
       String getInput = null;
       Scanner keyboard = new Scanner(System.in);   // keyboard input stream
       
       while (!valid) { // while a valid name has not been retrieved
           
           //prompt for the player's name
           System.out.println("Choose Option From The Half Gallon Puzzle Menu");
          
           // get the name from the keyboard and trim off the blanks
          getInput = keyboard.nextLine();
           getInput = getInput.trim();
           
           //if the name is invalid (less than two character in lenght))
           if (getInput. length() <1){
               System.out.println("Invalid entry");
               continue; // and repeat again
               
           }
           break; // out of the (exit) the repetition
       }
       return getInput; //return the name
    }
    void doAction(char choice) {
        switch (choice){
            case 't'://create and start a new game
                this.teaspoon();
                break;
            case 'T': //get and start and existing game
                this.tablespoon();
                break;
            case 'C':// get input for cups
                this.cups();
                break; 
          default:
               System.out.println("\n*** Invalid selection *** Try again ");
               break;
           }
      }     
    
    private void teaspoon() {
        System.out.println("Enter the number of teaspoons:");
            String teaspoon = getInput(); 
            int Teaspoon = Integer.parseInt(teaspoon);
             PuzzleTeaspoon.calcHalfGallon(double quantity, String units);
    }

    private void tablespoon() {
        System.out.println("Enter the number of tablespoons :");
             String tablespoon = getInput();
              int Tablespoon = Integer.parseInt(tablespoon); 
               PuzzleTeaspoon.calcHalfGallon(double quantity, String units);
    }

    private void cups() {
      System.out.println("Enter the number of cups:");    
            String cup = getInput();
             int Cup = Integer.parseInt(cup);
              PuzzleTeaspoon.calcHalfGallon(double quantity, String units);
    }
    
}
  
    
