/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author AlleciaMitchell
 */

public class AidBag implements Serializable{


    // class instance variables
    private int maxCapacity;
    private int currentCapacity;

    public AidBag() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.maxCapacity);
        hash = 79 * hash + Objects.hashCode(this.currentCapacity);
        return hash;
    }

    @Override
    public String toString() {
        return "AidBag{" + "maxCapacity=" + maxCapacity + ", currentCapacity=" + currentCapacity + '}';
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
        final AidBag other = (AidBag) obj;
        if (!Objects.equals(this.maxCapacity, other.maxCapacity)) {
            return false;
        }
        if (!Objects.equals(this.currentCapacity, other.currentCapacity)) {
            return false;
        }
        return true;
    }

    
    
    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }
    
    
    
}


