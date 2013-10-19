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
    public static int number() {
    int number = 0;
    Scanner scanNumber = new Scanner(System.in);
    number = scanNumber.nextInt(); 
    return number;
    }

    public static char letter() {
        Scanner scanLetter = new Scanner(System.in);
        String letter = scanLetter.next();
        char[] guess;
        guess = letter.toCharArray();
        return guess[0];
        }
    
    
    
    
}
