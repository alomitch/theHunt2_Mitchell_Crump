/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehunt2;

import byu.cit260.theHunt2.model.Actor;
import byu.cit260.theHunt2.model.AidBag;
import byu.cit260.theHunt2.model.Backpack;
import byu.cit260.theHunt2.model.Clue;
import byu.cit260.theHunt2.model.Game;
import byu.cit260.theHunt2.model.ItemScene;
import byu.cit260.theHunt2.model.Items;
import byu.cit260.theHunt2.model.Location;
import byu.cit260.theHunt2.model.Map;
import byu.cit260.theHunt2.model.Monkey;
import byu.cit260.theHunt2.model.Player;
import byu.cit260.theHunt2.model.PuzzleScene;
import byu.cit260.theHunt2.model.Scene;
import byu.cit260.theHunt2.model.TNT;
import byu.cit260.theHunt2.model.Treasure;
import citbyui.cit260.theHunt2.view.StartProgramView;

/**
 *
 * @author AlleciaMitchell
 */
public class theHunt2 {
 
    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        theHunt2.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        theHunt2.player = player;
    }
    private static Player player = null;
    
private static void groupTest(){
       Player playerOne = new Player();  
       
        playerOne.setName("Fred Flinstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
   private static void alleciaTests(){
         
         AidBag bag = new AidBag();
         bag.setCurrentCapacity(2);
         bag.setMaxCapacity(3);
         System.out.println(bag.toString());
         
         Backpack pack = new Backpack();
         pack.setCurrentCapacity(1);
         pack.setMaxCapacity(3);
         System.out.println(pack.toString());
         
         Clue secret = new Clue();
         secret.setDescription("Your first clue will be..." );
         secret.setSize(2);
         System.out.println(secret.toString());
         
         Game overall = new Game();
         overall.setNoPeople(2);
         overall.setTotalTime(4);
         System.out.println(overall.toString());
           
          Items things = new Items();
          things.setItemType("backpack");
          System.out.println(things.toString());
           
         Monkey animal = new Monkey();
         animal.setDescription("You have recieved this monkey because ... ");
         animal.setName("Monkey Guy");
         System.out.println(animal.toString());
            
         TNT sparks = new TNT();
         sparks.setCurrentUsage(0);
         sparks.setMaxUsage(1);
         System.out.println(sparks.toString());
          
         Treasure gold = new Treasure();
          gold.setDescription("This kind of treasure will help you ... ");
          gold.setValue(1);
          System.out.println(gold.toString());
            
     }
     
     private static void michaelTests(){
        
        Map map = new Map();
        // map.setName("The Hunt");  CLJ
        map.setRowCount(0.00);
        map.setColumnCount(0.00);
        System.out.println(map.toString());
            
        Actor actor = new Actor();
        actor.setName("Jack");
        actor.setDescription("Treasure Hunter");
        // map.setCoordinates(0.00); CLJ
        System.out.println(actor.toString());
       
        Location location = new Location();
        location.setRow(0.0);
        location.setColumn(0.0);
        location.setAmountRemaining(0.00);
        System.out.println(location.toString());
        
        PuzzleScene puzzleScene = new PuzzleScene();
        puzzleScene.setDescription("puzzle");
        puzzleScene.setTravelTime(0.0);
        puzzleScene.setBlocked(0.0);
       // puzzleScene.setSymbol(0.0); CLJ
       // puzzleScene.setPuzzle(0.0); CLJ
        System.out.println(puzzleScene.toString());
                   
        Scene scene = new Scene();
        scene.setDescription("scene");
        scene.setTravelTime(0.0);
        scene.setBlocked(0.0);
        // scene.setSymbol(0.0); CLJ
        System.out.println(scene.toString());
        
        ItemScene itemScene = new ItemScene();
        itemScene.setDescription("puzzle");
        itemScene.setTravelTime(0.0);
        itemScene.setBlocked(0.0);
        // itemScene.setSymbol(0.0); CLJ
        // itemScene.setItem(0.0);
        System.out.println(itemScene.toString());    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
    }
    
}
