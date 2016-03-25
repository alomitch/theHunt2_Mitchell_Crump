/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import java.io.PrintWriter;
import byu.cit260.theHunt2.model.Location;
import byu.cit260.theHunt2.model.Map;
import java.io.BufferedReader;
import thehunt2.theHunt2;
        
/**
 *
 * @author AlleciaMitchell
 */
public class ScenesNotEqual {
    
    protected final BufferedReader keyboard = theHunt2.getInfile();
    protected final PrintWriter console = theHunt2.getOutfile();
    
    //get count of scenes that are not equal to null(build function) (incriment a counter)
     public void scensNotEqual(){
    Map map= theHunt2.getCurrentGame().getMap(); // Map.getMapLocationsCurrentGame();
       Location[][] loc = map.getLocations();
   
    
        for(int row = 0; row< loc.length; row++) {    
                    this.console.print("row "+ row + " : " );
                
               for(int col=0; col<loc[row].length; col++){
                    this.console.print("|"); 
                  Location curLoc =loc [row][col];
                  if(   !(curLoc.getScene() ==null))
                      this.console.print(curLoc.getScene().getSymbol()); 
                  else
                      this.console.print(" Scenes Not Equal To Null "+ curLoc.getScene().getSymbol()); 
                 }
   }
}   
}
