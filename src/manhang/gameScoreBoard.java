/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manhang;

/**
 *
 * @author Andrew
 */
public class gameScoreBoard {
    
    public static void wordStatus (char wordCharArray[], boolean foundIndex[]){
        //copy wordCharArray to make sure it isn't screwed with.
        char workingWord[] = wordCharArray;
        //look through working word, everywhere that foundIndex is false, make that spot in workingword a _
       for ( int k = 0;  k < workingWord.length;  k++ ){
               if(foundIndex[k] == false){
               workingWord[k] = '_';
               }
       }
       //make workingword into a string and output it
        String wordOut = String.valueOf(wordCharArray);
         System.out.println("Word:");
         System.out.println(wordOut);
    
}}
