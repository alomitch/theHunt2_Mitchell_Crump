/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import thehunt2.theHunt2;

/**
 *
 * @author AlleciaMitchell
 */
public class LocationsListView extends View {
protected final BufferedReader keyboard = theHunt2.getInfile();
    protected final PrintWriter console = theHunt2.getOutfile();
    private int input;
    
    
    public LocationsListView(){
        super ("Please select an option:"
                + "L- Location List"
                + "E-Exit and Return to Main Menu");
                
    }
    @Override
    public boolean doAction(String value) {
        switch (input){
            case 'L':
                showLocations();
                break;
            case'E':
                return false;
            default:
                System.out.println("Please select a valid option.");
        
        }
    return true;
    }

    private void showLocations() {
        this.console.println("Locations On the Map...........\n"
                + "Train Puzzle Scene |\n"
                + "Water Puzzle Scene |\n"
                + "Half Gallon Puzzle Scene |\n"
                + "Beach |\n"
                + "Path |\n"
                + "Treasure Room |\n"
                + "Finish |\n");

    }

   
}
