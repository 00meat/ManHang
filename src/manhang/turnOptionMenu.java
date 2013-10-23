/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manhang;

/**
 *
 * @author Andrew
 */
public class turnOptionMenu {
          public static void turnControl() {
         int inputTurn = 0;
     System.out.println("Turn Options:");
     System.out.println("1 = Guess Letter.");
     System.out.println("2 = Give hint: one point penalty: one random letter");
     System.out.println("3 = Help");
     System.out.println("4 = Skip to player #'s turn.");
     System.out.println("5 = Return to Start");
     inputTurn = getInput.number(5);
 switch (inputTurn) {
            case 1:  turnMenuView(inputTurn);
                     gameMenu.gameRun();
                     break;
            case 2:  turnMenuView(inputTurn);
                    
                     break;
            case 3:  helpControl.helpMenuControl();
                     break;
            case 4:  turnMenuView(inputTurn);
                   
                    break;
             case 5: start.startMenu();
                    break;
            default:  System.out.println("Unrecognized command, Please try again.");
                   
                    break;
        }
        }
    
         public static void turnMenuView(int inputTurn) {
 switch (inputTurn) {
            case 1:  System.out.println("Not implemented.");
                     break;
            case 2:  System.out.println("Not implemented.");
                     break;
            case 4:  System.out.println("Not implemented.");
                       int PlayerNumber = getInput.number(4);
                    break;
            default:  System.out.println("Unrecognized Command, Please reastart program");
                    break;
        }
}
    
    
    
    
}
