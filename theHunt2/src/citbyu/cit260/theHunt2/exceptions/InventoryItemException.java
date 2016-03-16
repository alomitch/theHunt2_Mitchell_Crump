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
public class InventoryItemException extends Exception {

    public InventoryItemException() {
    }

    public InventoryItemException(String message) {
        super(message);
    }

    public InventoryItemException(String message, Throwable cause) {
        super(message, cause);
    }

    public InventoryItemException(Throwable cause) {
        super(cause);
    }

    public InventoryItemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
