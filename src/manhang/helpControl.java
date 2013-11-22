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
public class helpControl extends Menu{

    private static int numberIn = 0;
    private static boolean valid = false;// flag to indicate if valid character entered
    
    @Override public static void helpMenuControl() {

     System.out.println("Help Menu:");
     System.out.println("1 = Rules");
     System.out.println("2 = How to Play");
     System.out.println("3 = Player Select");
     System.out.println("4 = Difficulty Select");
     System.out.println("5 = Return to Start");
     input = askNumber(5);
 switch (input) {
            case 1:  helpMenuView(input);
                     helpMenuControl();
                     break;
            case 2:  helpMenuView(input);
                     helpMenuControl();
                     break;
            case 3:  helpMenuView(input);
                     helpMenuControl();
                     break;
            case 4:  helpMenuView(input);
                     helpMenuControl();
                    break;
             case 5: Menu.startMenu();
                    break;
            default:  System.out.println("Unrecognized command, Please try again.");
                    helpMenuControl();
                    break;
        }
        }
    
        @Override private static void helpMenuView(int input) {
 switch (input) {
            case 1:  System.out.println("RULES:");
                     System.out.println("1- The Player has to guess a word one letter at a time.");
                     System.out.println("2- Players may buess up to 6 letters wrong before they all loose.");
                     break;
            case 2:  System.out.println("HOW TO PLAY:");
                     System.out.println("1- Select number of players.");
                     System.out.println("2- Select difficulty.");
                     System.out.println("3- Guess a letter on your turn.");
                     break;
            case 3: System.out.println("Player Select:");
                     System.out.println("1- Count the number of people playing.");
                     System.out.println("2- Press the corrisponding number key.");
                     System.out.println("3- Press enter/return.");
                     break;
            case 4:  System.out.println("Difficulty Select:");
                     System.out.println("Choose how hard of a word you want");
                     System.out.println("1- An easy word.");
                     System.out.println("2- A medium word.");
                     System.out.println("3- A hard word.");
                    break;
            default:  System.out.println("Unrecognized Command, Please reastart program");
                    break;
        }
        }
         
         
       @Override   private static int askNumber(int max) {
   
   
    do {
        Scanner scanNumber = new Scanner(System.in);    
        numberIn = scanNumber.nextInt(); } 
         while(validateAskNumber(numberIn, max) == false);
         return numberIn;
  }

        private static boolean validateAskNumber(int numberIn, int max) {
               
            switch (numberIn) {
                case 1:  valid = true; break;
                case 2:  valid = true; break;
                case 3:  valid = true; break;    
                case 4:  valid = true; break;
                case 5:  valid = true; break;
                case 6:  valid = true; break; 
                case 7:  valid = true; break;    
                case 8:  valid = true; break;    
                case 9:  valid = true; break;
                case 0:  valid = true; break;    
           default:  System.out.println("Invalid number.");
                    askNumber(max);
                    break; }
            if (numberIn > max){
                valid = false;
             System.out.println("Invalid number.");
             askNumber(max);}
            if (numberIn < 0){
                valid = false;
             System.out.println("Invalid number.");
             askNumber(max);}      
    return valid;
    }   
         
}
