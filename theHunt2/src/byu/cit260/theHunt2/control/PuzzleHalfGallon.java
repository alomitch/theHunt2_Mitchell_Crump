/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.control;

/**
 *
 * @author AlleciaMitchell
 */
public class PuzzleHalfGallon {

    public static boolean calcHalfGallon(double quantity, String units){
       int teaspoonsInHalfGallon = 384;
        if (quantity <= 0){
         return false;    
        }
        
        if (units.equals ("teaspoon")){
         return (quantity == teaspoonsInHalfGallon);
        } 
        
         if (units.equals (" tablespoon"))
              return (quantity * 3 == teaspoonsInHalfGallon);
         
         if (units.equals ("cup"))
              return (quantity *48 == teaspoonsInHalfGallon);
         
         return false;
    }               

    
}
        
   //    double amtHalfGallon= 384 teaspoon
      // double amtHalfGallon= 128 tablespoon
       //double amtHalfGallon= 8 cup
     // If ( double jugTeaspoon = 384);
        // return teaspoon;
