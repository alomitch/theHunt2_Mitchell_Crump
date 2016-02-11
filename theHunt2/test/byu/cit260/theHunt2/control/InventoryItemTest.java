/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mikec_000
 */
public class InventoryItemTest {
    
    public InventoryItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test case #1
     * Test of calcSpeedOfTrainA method, of class InventoryItem.
     */
    @Test
    public void testCalcSpeedOfTrainA() {
        System.out.println("calcSpeedOfTrainA");
        double speed = 35.0;
        double distance = 100.0;
        InventoryItem instance = new InventoryItem();
        double expResult = 0.35;
        double result = instance.calcSpeedOfTrainA(speed, distance);
        assertEquals(expResult, result, 0.35);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcSpeedOfTrainB method, of class InventoryItem.
     */
    @Test
    public void testCalcSpeedOfTrainB() {
        System.out.println("calcSpeedOfTrainB");
        double speed = 70.0;
        double distance = 200.0;
        InventoryItem instance = new InventoryItem();
        double expResult = 0.35;
        double result = instance.calcSpeedOfTrainB(speed, distance);
        assertEquals(expResult, result, 0.35);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcTotalTravelTime method, of class InventoryItem.
     */
    @Test
    public void testCalcTotalTravelTime() {
        System.out.println("calcTotalTravelTime");
        double travelTimeA = 0.35;
        double travelTimeB = 0.35;
        InventoryItem instance = new InventoryItem();
        double expResult = 0.7;
        double result = instance.calcTotalTravelTime(travelTimeA, travelTimeB);
        assertEquals(expResult, result, 0.7);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     /**
     * Test case #2
     * Test of calcSpeedOfTrainA method, of class InventoryItem.
     */
    @Test
    public void testCalcSpeedOfTrainA() {
        System.out.println("calcSpeedOfTrainA");
        double speed = -1.0;
        double distance = 100.0;
        InventoryItem instance = new InventoryItem();
        double expResult = -1.0;
        double result = instance.calcSpeedOfTrainA(speed, distance);
        assertEquals(expResult, result, -1.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcSpeedOfTrainB method, of class InventoryItem.
     */
    @Test
    public void testCalcSpeedOfTrainB() {
        System.out.println("calcSpeedOfTrainB");
        double speed = -1.0;
        double distance = 200.0;
        InventoryItem instance = new InventoryItem();
        double expResult = -1.0;
        double result = instance.calcSpeedOfTrainB(speed, distance);
        assertEquals(expResult, result, -1.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcTotalTravelTime method, of class InventoryItem.
     */
    @Test
    public void testCalcTotalTravelTime() {
        System.out.println("calcTotalTravelTime");
        double travelTimeA = -1.0;
        double travelTimeB = -1.0;
        InventoryItem instance = new InventoryItem();
        double expResult = -1.0;
        double result = instance.calcTotalTravelTime(travelTimeA, travelTimeB);
        assertEquals(expResult, result, -1.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     /**
     * Test case #3
     * Test of calcSpeedOfTrainA method, of class InventoryItem.
     */
    @Test
    public void testCalcSpeedOfTrainA() {
        System.out.println("calcSpeedOfTrainA");
        double speed = -1.0;
        double distance = 100.0;
        InventoryItem instance = new InventoryItem();
        double expResult = -1.0;
        double result = instance.calcSpeedOfTrainA(speed, distance);
        assertEquals(expResult, result, -1.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcSpeedOfTrainB method, of class InventoryItem.
     */
    @Test
    public void testCalcSpeedOfTrainB() {
        System.out.println("calcSpeedOfTrainB");
        double speed = -1.0;
        double distance = 200.0;
        InventoryItem instance = new InventoryItem();
        double expResult = -1.0;
        double result = instance.calcSpeedOfTrainB(speed, distance);
        assertEquals(expResult, result, -1.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcTotalTravelTime method, of class InventoryItem.
     */
    @Test
    public void testCalcTotalTravelTime() {
        System.out.println("calcTotalTravelTime");
        double travelTimeA = -1.0;
        double travelTimeB = -1.0;
        InventoryItem instance = new InventoryItem();
        double expResult = -1.0;
        double result = instance.calcTotalTravelTime(travelTimeA, travelTimeB);
        assertEquals(expResult, result, -1.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
