/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import byu.cit260.theHunt2.control.PuzzleTeaspoon;
import java.util.Scanner;


/**
 *
 * @author AlleciaMitchell
 */
public class TeaspoonPuzzle {
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
            + "\nthe water to even fill up the half gallon jug. "
            +"\n-----------------------------------------";

    public void displayMenu() {
        
        char selection = ' ';
      //  do {
               
            System.out.println(MENU); // display the Teaspoon Puzzle
       
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
              
          PuzzleTeaspoon.calcTeaspoons(iTeaspoon,iTablespoon,iCup);
       
     //   } while (selection != 'E'); // while selection is not "Exit"
       
    }

    private String getInput() {
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
   
    
}
    
