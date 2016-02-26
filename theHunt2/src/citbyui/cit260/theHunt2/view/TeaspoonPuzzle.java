/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import java.util.Scanner;
import byu.cit260.theHunt2.control.PuzzleTeaspoon.java;

/**
 *
 * @author AlleciaMitchell
 */
public class TeaspoonPuzzle {
    private final String MENU = "\n"
            +"\n-----------------------------------------"
            + "\n| Teaspoon Puzzle                         |"
            +"\n-----------------------------------------"
            +"\nYou have come to a peculiar device next  "
            +"\nto a waterfall.  A barrel is suspended   "
            +"\nabove a large tub, and a fill valve is   "
            +"\npoised above the barrel ready to fill    "
            +"\nit.  You see that the barrel is marked as"
            +"\n40 gallons, the tub is marked as 120"
            +"\ngallons, and the fill valve says 2.2GPM. "
            +"\nIt is apparent that the barrel will fill "
            +"\nfrom the fill valve, and then dump into  "
            +"\nthe tub when it is full."
            +"\nYou must figure out how long it will take"
            +"\nto fill the tub completely."
            +"\n-----------------------------------------";

    public void displayMenu() {
        
        char selection = ' ';
        do {
               
            System.out.println(MENU); // display the Teaspoon Puzzle
       
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
       
            this.doAction(selection); // do action based on selection
       
        } while (selection != 'E'); // while selection is not "Exit"
       
    }

    private String getInput() {
         boolean valid = false; // indicates if the answer has been retrieved
       String getInput = null;
       Scanner keyboard = new Scanner(System.in);   // keyboard input stream
       
       while (!valid) { // while a valid answer has not been retrieved
           
           //prompt for the player's answer
           System.out.println("I have a teaspoon. How many times will I need to fill the teaspoon to fill a half gallon jug?");
          
           // get the answer from the keyboard and trim off the blanks
          getInput = keyboard.nextLine();
           getInput = getInput.trim();
           
           //if the answer is invalid (less than two character in lenght))
           if (getInput. length() <1){
               System.out.println("That is an invalid response.");
               continue; // and repeat again
               
           }
           break; // out of the (exit) the repetition
       }
       return getInput; //return the answer
       
        System.out.println("Enter the number of teaspoons in a tablespoon:");
        String tubCapacity = keyboard.nextLine();
 
    System.out.println("Enter the number of tablespoons in a cup:");
        String barrelCapacity = keyboard.nextLine();
        
    System.out.println("Enter the number of cups in a gallon:");
        String fillRate = keyboard.nextLine();
    }
   public static void main(String[] args) {
        
        int amtTeaTablespoon = 120;
                
        if (amtTeaTablespoon < 3) {
            System.out.println("The amount of teaspoons in a tablespoon is larger than that!");
        }
        else if (amtTeaTablespoon > 3) {
            System.out.println("Whoa! There isnt that many teaspoons in a tablespoon!");
        }
        else {
            System.out.println("Correct!  There are 16 Teaspoons in a Tablespoon!");
        }
        
        int amtTablespoon = 16;
                
        if (amtTablespoon < 16) {
            System.out.println("The amount of Tablespoons in a cup is larger than that!!");
        }
        else if (amtTablespoon > 16) {
            System.out.println("Whoa! There isnt that many tablespoons in a cup!");
        }
        else {
            System.out.println("Correct!  There are 16 Tablespoons in a Gallon!");
        }
        
        int amtCups = 16;
                
        if (amtCups < 16) {
            System.out.println("There are more cups in a gallan than that!");
        }
        else if (amtCups > 16) {
            System.out.println("Whoa! There are less cups in a gallon than that!");
        }
        else {
            System.out.println("Correct!  There are 16 cups in a gallon!");
        }
   
   }

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    
