/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.model;

import citbyui.cit260.theHunt2.view.ErrorView;
import java.io.Serializable;

/**
 *
 * @author mikec_000
 */
public class Map implements Serializable{
    
    public static Map[] getMapLoctionsCurrentGame() {
      System.out.println("\n ***getMapLocationsCurrentGame stub function called ***");
      return null;
    }
    
    //class instance variables
    private double rowCount;
    private double columnCount;
    public Location[][] locations;
    public String name;
    public String description;
    private Location currentLocation;

    public Map() {
    }

    public Map(int rowCount, int columnCount) {
        
        if (rowCount < 1 || columnCount < 1) {
            ErrorView.display(this.getClass().getName(),
                        "The number of rows and columns must be > zero");
            return;
        }
        
         
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        //create 2-D array for location objects
        this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
             for (int col= 0; col < columnCount; col++) {
                 Location location = new Location();
                 location.setColumn(col);
                 location.setRow(row);
                 location.setVisited(false);
            
                 //assign the Location object to the current position in array
                 locations[row][col] = location;
             }
          
        }
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
        currentLocation.setVisited(true);
    }
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    public void setCoordinates(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setName(String the_Hunt) {
        System.out.println("** get setName function***");
    }

    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public int getNoOfRows() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public int getNoOfColumns() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

   

  
        
}
