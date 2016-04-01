/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.control;

import citbyu.cit260.theHunt2.exceptions.HalfGallonPuzzleException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AlleciaMitchell
 */
public class PuzzleHalfGallonTest {
    
    public PuzzleHalfGallonTest() {
    }

    /**
     * Test of calcTspInHalfGallon method, of class PuzzleTeaspoon.
     */
    @Test
    public void testCalcHalfGallon() throws HalfGallonPuzzleException {
        System.out.println("calcHalfGallon");
        /****************
         * Test case #1
         ***************/
        System.out.println("/tTest case #1");
        
        //input values
        double teaspoon = 3.0;
        double tablespoon = 16.0;
        double cup = 16.0;
        
        
        //expected output result
        double expResult = 786.0; 
        
        //create instance
        PuzzleHalfGallon instance = new PuzzleHalfGallon();
        String units = null;
        
        // call function to run test
        boolean result = PuzzleHalfGallon.calcHalfGallon(cup, units);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 786.0);
       
        
        
         /****************
         * Test case #2
         ***************/
        System.out.println("/tTest case #2");
        
        //input values
        teaspoon = -1.0;
        tablespoon = 16.0;
        cup = 16.0;
        
        
        //expected output result
        expResult = -1.0; 
        
        // call function to run test
         result = PuzzleHalfGallon.calcHalfGallon(tablespoon,  units);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, -1.0);
  
        
        
        /****************
         * Test case #3
         ***************/
        System.out.println("/tTest case #3");
        
        //input values
        teaspoon = 3.0;
        tablespoon = -1.0;
        cup = -1.0;
        
        
        //expected output result
        expResult = -1.0; 
        
        // call function to run test
         result = PuzzleHalfGallon.calcHalfGallon(teaspoon, units);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, -1.0);
       
        
        
        
        
      /****************
         * Test case #4
         ***************/
        System.out.println("/tTest case #4");
        
        //input values
        teaspoon = 3.0;
        tablespoon = 19.0;
        cup = 25.0;
        
        
        //expected output result
        expResult = -1.0; 
        
        // call function to run test
         result = PuzzleHalfGallon.calcHalfGallon(cup, units);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, -1.0);   
        
        
        
       /****************
         * Test case #5
         ***************/
        System.out.println("/tTest case #5");
        
        //input values
        teaspoon = 3.0;
        tablespoon = 16.0;
        cup = 16.0;
        
        
        //expected output result
        expResult = 786.0; 
        
        // call function to run test
         result = PuzzleHalfGallon.calcHalfGallon(tablespoon, units);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 786.0);    
        
    }

    private void assertEquals(double expResult, boolean result, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
