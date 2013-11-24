/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manhang;

/**
 *
 * @author Andrew
 */
public class gameMenu extends Menu {

         static public int winLoss = 0;
         static public int difficulty;
         static private int scoreWin;
         static private int scoreLoose;
         static private int alphabetSwitch = 0;
         static private int percent;
    
    
 public static int gameMenu () {
          // Start screen, select difficulty and player count.
        scoreWin = win;
        scoreLoose = loss;
        System.out.println("Please select difficulty 1-3");
        difficulty = getInput.number(3);
        
        System.out.println("You selected " + difficulty + " difficulty.");
        
        
        winLoss = gameControl.game(difficulty, winLoss);
        
        return winLoss;
 }
    
 
  public static void gameRun(int players, int difficulty, int winLoss) {
       int i = 1;
      while (i < 2){
          turnOptionMenu.turnControl(difficulty, winLoss, win, loss);
      i++;
      }
 
  }
  
  public static void gameEndScore() {
          
          if (win < 0 || loss < 0){
           System.out.println("Something before gameMenu.gameEndScore screwed up and made win or loss less than 0.");
          }
    percent = (win / ((win + loss)*100));
     System.out.println("You have won " + win + " times and lost " + loss + " times, your percentage is " +
             percent + "%");
  }
  
  
}
