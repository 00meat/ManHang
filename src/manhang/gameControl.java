/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manhang;

/**
 *
 * @author Andrew
 */
public class gameControl {
     public static int game(int players, int difficulty) {
         int score = getInput.number();
         int playerID = getInput.number();
         int guessRight = getInput.number();
         int guessWrong = getInput.number();
         
         System.out.println("TEST. score, playerID, guessRight, guessWrong");
         gameBoard.scoreBoard(score, playerID, guessRight, guessWrong);
         System.out.println("How many wrong guesses? 1-6");
         gameBoard.hungMan(getInput.number());
         gameBoard.turnBoard(score);
         System.out.println("Did you win the game? 1-win 0-loose");
     int currentWinLoss = getInput.number();
    return currentWinLoss;
    }
     
     
     
}
