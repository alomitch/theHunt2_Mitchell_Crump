/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.control;

import citbyu.cit260.theHunt2.exceptions.PuzzleWaterSceneException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mikec_000
 */
public class PuzzleSceneWaterTest {
    
    public PuzzleSceneWaterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcTubFillRate method, of class PuzzleSceneWater.
     */
    @Test
    public void testCalcTubFillRate() throws PuzzleWaterSceneException {
        System.out.println("calcTubFillRate");
        /****************
         * Test case #1
         ***************/
        
        //input values for test case 1
        double volume = 40.0;
        double gpm = 2.2;
                
        double expResult = 18.18; // expected output value
        
        //create instance of PuzzleSceneWater class
        PuzzleSceneWater instance = new PuzzleSceneWater();
        
        //call function to run test
        double result = instance.calcTubFillRate((int) volume, gpm);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 18.18);
        
    }

    /**
     * Test of calcTotalFillTime method, of class PuzzleSceneWater.
     */
    @Test
    public void testCalcTotalFillTime() throws PuzzleWaterSceneException {
        System.out.println("calcTotalFillTime");
        double tubFillRate = 18.18;
        double numberOfFills = 3.0;
        PuzzleSceneWater instance = new PuzzleSceneWater();
        double expResult = 54.54;
        double result = instance.calcTotalFillTime(tubFillRate, numberOfFills);
        assertEquals(expResult, result, 54.54);
        
     /**
     * Test case #2
     * Test of calcTubFillRate method, of class PuzzleSceneWater.
     */
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        double volume = -1.0;
        double gpm = 2.2;
        numberOfFills = 3.0;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.calcTubFillRate((int) volume, gpm);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, -1.0);
             
    /**
     * Test case #3
     * Test of calcTubFillRate method, of class PuzzleSceneWater.
     */
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        volume = 40.0;
        gpm = -1;
        numberOfFills = 3.0;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.calcTubFillRate((int) volume, gpm);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, -1.0);
        
    /**
     * Test case #4
     * Test of calcTubFillRate method, of class PuzzleSceneWater.
     */
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        volume = 40.0;
        gpm = 2.2;
        numberOfFills = -1;
        
        expResult = 18.18181818181818; // expected output returned value
        
        // call function to run test
        result = instance.calcTubFillRate((int) volume, gpm);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 18.18181818181818);
     
    /**
     * Test case #5
     * Test of calcTubFillRate method, of class PuzzleSceneWater.
     */
        System.out.println("\tTest case #5");
        
        // input values for test case 5
        volume = 40.0;
        gpm = 2.2;
        numberOfFills = 3.0;
        
        expResult = 54.54; // expected output returned value
        
        // call function to run test
        result = instance.calcTubFillRate((int) volume, gpm);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 54.54);
        
    }
    
}
