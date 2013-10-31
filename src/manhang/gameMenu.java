/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manhang;

/**
 *
 * @author Andrew
 */
public class gameMenu {
    

 public static int gameMenu(int win, int loss) {
          // Start screen, select difficulty and player count.
          int winLoss = 0;
          int difficulty;
          int players = 1;
          int scoreWin = win;
          int scoreLoose = loss;
          int alphabetSwitch = 0;
        System.out.println("Please select difficulty 1-3");
        difficulty = getInput.number(3);
        
        System.out.println("Number of players? 1-4");
        players = getInput.number(4);
        
        System.out.println("You selected " + difficulty + " difficulty with " + players + " players.");
        
        
        winLoss = gameControl.game(players, difficulty, winLoss, win, loss);
        
        return winLoss;
 }
    
 
  public static void gameRun(int players, int difficulty, int winLoss, int win, int loss) {
       int i = 1;
      while (i < 2){
          turnOptionMenu.turnControl(players, difficulty, winLoss, win, loss);
      i++;
      }
 
  }
  
  public static void gameEndScore(int win, int loss) {
          int percent;
    percent = (win / ((win + loss)*100));
     System.out.println("You have won " + win + " times and lost " + loss + " times, your percentage is " +
             percent + "%");
  }
  
  
}
