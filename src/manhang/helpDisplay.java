/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manhang;

/**
 *
 * @author Andrew
 */
public class helpDisplay {
     public static void helpMenuView(int inputHelp) {
 switch (inputHelp) {
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

}
