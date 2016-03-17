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
public abstract class HalfGallonPuzzle extends View {
    
    public HalfGallonPuzzle(){
            super("\n"
           //private final String MENU = "\n"
            +"\n-----------------------------------------"
            + "\n| Half Gallon Puzzle                         |"
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
            +"\n-----------------------------------------");
    }
    private boolean input;

    public void displayMenu() {
        
        
        char selection = ' ';
       // do {
               
            //System.out.println(MENU); // display the main menu
            
            System.out.println("Out of either cups,tablespoons,or teaspoons how many of either group would fill "
                    + "up a half  gallon");
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
           System.out.println("Enter the number of teaspoons:");
               String teaspoon = getInput();  
               int iTeaspoon = Integer.parseInt(teaspoon);
            System.out.println("Enter the number of tablespoons :");
               String tablespoon = getInput();
               int iTablespoon = Integer.parseInt(tablespoon);   
           System.out.println("Enter the number of cups:");    
              String cup = getInput();
              int iCup = Integer.parseInt(cup);
              
        boolean calcHalfGallon = PuzzleHalfGallon.calcHalfGallon(selection, input)
                // } while (selection != 'E'); // while selection is not "Exit"
;
       
    }
    
    @Override
  public String getInput() {
         boolean valid = false; // indicates if the answer has been retrieved
       String input = null;
       Scanner keyboard = new Scanner(System.in);   // keyboard input stream
       
       while (!valid) { // while a valid answer has not been retrieved
           
           //prompt for the player's answer
          // System.out.println("I have a teaspoon. How many times will I need to fill the teaspoon to fill a half gallon jug?");
          
           // get the answer from the keyboard and trim off the blanks
           input = keyboard.nextLine();
           input= input.trim();
           
           //if the answer is invalid (less than two character in lenght))
           if (input. length() <1){
               System.out.println("That is an invalid response.");
               continue; // and repeat again
               
           }
           break; // out of the (exit) the repetition
       }
       return input; //return the answer
  }
  
  
    @Override
     public boolean doAction(String value) {
        char choice = value.charAt(0);
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
        return input;
     }//end of method
    
    

     private void teaspoon() {
            String teaspoon = getInput(); 
       try{ 
            int Teaspoon = Integer.parseInt(teaspoon);
            
       }catch (NumberFormatException nf){
           System.out.println("\nYou must enter a valid number."
                                         + "Try again or enter Q to quit.");
       }
 } 
 public void tablespoon() {
             String tablespoon = getInput();
       try{
              int Tablespoon = Integer.parseInt(tablespoon); 
       }catch (NumberFormatException nf){
           System.out.println("\nYou must enter a valid number."
                                    + "Try again or enter Q to quit.");
       }
    }

    public void cups() {
            String cup = getInput();
      try{
             int Cup = Integer.parseInt(cup);
      }catch (NumberFormatException nf){
          System.out.println("\n You must enter a valid number."
                                    + " Try again or enter Q to quit.");
      }
              
    
    }
}

  
    
//PuzzleHalfGallon.calcHalfGallon(double quantity, String unit);