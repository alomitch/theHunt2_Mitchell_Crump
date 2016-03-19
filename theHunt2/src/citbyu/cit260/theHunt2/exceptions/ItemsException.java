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
public class ItemsException extends Exception {

    public ItemsException() {
    }

    public ItemsException(String message) {
        super(message);
    }

    public ItemsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemsException(Throwable cause) {
        super(cause);
    }

    public ItemsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

  
    
}
