/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.control;

import citbyu.cit260.theHunt2.exceptions.PuzzleWaterSceneException;

/**
 *
 * @author mikec_000
 */
public class PuzzleSceneWater {
    
    public static double calcTubFillRate ( int volume, double gpm) throws PuzzleWaterSceneException {
             if ( volume < 100 || volume > 200) {
               //  return-1;
               throw new PuzzleWaterSceneException("This is not the right amount of volume.Try again.");
             }
             if ( gpm != 2.2){
                // return-1;
                throw new PuzzleWaterSceneException("This is not the right amount of gpm. Try again.");
             }
             
            double tubFillRate = volume / gpm;
            
             return tubFillRate;
    }  
             
    public static double calcTotalFillTime ( double tubFillRate, double numberOfGallons){
                 if (tubFillRate <= 0){
                     return -1;
                 }
                 if (numberOfGallons <= 0){
                     return -1;
                 }
                 double totalFillTime = numberOfGallons / tubFillRate;
        
                 return totalFillTime;
    }               
           
          
}
