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
public abstract class Items extends View{
     
       public Items(){
           super("\n"  
            +"\n-----------------------------------------"
            + "\n| Items Menu                            |"
            +"\n-----------------------------------------"
            +"\nC - Clues"
            +"\nT - TNT"
            +"\nA - Aid Bag"
            +"\nO - Old Cell Phone"
            +"\nM - Monkey"    
            +"\nR - Return to Main Menu"
            +"\n-----------------------------------------");
       }
    

       @Override
     public boolean doAction(String value) {
        char choice = value.charAt(0);
        
        switch (choice){
            case 'C':// display information on game clues
                this.clues();
                break;
            case 'T': // display information on TNT
                this.tnt();
                break;
            case 'A': // display information on the aid bag
                this.aidBag();
                break;
            case 'O':// display information on the old cell phone
                this.oldCellPhone();
                break;
            case 'M':// display information on the monkey
                this.monkey();
                break;              
            case 'R':// Return to Main Menu
               this.returnToMainMenu();
               break;
            default:
               ErrorView.display(this.getClass().getName(),
                       "\n*** Invalid selection *** Try again ");
               break;          
               
        }
        return false;
    }

    private void clues() {
        System.out.println("*** start clues function called ***");
    }

    private void tnt() {
       System.out.println("***start tnt function called ***");
    }

    private void aidBag() {
        System.out.println("***start aidBag function called ***");
    }

    private void oldCellPhone() {
        System.out.println("*** start oldCellPhone function called ***");
    }
    private void monkey() {
        System.out.println("*** start monkey function called ***");
    }
    
    private void returnToMainMenu() {
       MainMenuView mainMenu = new MainMenuView();
       mainMenu.display();
    }

}

