/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.theHunt2.view;

/**
 *
 * @author AlleciaMitchell
 */
public abstract class AboutUsMenu extends View {
    
    public AboutUsMenu(){
            super("\n"
            +"\n-----------------------------------------"
            +"\n| About Us Menu                         |"
            +"\n-----------------------------------------"
            +"\nA - Creator Allecia Mitchell"
            +"\nM - Creator Michael Crump"
            +"\nR - Return to Main Menu"
            +"\nE - Exit"
            +"\n-----------------------------------------");
        }
//    public void displayMenu() {
//        
//        char selection = ' ';
//        do {
//               
//            System.out.println(MENU); // display the main menu
//       
//            String input = this.getInput(); // get the user's selection
//            selection = input.charAt(0); // get first character of string
//       
//           // this.doAction(selection); // do action based on selection
//       
//        } while (selection != 'E'); // while selection is not "Exit"
//       
//    }
        @Override
    public boolean doAction(String value) {
        char choice = value.charAt(0);
        
        switch (choice){
            case 'A'://About Creator Allecia Mitchell
                this.aboutCreatorAllecia();
                break;
            case 'M': //About Creator Michael Crump
                this.aboutCreatorMichael();
                break;
            case 'R':// Return to Main Menu
               this.returnToMainMenu();
               break;
            case 'E':// exit current game
                return true;
           default:
               ErrorView.display(this.getClass().getName(),
                       "\n*** Invalid selection *** Try again ");
               break;
                          
        }
        return false;
    }
        
        private void aboutCreatorAllecia() {
        System.out.println("Allecia is an aweseome person!  She lives in Las Vegas, NV.");
    }

        private void aboutCreatorMichael() {
        System.out.println("Mike is a 38-year-old husband to one and father to three.  He lives in Nephi, UT.");
    }

    private void returnToMainMenu() {
       MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
    
//    @Override
//    public String getInput() {
//         boolean valid = false; // indicates if the name has been retrieved
//       String getInput = null;
//       Scanner keyboard = new Scanner(System.in);   // keyboard input stream
//       
//       while (!valid) { // while a valid name has not been retrieved
//           
//           //prompt for the player's name
//           this.console.println("Choose Option From The About Us Menu");
//          
//           // get the name from the keyboard and trim off the blanks
//          getInput = keyboard.nextLine();
//           getInput = getInput.trim();
//           
//           //if the name is invalid (less than two character in lenght))
//           if (getInput. length() <1){
//               ErrorView.display(this.getClass().getName(),
//                        "Invalid entry");
//               continue; // and repeat again
//               
//           }
//           break; // out of the (exit) the repetition
//       }
//       return getInput; //return the name
//    }



    
}
