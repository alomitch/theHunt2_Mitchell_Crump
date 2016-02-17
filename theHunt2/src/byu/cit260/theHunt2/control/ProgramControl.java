
package byu.cit260.theHunt2.control;

import byu.cit260.theHunt2.model.Player;
import thehunt2.theHunt2;

/**
 *
 * @author AlleciaMitchell
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
       
        theHunt2.setPlayer(player); // save the player
       return player;
    }
    
}
