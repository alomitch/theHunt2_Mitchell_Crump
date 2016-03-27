/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mikec_000
 */
public class ItemsListView {

    public static void main(String[] args) {
        String string = "Items List";
        
        try (BufferedWriter writer = new BufferedWriter (new FileWriter(".\\items.txt"))) {
            
            writer.write(string);
            
        }catch (IOException e) {
        }
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
