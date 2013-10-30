/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manhang;

import java.util.Arrays;

/**
 *
 * @author Andrew
 */
public class gameControl {
     public static int game(int players, int difficulty, int winLoss, int win, int loss, int alphabetSwitch) {

 
         
         System.out.println("TEST. please type score, playerID, guessRight and guessWrong");
         int score = getInput.number(6);
         int playerID = getInput.number(4);
         int guessRight = getInput.number(9);
         int guessWrong = getInput.number(9);
  
         int thisIsAnArray[] = {1,2,3,4,5};
         int rand = chooseWord.randNumber(1,7);
         //pick a word
         String wordString = chooseWord.pickRandWord(difficulty, rand);
         //get it's index
         int wordIndex = chooseWord.wordIndex(difficulty, rand);
         //make word into char array
         char wordCharArray[] = wordString.toCharArray();
          for(int i=0;i<wordCharArray.length;i++){
           System.out.println("Data at ["+i+"]="+wordCharArray[i]);
            }
         //put this somewhere else.
                   switch (alphabetSwitch) {
             case 1: Arrays.sort(wordCharArray);   
                     break;
            default: 
                    break;
        }
          
          
          
         //play untill loose
         for(int gameOver = 0; gameOver >= 1;){
             
   
         turnOptionMenu.turnControl(players, difficulty, winLoss, win, loss);    
             
         gameBoard.scoreBoard(score, playerID, guessRight, guessWrong);
         System.out.println("How many wrong guesses? 1-6");
         gameBoard.hungMan(getInput.number(6));

         gameBoard.turnBoard(score);
         //checking an array for a match.
             for (int again = 0; again >= thisIsAnArray[4]; again++){
             if (score == thisIsAnArray[again]){
                System.out.println(thisIsAnArray[again]);
             }
             }
         
         if(guessWrong >= 6)
         {gameOver++;
         winLoss = 0;}
         
         }
         
         System.out.println("Did you win the game? 1-win 0-loose");
     int currentWinLoss = getInput.number(900);
    return currentWinLoss;
    }
     

     
     
     
}
