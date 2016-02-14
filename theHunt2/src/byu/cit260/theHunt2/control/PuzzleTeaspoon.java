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
public class PuzzleTeaspoon {

    double calcTspInHalfGallon(double teaspoon, double tablespoon, double cup){
        if ( teaspoon != 3){
            return -1;
        }
        if (tablespoon !=16){
            return -1;
        }
        if (cup != 16){
            return-1;
        }
      
        double amtTeaspoon = (teaspoon * tablespoon * cup ) /  2;
        return amtTeaspoon;
    }
}

    

