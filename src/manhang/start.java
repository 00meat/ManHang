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
          int win = 0;
          int loss = 0; 
          
     
     System.out.println("New Game = 1");
     System.out.println("Help Menu = 2");
     System.out.println("Encouragment Menu = 3");
     int input = getInput.number(3);
      
     
    switch (input) {
            case 1:  int winLoss = gameMenu.gameMenu(win, loss);
                        if (winLoss == 1){win++;}
                        else loss++;
                        gameMenu.gameEndScore(win, loss);
                        continueMenu(win,loss);
                    break;
            case 2:  helpControl.helpMenuControl();
                     break;
            case 3:  playerAbuseMenu.playerAbuseControl();
                     break;
           default:  System.out.println("Unrecognized Command, Please reastart program");
                    break;
        }
 }
             private static void continueMenu(int win, int loss) {
     System.out.println("Next Game = 1");
     System.out.println("Help Menu = 2");
     System.out.println("Encouragment Menu = 3");
     int input = getInput.number(3);
      
    switch (input) {
            case 1:  int winLoss = gameMenu.gameMenu(win, loss);
                        if (winLoss == 1){win++;}
                        else loss++;
                        gameMenu.gameEndScore(win, loss);
                        continueMenu(win,loss);
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
