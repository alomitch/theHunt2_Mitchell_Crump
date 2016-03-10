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
public class InventoryItem {
    
    
    public double calcSpeedOfTrainA ( double speed,  double distance ) {
             if ( speed != 35) {
                 return-1;
             }
             if ( distance != 100){
                 return-1;
             }
            double travelTimeA = speed / distance;
            double totalTravelTimeA = 0;
             return totalTravelTimeA;
    }  
             
    public double calcSpeedOfTrainB ( double speed, double distance){
                 if ( speed != 70){
                     return -1;
                 }
                 if (distance!=200){
                     return -1;
                 }
                 double travelTimeB = speed / distance;
        double totalTravelTimeB = 0;
                 return totalTravelTimeB;
    }               
           
       public double calcTotalTravelTime (double travelTimeA, double travelTimeB){
               if ( travelTimeA != .35){
                        return -1;
                }
               if ( travelTimeB != .35){
                         return -1;     
               }
               double totalTravelTime = travelTimeA + travelTimeB;
               return totalTravelTime;
       }

    void setDescription(String backpack) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setRequiredAmount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setMaximumAmount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
