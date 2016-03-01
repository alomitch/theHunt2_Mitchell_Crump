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
    Scanner keyboard = new Scanner (System.in);
    protected String displayMessage;
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display (){
        String value= "";
        boolean done = false;
        
        do{
            System.out.println(this.displayMessage);
            value = this.getInput();
            done = this.doAction(value);
        }   
        while (!done);
    }

