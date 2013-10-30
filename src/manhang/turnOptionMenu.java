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
          public static void turnControl(int players, int difficulty, int winLoss, int win, int loss) {
         int inputTurn = 0;
     System.out.println("Turn Options:");
     System.out.println("1 = Take turn");
     System.out.println("2 = Give hint: one point penalty: one random letter");
     System.out.println("3 = Help");
     System.out.println("4 = Skip to player #'s turn.");
     System.out.println("5 = Return to Start");
     System.out.println("6 = Alphabetize word for a bodypart back.");
     inputTurn = getInput.number(5);

     switch (inputTurn) {
            case 1:  turnMenuView(inputTurn);
                     
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
 
             char guessed = 0;
             switch (inputTurn) {
             case 1:  System.out.println("Not implemented but type something anyway.");

                     break;
             case 2:  System.out.println("Not implemented.");
                     break;
               case 4:  System.out.println("Not implemented but select a player anyway.");
                       int PlayerNumber = getInput.number(4);
                    break;
               case 6:  System.out.println("Alphabetizing word and giving you a point back.");
                        
                      break;
            default:  System.out.println("Unrecognized Command, Please reastart program");
                    break;
        }
      
}
          public static void guessAndCheck() {
                char guessed = askLetter.guess();
                String str = "someString"; 
                int strIndex = 10;
                char[] charArray = str.toCharArray();
             for (int repeat = strIndex; repeat >= 0; repeat--){
             if (guessed == charArray[repeat]){
                 //mark letter as guessed
             
             }
             
             
             
             }
             
             
        }
  
     
    
}
