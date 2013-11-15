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
public class askLetter {
    

public static char guess(){

Scanner scanner = new Scanner(System.in);
String guessStr = scanner.nextLine();
char guessChr = Character.toUpperCase(guessStr.charAt(0));

while(validGuess(guessChr) == false){
guessStr = scanner.nextLine();
guessChr = Character.toUpperCase(guessStr.charAt(0));
}
return guessChr;
}


public static boolean validGuess(char guessChr){
    boolean valid = false;
    switch (guessChr) {
                case 'A':  valid = true; break;
                case 'B':  valid = true; break;
                case 'C':  valid = true; break;    
                case 'D':  valid = true; break;
                case 'E':  valid = true; break;
                case 'F':  valid = true; break; 
                case 'G':  valid = true; break;    
                case 'H':  valid = true; break;    
                case 'I':  valid = true; break;
                case 'J':  valid = true; break;    
                case 'K':  valid = true; break;
                case 'L':  valid = true; break;    
                case 'M':  valid = true; break;
                case 'N':  valid = true; break;
                case 'O':  valid = true; break; 
                case 'P':  valid = true; break;    
                case 'Q':  valid = true; break;    
                case 'R':  valid = true; break;
                case 'S':  valid = true; break; 
                case 'T':  valid = true; break;
                case 'U':  valid = true; break;    
                case 'V':  valid = true; break;
                case 'W':  valid = true; break;
                case 'X':  valid = true; break; 
                case 'Y':  valid = true; break;    
                case 'Z':  valid = true; break;    
                default:   valid = false; 
                System.out.println("That was not a letter. Please try again, but with a letter. I promise there are no numbers or punctuation in the word.");
                                         break;
    }
    return valid;
}



}
