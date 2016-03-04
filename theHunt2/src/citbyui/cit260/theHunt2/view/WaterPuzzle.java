/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import byu.cit260.theHunt2.control.GameControl;
import java.util.Scanner;
import thehunt2.theHunt2;

/**
 *
 * @author mikec_000
 */
public class WaterPuzzle {
   
    private final String MENU = "\n"
            +"\n-----------------------------------------"
            + "\n| Water Puzzle                         |"
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
               
            System.out.println(MENU); // display the Water Puzzle
       
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
           System.out.println("How long will it take to fill the tub completely?");
          
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
    }

    
    Scanner keyboard = new Scanner(System.in);
        System.out.println("\nEnter Tub Capacity:");
        String tubCapacity = keyboard.nextLine();
 
        System.out.println("\nEnter Barrel Capacity:");
        String barrelCapacity = keyboard.nextLine();
        
        System.out.println("\nEnter Fill Valve Fill Rate:");
        String fillRate = keyboard.nextLine();
        
    public static void main(String[] args) {
        
        int tubCapacity = 120;
                
        if (tubCapacity < 120) {
            System.out.println("The tub is larger than that!");
        }
        else if (tubCapacity > 120) {
            System.out.println("Whoa!  The tub isn't that big!");
        }
        else {
            System.out.println("Correct!  The tub has a capacity of 120 gallons.");
        }
        
        int barrelCapacity = 40;
                
        if (barrelCapacity < 40) {
            System.out.println("The barrel is larger than that!");
        }
        else if (barrelCapacity > 40) {
            System.out.println("Whoa!  The barrel isn't that big!");
        }
        else {
            System.out.println("Correct!  The barrel has a capacity of 40 gallons.");
        }
        
        double fillRate = 2.2;
                
        if (fillRate < 2.2) {
            System.out.println("The fill valve is faster than that!");
        }
        else if (fillRate > 2.2) {
            System.out.println("Whoa!  The fill valve isn't that fast!");
        }
        else {
            System.out.println("Correct!  The fill valve fills at 2.2 gallons per minute.");
        }
    }

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
