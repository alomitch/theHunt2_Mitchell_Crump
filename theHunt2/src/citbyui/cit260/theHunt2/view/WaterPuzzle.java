/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import java.util.Random;
import java.util.Scanner;
import byu.cit260.theHunt2.control.PuzzleSceneWater;
import citbyu.cit260.theHunt2.exceptions.PuzzleWaterSceneException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import thehunt2.theHunt2;

/**
 *
 * @author mikec_000
 */
public class WaterPuzzle {
    
    protected final BufferedReader keyboard = theHunt2.getInfile();
    protected final PrintWriter console = theHunt2.getOutfile();
    
    int tubGallons = 0;
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
    
    //you've come to a tub with a fill valve.

    public void displayMenu() throws PuzzleWaterSceneException {
        tubGallons = getTubCapacity();
        char selection = ' ';
        int minutes = 0;
        int returnVal;
        do {
               
            this.console.println(MENU); // display the Water Puzzle
            this.console.println("The tub capacity is " + tubGallons + " gallons.");
            this.console.println("How many minutes will it take to fill the tub completely?  Enter -1 to cancel.");
            String input = this.getInput(); // get the user's selection
            
            try{
                 // parse and convert number form text to a double
                 minutes = Integer.parseInt(input);
           } catch (NumberFormatException nf)      {
                System.out.println("\n You must enter a valid number."
                                + "Try again or enter Q to quit.");
            }
            returnVal = this.doAction(minutes); // do action based on selection
            if (returnVal == 1)
                this.console.println("Congratulations!  You are correct!");
            else 
                this.console.println("Sorry.  Please try again.");
            
       
        } while (minutes != -1 || returnVal != 1); // while selection is not -1
       
    }

    private String getInput() {
         boolean valid = false; // indicates if the answer has been retrieved
       String getInput = null;
       Scanner keyboard = new Scanner(System.in);   // keyboard input stream
       
       while (!valid) { // while a valid answer has not been retrieved
           
           //prompt for the player's answer
           
          
           // get the answer from the keyboard and trim off the blanks
          getInput = keyboard.nextLine();
           getInput = getInput.trim();
           
           //if the answer is invalid (less than two character in lenght))
           if (getInput. length() <1){
               ErrorView.display(this.getClass().getName(),
                       "That is an invalid response.");
               continue; // and repeat again
               
           }
           break; // out of the (exit) the repetition
       }
       return getInput; //return the answer
    }



public static int randInt(int min, int max) {    // Usually this can be a field rather than a method variable    
    Random rand = new Random();    // nextInt is normally exclusive of the top value,    
                                   // so add 1 to make it inclusive    
    int randomNum = rand.nextInt((max - min) + 1) + min;    
    return randomNum;
}

public static int getTubCapacity(){
    return randInt(100, 200);
}
 
 
    private int doAction(int minutes) throws PuzzleWaterSceneException {
        if (minutes < 1)
          return -1;
  
           double fillRate = PuzzleSceneWater.calcTubFillRate (tubGallons, 2.2);
            if (fillRate == -1)
            return -2;
        
           double fillTime = PuzzleSceneWater.calcTotalFillTime(fillRate, tubGallons);
             if (fillTime == -1)
             return -2;
        
           int iFillTime = (int)Math.round(fillTime);
            if (iFillTime == minutes)
            return 1;
        
        return 0;
        
    }
}
