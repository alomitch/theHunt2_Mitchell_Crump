/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.control;

/**
 *
 * @author mikec_000
 */
public class PuzzleSceneWater {
    
    public double calcTubFillRate ( double volume, double gpm) {
             if ( volume != 40) {
                 return-1;
             }
             if ( gpm != 2.2){
                 return-1;
             }
             
            double tubFillRate = volume / gpm;
            
             return tubFillRate;
    }  
             
    public double calcTotalFillTime ( double tubFillRate, double numberOfFills){
                 if ( tubFillRate != 18.18){
                     return -1;
                 }
                 if (numberOfFills != 3){
                     return -1;
                 }
                 double totalFillTime = tubFillRate * numberOfFills;
        
                 return totalFillTime;
    }               
           
          
}
