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
public class getInput {
 
    public static int number(int max) {
    int numberIn = 0;
    Scanner scanNumber = new Scanner(System.in); 
    do {
    numberIn = scanNumber.nextInt(); } 
    while(validateNumber(numberIn, max) == false);
    return numberIn;
    }

        public static boolean validateNumber(int numberIn, int max) {
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
                    number(max);
                    break; }
            if (numberIn > max){
                valid = false;
             System.out.println("Invalid number.");
             number(max);}
            else if (numberIn < 0){
                valid = false;
             System.out.println("Invalid number.");
             number(max);}      
    return valid;
    }
    
    
    public static char letter() {
        Scanner scanLetter = new Scanner(System.in);
        String letter = scanLetter.next();
        char[] guess;
        guess = letter.toCharArray();
        return guess[0];
        }
    
    
    
    
}
