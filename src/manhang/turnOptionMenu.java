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
          public static int turnControl(int players, int difficulty, int winLoss, int win, int loss) {
         int inputTurn = 0;
         int alphSwitch = 0;
     System.out.println("Turn Options:");
     System.out.println("1 = Take turn");
     System.out.println("2 = Give hint: one point penalty: one random letter");
     System.out.println("3 = Help");
     System.out.println("4 = Skip to player #'s turn.");
     System.out.println("5 = Return to Start");
     System.out.println("6 = Alphabetize word for a bodypart back.");
     System.out.println("7 = Show the lowest letter");
     System.out.println("8 = Show the highest letter");
     inputTurn = getInput.number(8);

     switch (inputTurn) {
            case 1:  turnMenuView(inputTurn);
                     alphSwitch = 4;
                     break;
            case 2:  turnMenuView(inputTurn);
                     break;
            case 3:  helpControl.helpMenuControl();
                     break;
            case 4:  turnMenuView(inputTurn);
                   
                    break;
            case 5: start.startMenu();
                    break;
            case 6: turnMenuView(inputTurn);
                    alphSwitch = 1;
                    break; 
            case 7: turnMenuView(inputTurn);
                    alphSwitch = 2;
                    break; 
            case 8: turnMenuView(inputTurn);
                    alphSwitch = 3;
                    break; 
            default:  System.out.println("Unrecognized command, Please try again.");
                   
                    break;
        }
     
     return alphSwitch;
        }
    
         public static void turnMenuView(int inputTurn) {
 
             char guessed = 0;
             switch (inputTurn) {
             case 1:  System.out.println("Please guess a letter.");

                     break;
             case 2:  System.out.println("Not implemented.");
                     break;
               case 4:  System.out.println("Not implemented but select a player anyway.");
                       int PlayerNumber = getInput.number(4);
                    break;
               case 6:  System.out.println("Alphabetizing word and giving you a point back. Good luck with that.");
                        
                      break;
            default:  System.out.println("Unrecognized Command, Please reastart program");
                    break;
        }
      
}
          public static boolean guessAndCheck(String str) {
                char guessed = askLetter.guess(); 
                char[] charArray = str.toCharArray();
             for (int i = 0; i < str.length(); i++){
             if (guessed == charArray[i]){
                 //mark letter as guessed
                 System.out.println("Yes that letter is correct");
                 return true;
             }         
             }
             System.out.println("No that letter is not correct");
             return false;
             
        }
  
     
    
}
