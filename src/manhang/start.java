/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manhang;
import java.util.Scanner;
/**
 *
 * @author Andrew
 */
public class start {
        public static void startMenu() {
     
     System.out.println("Start Game = 1");
     System.out.println("Help Menu = 2");
     System.out.println("Encouragment Menu = 3");
     int input = getInput.number(3);
      
    switch (input) {
            case 1:  gameMenu.gameMenu();
                     break;
            case 2:  helpControl.helpMenuControl();
                     break;
            case 3:  playerAbuseMenu.playerAbuseControl();
                     break;
           default:  System.out.println("Unrecognized Command, Please reastart program");
                    break;
        }
            
 }
}
