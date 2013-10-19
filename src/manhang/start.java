/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manhang;
/**
 *
 * @author Andrew
 */
public class start {
        public static void startMenu() {
     int input = 0;
     System.out.println("Start Game = 1");
     System.out.println("Help Menu = 2");
     input = getInput.number();
      
    switch (input) {
            case 1:  gameMenu.gameMenu();
                     break;
            case 2:  helpControl.helpMenuControl();
                     break;
           default:  System.out.println("Unrecognized Command, Please reastart program");
                    break;
        }
            
 }
}
