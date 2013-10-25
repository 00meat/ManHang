/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manhang;

/**
 *
 * @author Andrew
 */
public class stringToChars {
    
    
    public static char converter (String chosenWord, int place){
        if (Character.isLetter(Character.toUpperCase(chosenWord.charAt(place))) == true){
        return Character.toUpperCase(chosenWord.charAt(place));
        }
        else return '0';
    }
}