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
    

 public static void gameMenu() {
          // Start screen, select difficulty and player count.
          int winLoss = 0;
          int difficulty;
          int players = 1;
          int scoreWin = 0;
          int scoreLoose = 0;
        System.out.println("Please select difficulty 1-3");
        difficulty = getInput.number(3);
        System.out.println("Number of players? 1-4");
        players = getInput.number(4);
        System.out.println("You selected " + difficulty + " difficulty with " + players + " players.");
     
        turnOptionMenu.turnControl(players, difficulty);
        gameEndScore(winLoss, players, difficulty);  
 }
    
 
  public static void gameRun(int players, int difficulty) {
       turnOptionMenu.turnControl(players, difficulty);

   
  }
  
  public static void gameEndScore(int winLoss, int players, int difficulty) {
       
          int win = 0;
          int loss = 0;
          int percentage;
          winLoss = gameControl.game(players, difficulty);
  
        switch (winLoss) {
            case 0:     loss++; break;       
            case 1:     win++; break;}
    percentage = (win / (win + loss)*100);
     System.out.println("You have won " + win + " times and lost " + loss + " times, your percentage is " +
             percentage + "%");
      
      
      
  }
  
  
}
