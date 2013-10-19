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
public class helpControl {
    public static void helpMenuControl() {
     int inputHelp = 0;
     System.out.println("Help Menu:");
     System.out.println("1 = Rules");
     System.out.println("2 = How to Play");
     System.out.println("3 = Player Select");
     System.out.println("4 = Difficulty Select");
     System.out.println("5 = Return to Start");
     inputHelp = getInput.number();
 switch (inputHelp) {
            case 1:  helpDisplay.helpMenuView(inputHelp);
                     helpMenuControl();
                     break;
            case 2:  helpDisplay.helpMenuView(inputHelp);
                     helpMenuControl();
                     break;
            case 3:  helpDisplay.helpMenuView(inputHelp);
                     helpMenuControl();
                     break;
            case 4:  helpDisplay.helpMenuView(inputHelp);
                     helpMenuControl();
                    break;
             case 5: start.startMenu();
                    break;
            default:  System.out.println("Unrecognized command, Please try again.");
                    helpMenuControl();
                    break;
        }
        }
}
