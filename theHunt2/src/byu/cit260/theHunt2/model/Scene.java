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
 * @author mikec_000
 */
public class Scene implements Serializable{
    
    //class instance variables
    private String description;
    private double travelTime;
    private double blocked;
    private String symbol;

    private static boolean createScenes() {
        Scene[] game = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
            "\nAfter dragging your boat ashore, you find yourself on a tropical beach.  "
            + "The brush grows thick before you, but you can make out several paths which "
            + "appear to lead deep into the island.  In the distance, you can see tropical"
            + " waterfalls cascading from precipitous heights.  High atop distand cliffs, "
            + "you see what appears to be ancient ruins covered in thick vines and ages of"
            + " growth.  You beach your craft securely, then consider your backpack resting "
            + "in the bow of the boat.  Should you travel light through the brush, or bring "
            + "your pack in case you find anything interesting along the way?");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        Scene[] scenes = null;
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
            "\nFrom within the mountain you hear strange machinery and complex gears working."
            + "  The giant stone wheel rolls slowly to the left, revealing a clever chamber "
            + "hidden within.  As the light from behind you streams into the chamber, you "
            + "notice gold, jewels, and precious treasures.  With a smile on your face, you "
            + "wonder just how much will fit in your pack.");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return false;

    }

    private void setBlocked(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setMapSymbol(String _fn_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    public enum SceneType {
        start,
        beach,
        path,
        waterPuzzle,
        halfGallonPuzzle,
        waterfall,
        treasureRoom,
        finish,
    }
    
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public double getBlocked() {
        return blocked;
    }

    public void setBlocked(double blocked) {
        this.blocked = blocked;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.blocked) ^ (Double.doubleToLongBits(this.blocked) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.symbol);
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
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.blocked) != Double.doubleToLongBits(other.blocked)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", travelTime=" + travelTime + ", blocked=" + blocked + ", symbol=" + symbol + '}';
    }

    public void setSymbol(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    
    
}
