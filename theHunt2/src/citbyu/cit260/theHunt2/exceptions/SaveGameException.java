/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.theHunt2.exceptions;

/**
 *
 * @author AlleciaMitchell
 */
public class SaveGameException extends Exception {

    public SaveGameException() {
    }

    public SaveGameException(String message) {
        super(message);
    }

    public SaveGameException(String message, Throwable cause) {
        super(message, cause);
    }

    public SaveGameException(Throwable cause) {
        super(cause);
    }

    public SaveGameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

  
    
}
