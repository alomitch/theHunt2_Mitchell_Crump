/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.theHunt2.control;

import byu.cit260.theHunt2.model.Player;
import citbyui.cit260.theHunt2.view.GameMenuView;

/**
 *
 * @author mikec_000
 */
public class GameControl {

    public static void createNewGame(Player player) {
       GameMenuView gameMenu = new GameMenuView() {};
       gameMenu.displayMenu();
       
    }
    
}
