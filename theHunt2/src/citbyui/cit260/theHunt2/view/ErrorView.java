/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

import java.io.PrintWriter;
import thehunt2.theHunt2;

/**
 *
 * @author AlleciaMitchell
 */
public class ErrorView {
    private static final PrintWriter errorFile = theHunt2.getOutFile();
    private static final PrintWriter logFile = theHunt2.getLogFile();
    
    public static void display (String className, String errorMessage){
        errorFile.println(
                                "------------------------------------------------------------------"
                             + "\n- ERROR - " + errorMessage
                             + "\n---------------------------------------------------------------");
       //log error
       logFile.println(className + "-" + errorMessage);
    }
    
}
