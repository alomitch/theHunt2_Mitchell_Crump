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
import citbyu.cit260.theHunt2.exceptions.ProgramControlException;
import citbyui.cit260.theHunt2.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlleciaMitchell
 */
public class theHunt2 {
 
    private static Game currentGame = null;
    private static Player player= null;
    
    private static PrintWriter outfile = null;
    private static BufferedReader infile = null;
    
    private static PrintWriter logFile = null;
    
    
     /**
     * @param args the command line arguments
     * @throws citbyu.cit260.theHunt2.exceptions.ProgramControlException
     */
    public static void main(String[] args) throws ProgramControlException {
        
        try{
            
             //open character stream files for end user input and output
            theHunt2.infile =
                 new BufferedReader (new InputStreamReader (System.in));
             theHunt2.outfile = new PrintWriter(System.out,true);
         
             //open log file
             String filePath = "log.txt";
             theHunt2.logFile = new PrintWriter(filePath);
             
            //create StartPorgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.startProgram();
            return;
        
      } catch (Throwable te){
            System.out.println("Exception: "+ te.toString()+
                                               "\nCause:" + te.getCause()+
                                               "\nMessage:" + te.getMessage());
           
            te.printStackTrace();;
        }
        finally{
                try {
                       if(theHunt2.infile != null)
                             theHunt2.infile.close(); 
                        if (theHunt2.outfile !=null)
                              theHunt2.outfile.close();
                        if (theHunt2.logFile !=null)
                            theHunt2.logFile.close();
               } catch (IOException ex) {
                         System.out.println("Error closing files");
                         return;
            }
            theHunt2.outfile.close();
        }
    }
   
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

    public static PrintWriter getOutfile() {
        return outfile;
    }

    public static void setOutfile(PrintWriter outfile) {
        theHunt2.outfile = outfile;
    }

    public static BufferedReader getInfile() {
        return infile;
    }

    public static void setInfile(BufferedReader infile) {
        theHunt2.infile = infile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        theHunt2.logFile = logFile;
    }
    
    
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
        map.setName("The Hunt"); 
        map.setRowCount(0.00);
        map.setColumnCount(0.00);
        System.out.println(map.toString());
            
//        Actor actor = new Actor();
//        actor.setName("Jack");
//        actor.setDescription("Treasure Hunter");
//        map.setCoordinates(0.00);
//        System.out.println(actor.toString());
       
        Location location = new Location();
        location.setRow(0.0);
        location.setColumn(0.0);
        location.setAmountRemaining(0.00);
        System.out.println(location.toString());
        
        PuzzleScene puzzleScene = new PuzzleScene();
        puzzleScene.setDescription("puzzle");
        puzzleScene.setTravelTime(0.0);
        puzzleScene.setBlocked(0.0);
        puzzleScene.setSymbol(0.0); 
        puzzleScene.setPuzzle(0.0); 
        System.out.println(puzzleScene.toString());
                   
        Scene scene = new Scene();
        scene.setDescription("scene");
        scene.setTravelTime(0.0);
        scene.setBlocked(false);
        scene.setSymbol(0.0); 
        System.out.println(scene.toString());
        
        ItemScene itemScene = new ItemScene();
        itemScene.setDescription("puzzle");
        itemScene.setTravelTime(0.0);
        itemScene.setBlocked(0.0);
        itemScene.setSymbol(0.0);
        itemScene.setItem(0.0);
        System.out.println(itemScene.toString());    
    }
   
}