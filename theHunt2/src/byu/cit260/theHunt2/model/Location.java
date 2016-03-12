/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.model;

import byu.cit260.theHunt2.model.Scene.SceneType;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mikec_000
 */
public class Location implements Serializable{
    
    //class instance variables
    private double row;
    private double column;
    private double amountRemaining;
    private boolean visited;
    private Scene scene;
    private ArrayList<Actor> actors;

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    void setVisited(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public boolean isVisited() {
        return visited;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }
    
       public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public Location() {
    }
    
    

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public double getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.amountRemaining) ^ (Double.doubleToLongBits(this.amountRemaining) >>> 32));
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountRemaining) != Double.doubleToLongBits(other.amountRemaining)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", amountRemaining=" + amountRemaining + '}';
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location [][] locations = map.getLocations();
        Scene[] Scenes = null;
        
        //start point
        locations[0][0].setScene(Scenes[SceneType.beach.ordinal()]);
        locations[0][1].setScene(Scenes[SceneType.path.ordinal()]);
        locations[0][2].setScene(Scenes[SceneType.waterPuzzle.ordinal()]);
        locations[0][3].setScene(Scenes[SceneType.halfGallonPuzzle.ordinal()]);
        locations[0][4].setScene(Scenes[SceneType.waterfall.ordinal()]);
        locations[0][5].setScene(Scenes[SceneType.treasureRoom.ordinal()]);
        locations[0][6].setScene(Scenes[SceneType.finish.ordinal()]);
    }

    public Object getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

