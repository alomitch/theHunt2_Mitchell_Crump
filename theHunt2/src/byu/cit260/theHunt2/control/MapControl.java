/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.control;

import byu.cit260.theHunt2.model.Location;
import byu.cit260.theHunt2.model.Map;
import byu.cit260.theHunt2.model.Scene;

/**
 *
 * @author mikec_000
 */
public class MapControl {

    static Map createMap() {
        // create the map
        Map map = new Map (20, 20);
        
        // create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        // assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
    }

    //static void moveActorsToStartingLocation(Map map) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

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
        startingScene.setSymbol(" ST ");
        startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[Scene.SceneType.start.ordinal()] = startingScene;
        
        Scene newScene = new Scene();
        newScene.setDescription("\nTODO:We need to add a description here.  ");
        newScene.setSymbol(" BH ");
        newScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[Scene.SceneType.beach.ordinal()] = newScene;
        
        Scene puzzleScene = new Scene();
        puzzleScene.setDescription("\nTODO:We need to add a description here.  ");
        puzzleScene.setSymbol(" HG ");
        puzzleScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[Scene.SceneType.halfGallonPuzzle.ordinal()] = puzzleScene;
        
        Scene pathScene = new Scene();
        pathScene.setDescription("\nTODO:We need to add a description here.  ");
        pathScene.setSymbol(" TH ");
        pathScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[Scene.SceneType.path.ordinal()] = pathScene;
        
         Scene treasureRoomScene = new Scene();
        treasureRoomScene.setDescription("\nTODO:We need to add a description here.  ");
        treasureRoomScene.setSymbol(" TR ");
        treasureRoomScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[Scene.SceneType.treasureRoom.ordinal()] = treasureRoomScene;
        
         Scene waterPuzzleScene = new Scene();
        waterPuzzleScene.setDescription("\nTODO:We need to add a description here.  ");
        waterPuzzleScene.setSymbol(" WP ");
        waterPuzzleScene.setBlocked(false);
        //startingScene.setTravelTime(240);
        scenes[Scene.SceneType.waterPuzzle.ordinal()] = waterPuzzleScene;
        
         Scene waterfallScene = new Scene();
        waterfallScene.setDescription("\nTODO:We need to add a description here.  ");
        waterfallScene.setSymbol(" WF ");
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
        finishScene.setSymbol(" FN ");
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
        locations[0][1].setScene(scenes[Scene.SceneType.path.ordinal()]);
        locations[0][2].setScene(scenes[Scene.SceneType.waterPuzzle.ordinal()]);
        locations[0][3].setScene(scenes[Scene.SceneType.halfGallonPuzzle.ordinal()]);
        locations[0][4].setScene(scenes[Scene.SceneType.waterfall.ordinal()]);
        locations[0][5].setScene(scenes[Scene.SceneType.treasureRoom.ordinal()]);
        locations[0][6].setScene(scenes[Scene.SceneType.finish.ordinal()]);
        
    }
    
}
