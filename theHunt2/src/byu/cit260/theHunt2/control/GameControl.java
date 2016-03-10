/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.control;

import byu.cit260.theHunt2.model.Game;
import byu.cit260.theHunt2.model.Map;
import byu.cit260.theHunt2.model.Player;
import byu.cit260.theHunt2.model.Treasure;
import citbyui.cit260.theHunt2.view.Items;
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
        game.setItems(itemsList);
        
        Treasure treasure = new Treasure(); //create new treasure
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game
        
        // move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
    }

    private static InventoryItem[] createItemsList() {
        
        // created array(list) of inventory items
        InventoryItem[] inventory = 
                new InventoryItem[14];
        
        InventoryItem backpack = new InventoryItem();
        backpack.setDescription("Backpack");
        backpack.setQuantityInStock(0);
        backpack.setRequiredAmount(0);
        inventory[0] = backpack;
        
        InventoryItem clue = new InventoryItem();
        clue.setDescription("Clue");
        clue.setQuantityInStock(0);
        clue.setMaximumAmount(4);
        inventory[1] = clue;
        
        InventoryItem tnt = new InventoryItem();
        tnt.setDescription("TNT");
        tnt.setQuantityInStock(0);
        tnt.setMaximumAmount(1);
        inventory[2] = tnt;
        
        InventoryItem monkey = new InventoryItem();
        monkey.setDescription("Monkey");
        monkey.setQuantityInStock(0);
        monkey.setMaximumAmount(1);
        inventory[3] = monkey;
        
        InventoryItem aidBag = new InventoryItem();
        aidBag.setDescription("Aid Bag");
        aidBag.setQuantityInStock(0);
        aidBag.setMaximumAmount(1);
        inventory[4] = aidBag;
        
        return inventory;
    }
    
}
    