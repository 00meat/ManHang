/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manhang;

import java.util.Scanner;
import static manhang.ManHang.game;
import static manhang.ManHang.gameMenu;
import static manhang.ManHang.helpMenu;
import static manhang.ManHang.startMenu;

/**
 *
 * @author Andrew
 */
public class menus {
    
    public static void startMenu() {
     int input = 0;
     System.out.println("Start Game = 1");
     System.out.println("Help Menu = 2");
     Scanner scan = new Scanner(System.in);
     input = scan.nextInt(); 
    switch (input) {
            case 1:  gameMenu();
                     break;
            case 2:  helpMenu();
                     break;
           default:  System.out.println("Unrecognized Command, Please reastart program");
                    break;
        }
            
 }
  public static void helpMenu() {
     int inputHelp = 0;
     System.out.println("Help Menu:");
     System.out.println("Rules = 1");
     System.out.println("How to Play = 2");
     System.out.println("Player Select = 3");
     System.out.println("Difficulty Select = 4");
     System.out.println("Return to Start = 5");
     Scanner scan = new Scanner(System.in);
     inputHelp = scan.nextInt(); 
 switch (inputHelp) {
            case 1:  System.out.println("RULES:");
                     System.out.println("1- The Player has to guess a word one letter at a time.");
                     System.out.println("2- Players may buess up to 6 letters wrong before they all loose.");
                     helpMenu();
                     break;
            case 2:  System.out.println("HOW TO PLAY:");
                     System.out.println("1- Select number of players.");
                     System.out.println("2- Select difficulty.");
                     System.out.println("3- Guess a letter on your turn.");
                     helpMenu();
                     break;
            case 3: System.out.println("Player Select:");
                     System.out.println("1- Count the number of people playing.");
                     System.out.println("2- Press the corrisponding number key.");
                     System.out.println("3- Press enter/return.");
                     helpMenu();
                     break;
            case 4:  System.out.println("Difficulty Select:");
                     System.out.println("Choose how hard of a word you want");
                     System.out.println("1- An easy word.");
                     System.out.println("2- A medium word.");
                     System.out.println("3- A hard word.");
                     helpMenu();
                    break;
             case 5: startMenu();
                    break;
            default:  System.out.println("Unrecognized Command, Please reastart program");
                    break;
        }
        }
            
 

 
 public static void gameMenu() {
          // Start screen, select difficulty and player count.
          int winloss = 0;
          int win = 0;
          int loss = 0;
          int percentage = 0;
          int difficulty = 2;
        int players = 1;
        int scoreWin = 0;
        int scoreLoose = 0;
        System.out.println("Please select difficulty 1-3");
        System.out.println("Number of players? 1-4");
 
        System.out.println("You selected " + difficulty + " difficulty with " + players + " players.");
        winloss = game();
        winloss = game();
    //    while (winloss != 0 || winloss != 1) {
   //       System.out.println("Read the instructions and try again.");
   //         winloss = game();}

    if (winloss == 1) win++;
    if (winloss == 0) loss++;
    percentage = (win / (win + loss)*100);
     System.out.println("You have won " + win + " times and lost " + loss + " times, your percentage is " +
             percentage + "%");
        
     
 }
    
    
}
