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
     public static int game(int players, int difficulty, int winLoss, int win, int loss) {
            System.out.println("TEST. please type score, playerID, guessRight and guessWrong");
         int score = getInput.number(6);
         int playerID = getInput.number(4);
         int guessRight = getInput.number(9);
         int guessWrong = getInput.number(9);
         

         for(int gameOver = 0; gameOver >= 1;){
             
         turnOptionMenu.turnControl(players, difficulty, winLoss, win, loss);    
             
         gameBoard.scoreBoard(score, playerID, guessRight, guessWrong);
         System.out.println("How many wrong guesses? 1-6");
         gameBoard.hungMan(getInput.number(6));

         gameBoard.turnBoard(score);
         
         if(guessWrong >= 6)
         {gameOver++;
         winLoss = 0;}
         
         }
         
         System.out.println("Did you win the game? 1-win 0-loose");
     int currentWinLoss = getInput.number(900);
    return currentWinLoss;
    }
     
     
     
}
