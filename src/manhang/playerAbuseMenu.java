/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manhang;

/**
 *
 * @author Andrew
 */
public class playerAbuseMenu {
        public static void playerAbuseControl() {
     int inputAbuse = 0;
     System.out.println("Encouragment Menu:");
     System.out.println("1 = Gentle encouragment.");
     System.out.println("2 = Boost confidence");
     System.out.println("3 = Self worth enhancer");
     System.out.println("4 = Helpfull suggestion");
     System.out.println("5 = Return to Start");
     inputAbuse = getInput.number(5);
 switch (inputAbuse) {
            case 1:  abuseMenuView(inputAbuse);
                     playerAbuseControl();
                     break;
            case 2:  abuseMenuView(inputAbuse);
                     playerAbuseControl();
                     break;
            case 3:  abuseMenuView(inputAbuse);
                     playerAbuseControl();
                     break;
            case 4:  abuseMenuView(inputAbuse);
                     playerAbuseControl();
                    break;
             case 5: start.startMenu();
                    break;
            default:  System.out.println("Unrecognized command, Please try again.");
                    playerAbuseControl();
                    break;
        }
        }
    
         public static void abuseMenuView(int inputAbuse) {
 switch (inputAbuse) {
            case 1:  System.out.println("Keep trying. It's not life or death... for you.");
                     break;
            case 2:  System.out.println("You shouldn't be able to get many more wrong. Guess another leter.");
                     break;
            case 3: System.out.println("Thanks for playing when you could be out doing something better with your time.");
                     break;
            case 4:  System.out.println("Too hard? You might want to try an easier difficulty... Really.");
                    break;
            default:  System.out.println("Unrecognized Command, Please reastart program");
                    break;
        }
        }
    
    
    
}
