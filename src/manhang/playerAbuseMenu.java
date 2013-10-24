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
public class playerAbuseMenu {
        public static void playerAbuseControl() {
     System.out.println("Encouragment Menu:");
     System.out.println("1 = Gentle encouragment.");
     System.out.println("2 = Boost confidence");
     System.out.println("3 = Self worth enhancer");
     System.out.println("4 = Helpful suggestion");
     System.out.println("5 = Return to Start");
     int inputAbuse = abuseNumber(5);
 
             if (inputAbuse == 1) {
            abuseMenuView(inputAbuse);
                     playerAbuseControl();
        } else if (inputAbuse == 2) {
            abuseMenuView(inputAbuse);
                     playerAbuseControl();
        } else if (inputAbuse == 3) {
            abuseMenuView(inputAbuse);
                     playerAbuseControl();
        } else if (inputAbuse == 4) {
            abuseMenuView(inputAbuse);
                     playerAbuseControl();
        } else if (inputAbuse == 5) {
            start.startMenu();
        } else {
             System.out.println("Unrecognized command, Please try again.");
                    playerAbuseControl();
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
    
     public static int abuseNumber(int max) {
    int numberIn = 0;
   
    do {
    Scanner scanNumber = new Scanner(System.in);    
    numberIn = scanNumber.nextInt(); } 
    while(validateAbuseNumber(numberIn, max) == false);
    return numberIn;
    }

        public static boolean validateAbuseNumber(int numberIn, int max) {
                boolean valid = false;// flag to indicate if valid character entered
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
                    abuseNumber(max);
                    break; }
            if (numberIn > max){
                valid = false;
             System.out.println("Invalid number.");
             abuseNumber(max);}
            if (numberIn < 0){
                valid = false;
             System.out.println("Invalid number.");
             abuseNumber(max);}      
    return valid;
    }
    
}
