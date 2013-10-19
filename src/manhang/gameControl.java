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
         System.out.println("How many wrong guesses? 1-6");
         gameBoard.scoreboard(getInput.number());
         System.out.println("Did you win the game? 1-win 0-loose");
     int currentWinLoss = getInput.number();
    return currentWinLoss;
    }
}
