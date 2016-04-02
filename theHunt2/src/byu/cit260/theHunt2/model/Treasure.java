/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.model;

import byu.cit260.theHunt2.control.GameControl.Item;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author AlleciaMitchell
 */
public class Treasure implements Serializable {
    
        //class instance variables
        private String description;
        private double value;

    public Treasure() {
        this.description = "\nThis is the treasure hidden on the island.  If you"
                        + "\n can find it, you'll be rich beyond your wildest dreams!";
        
        
        int key = inventory[Item.key.ordinal].getQuantityInStock();
 
if ( row == 1 && column == 2 && key == 1)  {
      display scene
}  else  {
       this.console.println("You need a key to access this location")
       }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.value) ^ (Double.doubleToLongBits(this.value) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Treasure{" + "description=" + description + ", value=" + value + '}';
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
        final Treasure other = (Treasure) obj;
        if (Double.doubleToLongBits(this.value) != Double.doubleToLongBits(other.value)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

        
        
        
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
        
    
    
    
}

