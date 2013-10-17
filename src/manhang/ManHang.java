
/*
 *Variables for hangman=
 *Start screen:
 *Wins
 *Losses
 *Rounds Played
 *Player count
 *Difficulty
 *
 *Gameplay:
 *Word consisting of 16 variables for letter spots
 *Variables for unguessed letters
 *Variables for guessed letters.
 *Variable for the current guess letter.
 *
 */
package manhang;
import java.util.Scanner;
/**
 *
 * @author Andrew
 */
public class ManHang {

    /**
     * @param args the command line arguments
     */
 
 public static void main(String[] args) {
     splashScrene();
     startMenu();
     gameMenu();
     scoreboard();
     
    }
 
 public static void startMenu() {
     int input = 1;
     System.out.println("Start Game = 1");
     System.out.println("Help Menu = 2");
     Scanner scan = new Scanner(System.in);
     input = scan.nextInt(); 
            
            
 }
 
 
 public static void gameMenu() {
          // Start screen, select difficulty and player count.
          int winloss = 0;
          int win = 0;
          int loss = 0;
          int percentage = 0;
          int difficulty = 2;
        int players = 1;
        int scoreWin = 0;
        int scoreLoose = 0;
        System.out.println("Please select difficulty 1-3");
        System.out.println("Number of players? 1-4");
 
        System.out.println("You selected " + difficulty + " difficulty with " + players + " players.");
        winloss = game();
        winloss = game();
    //    while (winloss != 0 || winloss != 1) {
   //       System.out.println("Read the instructions and try again.");
   //         winloss = game();}

    if (winloss == 1) win++;
    if (winloss == 0) loss++;
    percentage = (win / (win + loss)*100);
     System.out.println("You have won " + win + " times and lost " + loss + " times, your percentage is " +
             percentage + "%");
        
     
 }
   public static int randInt(int min, int max) {

     //Usually this can be a field rather than a method variable
   // Random rand = new Random();

   // nextInt is normally exclusive of the top value,
 //   so add 1 to make it inclusive
   int randomNum = 2;
           //rand.nextInt((max - min) + 1) + min;

   return randomNum; 
}
    public static int game(){
     int scoreWin = 0;
     int difficulty = 2;
     String[] word = {"a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a"};
     
    // if (difficulty == 1) word = wordsEasy[randInt(1,3)];
   //  if (difficulty == 2) word = wordsMedium[randInt(1,3)];
   //  if (difficulty == 3) word = wordsHard[randInt(1,3)];
 //   String[] wordsEasy = {"ball","cat","shoe"};
//    String[] wordsMedium = {"orange","aardvark","nachos"};
//    String[] wordsHard = {"Programming","Titanium","Tungsten"};
 //   String[] wordsEasyHint = {"round","fluffy","foot"};
//    String[] wordsMediumHint = {"collor fruit","aa","nachos"};
//    String[] wordsHardHint = {"Programming","Titanium","Tungsten"};      
 //   int gusssStatus = 0;
     int winloss = 0;       
            System.out.println("Did you win? yes 1 no 0.");
           Scanner scan = new Scanner(System.in);
            winloss = scan.nextInt();     
   return winloss;
    }

    public static void scoreboard(){
    System.out.println("|------    "); 
    System.out.println("|       |  "); 
       
    System.out.println("|       0  "); 
 
    System.out.println("|      /|\\  "); 
    System.out.println("|       |   "); 
    System.out.println("|       |\\  "); 
    System.out.println("|       /\\  "); 
    System.out.println("|       /   ");
    System.out.println("|        / \\ ");
 
    System.out.println("|________"); 
    System.out.println("Word:");
    System.out.println("_  _  _  _  _  _  _  _");

    System.out.println("Avalable:");
    System.out.println("A B C D E F G H I"); 

    System.out.println("Wrong:");
    System.out.println("Q Z X LCF]");
  }
  
    
    
    public static void helpMenuView(){
        
        
        
        
    }
    
     public static void splashScrene(){
        System.out.println("***********************************************************************"); 
        System.out.println("*                                                __                   *"); 
        System.out.println("*   |\\    /|   /\\   |\\  |   |   |   /\\   |\\  |  /  \\                 *"); 
        System.out.println("*   | \\  / |  /--\\  | \\ |   |---|  /--\\  | \\ | |  __                  *"); 
        System.out.println("*   |  \\/  | /    \\ |  \\|   |   | /    \\ |  \\|  \\__/                  *"); 
        System.out.println("*                                                                     *"); 
        System.out.println("*                          A hangman game.                            *"); 
        System.out.println("*                                                                     *");  
        System.out.println("*         1-4 players, Easy, Medium, Hard difficulty                  *");
        System.out.println("*               Guess a letter, find the word.                        *"); 
        System.out.println("***********************************************************************");   
        
    }
    
    
}
