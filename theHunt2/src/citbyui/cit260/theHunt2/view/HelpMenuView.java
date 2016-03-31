/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;


/**
 *
 * @author mikec_000
 */
public abstract class HelpMenuView extends View {
    
    public HelpMenuView(){
       super("\n"
            +"\n-----------------------------------------"
            +"\n| Help Menu                             |"
            +"\n-----------------------------------------"
            +"\nG - What is the goal of the game?"
            +"\nM - How to move"
            +"\nA - Answering riddles"
            +"\nI - Picking up items"
            +"\nR - Return to Main Menu"
            +"\nQ - Quit"
            +"\n-----------------------------------------");
    }
       
    
    @Override
    public boolean doAction(String value) {
        char choice = value.charAt(0);
        
        switch (choice){
            case 'G'://display the goal of the game
                this.gameGoal();
                break;
            case 'M': //How to move
                this.gameMovement();
                break;
            case 'A': // Answering riddles
                this.answerRiddles();
                break;
            case 'I':// Picking up Inventory Items
                this.pickingUpItems();
                break;
            case 'R':// Return to Main Menu
               this.returnToMainMenu();
               break;
            case 'Q': // Quit
                this.quitProgram();
                return true;
            default:
               ErrorView.display(this.getClass().getName(),
                       "\n*** Invalid selection *** Try again ");
               break;          
               
        }
        return false;
    }

    private void gameGoal() {
        System.out.println("***The goal of The Hunt is to find the treasure.***");
    }

    private void gameMovement() {
       System.out.println("***Use the Move to New Location menu option, then enter the coordinates.***");
    }

    private void answerRiddles() {
        System.out.println("***To answer a riddle, type your response.  Grammar counts!***");
    }

    private void pickingUpItems() {
        Items items = new Items() {
//            @Override
//            public boolean doAction(String value) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
        };
        items.display();
    }

    private void returnToMainMenu() {
       MainMenuView mainMenu = new MainMenuView();
       mainMenu.display();
    }

    private void quitProgram() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
}


    

