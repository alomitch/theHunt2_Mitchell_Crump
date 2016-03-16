/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.control;

import citbyu.cit260.theHunt2.exceptions.InventoryItemException;

/**
 *
 * @author AlleciaMitchell
 */
public class InventoryItem {
        String description;
        int quantityInStock;
       int requiredAmount; 
       int maximumAmount;
       
       
    public double  calcSpeedOfTrainA ( double speed,  double distance ) throws InventoryItemException {
             if ( speed != 35) {
                // return-1;
                throw new InventoryItemException("That is the incorrect value for speed");
             }
             if ( distance != 100){
               //  return-1;
                 throw new InventoryItemException("That is the incorrect value for distance");
             }
            double travelTimeA = speed / distance;
            double totalTravelTimeA = 0;
             return totalTravelTimeA;
    }  
             
    public double calcSpeedOfTrainB ( double speed, double distance) throws InventoryItemException{
                 if ( speed != 70){
                    // return -1;
                     throw new InventoryItemException("That is the incorrect value for speed");
                 }
                 if (distance!=200){
                    // return -1;
                     throw new InventoryItemException("That is the incorrect value for distance");
                 }
                 double travelTimeB = speed / distance;
        double totalTravelTimeB = 0;
                 return totalTravelTimeB;
    }               
           
       public double calcTotalTravelTime (double travelTimeA, double travelTimeB) throws InventoryItemException{
               if ( travelTimeA != .35){
                        //return -1;
                         throw new InventoryItemException("That is the incorrect value for Travel Time For Train A");
                }
               if ( travelTimeB != .35){
                         //return -1;     
                          throw new InventoryItemException("That is the incorrect value for Travel Time For Train B");
               }
               double totalTravelTime = travelTimeA + travelTimeB;
               return totalTravelTime;
       }

    public String getDescription() {
        return description;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public int getMaximumAmount() {
        return maximumAmount;    
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public void setMaximumAmount(int maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

}
