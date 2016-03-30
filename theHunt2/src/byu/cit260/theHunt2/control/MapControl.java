/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.control;

import byu.cit260.theHunt2.model.Actor;
import byu.cit260.theHunt2.model.Location;
import byu.cit260.theHunt2.model.Map;
import byu.cit260.theHunt2.model.Scene;
import citbyu.cit260.theHunt2.exceptions.MapControlException;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import thehunt2.theHunt2;

/**
 *
 * @author mikec_000
 */
public class MapControl {

    static Map createMap() {
        // create the map
        Map map = new Map (5, 5);
        
        // create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        // assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
        
        try {
            movePlayerToStartingLocation(map);
        } catch (MapControlException ex) {
            Logger.getLogger(MapControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return map;
    }

    
    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[Scene.SceneType.values().length];
        int numberOfScenes = Scene.SceneType.values().length;
        
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
        startingScene.setSymbol("ST");
        startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[Scene.SceneType.start.ordinal()] = startingScene;
        
        Scene newScene = new Scene();
        newScene.setDescription("\nLet's choose where to go to find the hidden treasure!.  ");
        newScene.setSymbol("BH");
        newScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[Scene.SceneType.beach.ordinal()] = newScene;
        
        Scene puzzleScene = new Scene();
        puzzleScene.setDescription("\nYou have arrived at a puzzle scene. Figure out the puzzle of the Half Gallon.  ");
        puzzleScene.setSymbol("HG");
        puzzleScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[Scene.SceneType.halfGallonPuzzle.ordinal()] = puzzleScene;
        
        Scene pathScene = new Scene();
        pathScene.setDescription("\nThere is only trees on this path.We need to keep moving to find out where the treasure is. It's time to move to another location. ");
        pathScene.setSymbol("TH");
        pathScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[Scene.SceneType.path.ordinal()] = pathScene;
        
         Scene treasureRoomScene = new Scene();
        treasureRoomScene.setDescription("\nWe finally made it! The treasure room! Use all you know to unlock the treasure!");
        treasureRoomScene.setSymbol("TR");
        treasureRoomScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[Scene.SceneType.treasureRoom.ordinal()] = treasureRoomScene;
        
         Scene waterPuzzleScene = new Scene();
        waterPuzzleScene.setDescription("\nYou have arrived at a puzzle scene. Figure out the water puzzle. ");
        waterPuzzleScene.setSymbol("WP");
        waterPuzzleScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[Scene.SceneType.waterPuzzle.ordinal()] = waterPuzzleScene;
        
         Scene waterfallScene = new Scene();
        waterfallScene.setDescription("\nYou have reached a waterfall. Is there anything useful here to uncover the treasure?  ");
        waterfallScene.setSymbol("WF");
        waterfallScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[Scene.SceneType.waterfall.ordinal()] = waterfallScene;
        
        
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
            "\nFrom within the mountain you hear strange machinery and complex gears working."
            + "  The giant stone wheel rolls slowly to the left, revealing a clever chamber "
            + "hidden within.  As the light from behind you streams into the chamber, you "
            + "notice gold, jewels, and precious treasures.  With a smile on your face, you "
            + "wonder just how much will fit in your pack.");
        finishScene.setSymbol("FN");
        finishScene.setBlocked(false);
       // finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[Scene.SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location [][] locations = map.getLocations();

        String testSymbol = scenes[Scene.SceneType.path.ordinal()].getSymbol();
        //start point
        locations[0][0].setScene(scenes[Scene.SceneType.beach.ordinal()]);
        locations[0][1].setScene(scenes[Scene.SceneType.beach.ordinal()]);
        locations[0][2].setScene(scenes[Scene.SceneType.beach.ordinal()]);
        locations[0][3].setScene(scenes[Scene.SceneType.beach.ordinal()]);
        locations[0][4].setScene(scenes[Scene.SceneType.beach.ordinal()]);
        locations[1][0].setScene(scenes[Scene.SceneType.beach.ordinal()]);
        locations[1][1].setScene(scenes[Scene.SceneType.path.ordinal()]);
        locations[1][2].setScene(scenes[Scene.SceneType.waterPuzzle.ordinal()]);
        locations[1][3].setScene(scenes[Scene.SceneType.halfGallonPuzzle.ordinal()]);
        locations[1][4].setScene(scenes[Scene.SceneType.waterfall.ordinal()]);
        locations[2][0].setScene(scenes[Scene.SceneType.beach.ordinal()]);
        locations[2][1].setScene(scenes[Scene.SceneType.treasureRoom.ordinal()]);
        locations[2][2].setScene(scenes[Scene.SceneType.path.ordinal()]);
        locations[2][3].setScene(scenes[Scene.SceneType.finish.ordinal()]);
        locations[2][4].setScene(scenes[Scene.SceneType.beach.ordinal()]);
        locations[3][0].setScene(scenes[Scene.SceneType.beach.ordinal()]);
        locations[3][1].setScene(scenes[Scene.SceneType.waterfall.ordinal()]);
        locations[3][2].setScene(scenes[Scene.SceneType.path.ordinal()]);
        locations[3][3].setScene(scenes[Scene.SceneType.waterfall.ordinal()]);
        locations[3][4].setScene(scenes[Scene.SceneType.beach.ordinal()]);
        locations[4][0].setScene(scenes[Scene.SceneType.beach.ordinal()]);
        locations[4][1].setScene(scenes[Scene.SceneType.beach.ordinal()]);
        locations[4][2].setScene(scenes[Scene.SceneType.beach.ordinal()]);
        locations[4][3].setScene(scenes[Scene.SceneType.beach.ordinal()]);
        locations[4][4].setScene(scenes[Scene.SceneType.beach.ordinal()]);
        //add 14 more locations and make it look pretty.
    }

    
    public static void movePlayerToStartingLocation (Map map)
                                      throws MapControlException {
        //for every actor
//        Actor [] actors = Actor.values();
//        
//        for (Actor actor : actors){
//            Point coordinates = actor.getCoordinates();
            MapControl.movePlayerToLocation(map,0,0);

        
       
    }

    /**
     *
     * @param actor
     * @param coordinates
     * @return
     * @throws MapControlException
     */
    public static void movePlayerToLocation(Map map, int row, int column)  
                                            throws MapControlException{
        //Map map = theHunt2.getCurrentGame().getMap();
//           int newRow = coordinates.x-1;
//           int newColumn = coordinates. y-1;
      
         if (row < 0 || row >= map.getRowCount()||
                column<0 ||column>= map.getColumnCount()) {
                throw new MapControlException("Can not move actor to location"
                                                                            + row + "," + column
                                                                             +"because that location is outside"
                                                                            + "the bounds of the map.");
        }
         map.setCurrentLocation(map.getLocations()[row][column]);
       //   return 0;
    }
   
}


//  public static in moveActorsToStartingLocation (Map,map){
//   //for every actor
//    Actor[] actors = Actor.values();
//
//     for (Actor actor :actors){
//            Point coordinates = actor.getCoordinates();
//             int returnValue =MapControl.moveActorToLocation(actor,coordinates);
//             if (returnValue <0){
//             return returnValue;
//}
//
//}
//}