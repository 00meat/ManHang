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
          int scoreWin = win;
          int scoreLoose = loss;
          int alphabetSwitch = 0;
        System.out.println("Please select difficulty 1-3");
        difficulty = getInput.number(3);
        
        System.out.println("You selected " + difficulty + " difficulty.");
        
        
        winLoss = gameControl.game(difficulty, winLoss, win, loss);
        
        return winLoss;
 }
    
 
  public static void gameRun(int players, int difficulty, int winLoss, int win, int loss) {
       int i = 1;
      while (i < 2){
          turnOptionMenu.turnControl(difficulty, winLoss, win, loss);
      i++;
      }
 
  }
  
  public static void gameEndScore(int win, int loss) {
          int percent;
          if (win < 0 || loss < 0){
           System.out.println("Something before gameMenu.gameEndScore screwed up and made win or loss less than 0.");
          }
    percent = (win / ((win + loss)*100));
     System.out.println("You have won " + win + " times and lost " + loss + " times, your percentage is " +
             percent + "%");
  }
  
  
}
