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
    public static boolean valid = false;// flag to indicate if valid character entered
    public static int numberIn = 0;
    public static char[] guess;
    public static boolean isLetter = false;
    
    public static int number(int max) {
     
    Scanner scanNumber = new Scanner(System.in); 
       try { 
    do {
  
    numberIn = scanNumber.nextInt();  
 
    }
    while(validateNumber(numberIn, max) == false || isLetter == true);
    
       } catch(Exception e){
       System.out.println("Really? Try a number this time.");  
       number(max);
    }
    
    return numberIn;
    }
          
        private static boolean validateNumber(int numberIn, int max) {
               
        
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
                    
                    valid = false;
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
        
        guess = letter.toCharArray();
        return guess[0];
        }
    
    
    
    
}
