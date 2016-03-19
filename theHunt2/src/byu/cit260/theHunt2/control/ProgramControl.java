
package byu.cit260.theHunt2.control;

import byu.cit260.theHunt2.model.Player;
import citbyu.cit260.theHunt2.exceptions.ProgramControlException;
import thehunt2.theHunt2;

/**
 *
 * @author AlleciaMitchell
 */
public class ProgramControl {

    public static Player createPlayer(String name) throws ProgramControlException{
        if (name == null) {
            //return null;
            throw new ProgramControlException("Input your name");
        }
        Player player = new Player();
        player.setName(name);
       
        theHunt2.setPlayer(player); // save the player
       return player;
    }
    
}
