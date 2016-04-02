/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.control;

import static byu.cit260.theHunt2.control.GameControl.Item.key;
import byu.cit260.theHunt2.model.Backpack;
import byu.cit260.theHunt2.model.Game;
import byu.cit260.theHunt2.model.Map;
import byu.cit260.theHunt2.model.Player;
import byu.cit260.theHunt2.model.Scene;
import byu.cit260.theHunt2.model.Treasure;
import citbyu.cit260.theHunt2.exceptions.GameControlException;
import citbyui.cit260.theHunt2.view.Items;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import thehunt2.theHunt2;

/**
 *
 * @author mikec_000
 */
public class GameControl {

    public static void createNewGame(Player player) {
//       GameMenuView gameMenu = new GameMenuView() {};
//       gameMenu.displayMenu();
//       
        Game game = new Game(); //  create new game
        theHunt2.setCurrentGame(game); // save in TheHunt
        
        game.setPlayer(player); //save player in game
        
        //create the inventory list and save in the game
        InventoryItem[] itemsList = GameControl.createItemsList();
        game.setInventory(itemsList);       
        
        Treasure treasure = new Treasure(); //create new treasure
        game.setTreasure(treasure);
        
        Backpack backpack = new Backpack (); // create new backpack
        game.setBackpack(backpack);
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game
        
        // move actors to starting position in the map
       // MapControl.moveActorsToStartingLocation(map);
    }
    
    public static void saveGame(Game game, String filePath)
            throws GameControlException {
//        String filepath = null;
        
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); // write the game object out to file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
    }
    
    public static void getSavedGame(String filepath)
                        throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        // close the output file
        theHunt2.setCurrentGame(game); // save in TheHunt2
    }
    
    public static InventoryItem[] getSortedInventroyList() {
       System.out.println("\n*** getSortedInventoryList stub function called ***");
       return null;
    }

    public static InventoryItem[] getSortedClueList() {
        System.out.println("\n*** get SortedClueList stub functon called ***");
        return null;
    }

    public enum Item {
        backpack,
        clue,
        tnt,
        monkey,
        aidBag,
        key;       
    }
    public static InventoryItem[] createItemsList() {
        
        // created array(list) of inventory items
        InventoryItem[] inventory = 
                new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem key = new InventoryItem();
        key.setDescription("Key");
        key.setQuantityInStock(0);
        key.setRequiredAmount(0);
        inventory[Item.key.ordinal()] = key;
        
        InventoryItem backpack = new InventoryItem();
        backpack.setDescription("Backpack");
        backpack.setQuantityInStock(0);
        backpack.setRequiredAmount(0);
        inventory[Item.backpack.ordinal()] = backpack;
        
        InventoryItem clue = new InventoryItem();
        clue.setDescription("Clue");
        clue.setQuantityInStock(0);
        clue.setMaximumAmount(4);
        inventory[Item.clue.ordinal()] = clue;
        
        InventoryItem tnt = new InventoryItem();
        tnt.setDescription("TNT");
        tnt.setQuantityInStock(0);
        tnt.setMaximumAmount(1);
        inventory[Item.tnt.ordinal()] = tnt;
        
        InventoryItem monkey = new InventoryItem();
        monkey.setDescription("Monkey");
        monkey.setQuantityInStock(0);
        monkey.setMaximumAmount(1);
        inventory[Item.monkey.ordinal()] = monkey;
        
        InventoryItem aidBag = new InventoryItem();
        aidBag.setDescription("Aid Bag");
        aidBag.setQuantityInStock(0);
        aidBag.setMaximumAmount(1);
        inventory[Item.aidBag.ordinal()] = aidBag;
        
        return inventory;
    }
    
    public enum PuzzleScene {
        train,
        halfGallon,
        Water;
               
    }
  
  
}
    