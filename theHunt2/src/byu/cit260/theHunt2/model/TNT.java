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
public class TNT implements Serializable{
    
    //classes instance variables
    private int maxUsage;
    private int currentUsage;

    public TNT() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.maxUsage);
        hash = 79 * hash + Objects.hashCode(this.currentUsage);
        return hash;
    }

    @Override
    public String toString() {
        return "TNT{" + "maxUsage=" + maxUsage + ", currentUsage=" + currentUsage + '}';
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
        final TNT other = (TNT) obj;
        if (!Objects.equals(this.maxUsage, other.maxUsage)) {
            return false;
        }
        if (!Objects.equals(this.currentUsage, other.currentUsage)) {
            return false;
        }
        return true;
    }

    
    
    public int getMaxUsage() {
        return maxUsage;
    }

    public void setMaxUsage(int maxUsage) {
        this.maxUsage = maxUsage;
    }

    public int getCurrentUsage() {
        return currentUsage;
    }

    public void setCurrentUsage(int currentUsage) {
        this.currentUsage = currentUsage;
    }
    
    
    
}
