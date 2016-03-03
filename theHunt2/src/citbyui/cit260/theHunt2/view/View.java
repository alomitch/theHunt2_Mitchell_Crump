/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import java.util.Scanner;
import static sun.font.GlyphLayout.done;

/**
 *
 * @author AlleciaMitchell
 */
public abstract class View extends ViewInterface {
    protected String displayMessage;
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public String display () {
        
        boolean done = false;   
        do{
            //prompt for  and get players name
            String value = this. getInput();
            if ( value.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the view
            
            // do the requested action and display the next view
            done = this.doAction(value);
        }  while (!done); // exit the view when done == true
    }
    
@Override         
 public String getInput() {
         Scanner keyboard = new Scanner(System.in);   // keyboard input stream
         boolean valid = false; // indicates if the name has been retrieved
          String value = null;
          
       // while a valid name has not been retrieved
       while (!valid) { 
           
           //prompt for the player's name
           System.out.println("\n"+ this.displayMessage);
          
           // get the name from the keyboard and trim off the blanks
          value = keyboard.nextLine();
          value = value.trim();
           
           //blank value entered
           if (value. length() <1){
               System.out.println("\n *** You must enter a value ***");
               continue;   
           }
           break; 
       }
       return value; //return the name
       }
    
        
    
