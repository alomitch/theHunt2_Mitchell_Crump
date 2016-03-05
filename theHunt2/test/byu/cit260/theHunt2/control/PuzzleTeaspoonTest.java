/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AlleciaMitchell
 */
public class PuzzleTeaspoonTest {
    
    public PuzzleTeaspoonTest() {
    }

    /**
     * Test of calcTspInHalfGallon method, of class PuzzleTeaspoon.
     */
    @Test
    public void testCalcTspInHalfGallon() {
        System.out.println("calcTspInHalfGallon");
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
        PuzzleTeaspoon instance = new PuzzleTeaspoon();
        
        // call function to run test
        double result = PuzzleTeaspoon.calcTeaspoons(teaspoon, tablespoon, cup);
        
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
         result = PuzzleTeaspoon.calcTeaspoons(teaspoon, tablespoon, cup);
        
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
         result = PuzzleTeaspoon.calcTeaspoons(teaspoon, tablespoon, cup);
        
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
         result = PuzzleTeaspoon.calcTeaspoons(teaspoon, tablespoon, cup);
        
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
         result = PuzzleTeaspoon.calcTeaspoons(teaspoon, tablespoon, cup);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 786.0);    
        
    }
    
}
