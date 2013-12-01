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

  

public abstract class Menu implements DisplayInfo, EnterInfo  {
    
         public static int win = 0;
         public static int loss = 0; 
         public static int input;
  
    
        public static void startMenu() {
    
          
     
     System.out.println("New Game = 1");
     System.out.println("Help Menu = 2");
     System.out.println("Encouragment Menu = 3");
     input = getInput.number(3);
      
     
    switch (input) {
            case 1:  int winLoss = gameMenu.gameMenu();
                        if (winLoss == 1){win++;}
                        else loss++;
                        gameMenu.gameEndScore();
                        continueMenu();
                    break;
            case 2:  helpControl.helpMenuControl();
                     break;
            case 3:  playerAbuseMenu.playerAbuseControl();
                     break;
           default:  System.out.println("Unrecognized Command, Please reastart program");
                    break;
        }
 }
             private static void continueMenu() {
     System.out.println("Next Game = 1");
     System.out.println("Help Menu = 2");
     System.out.println("Encouragment Menu = 3");
     input = getInput.number(3);
      
    switch (input) {
            case 1:  int winLoss = gameMenu.gameMenu();
                        if (winLoss == 1){win++;}
                        else loss++;
                        gameMenu.gameEndScore();
                        continueMenu();
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
