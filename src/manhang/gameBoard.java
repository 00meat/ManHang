/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manhang;

/**
 *
 * @author Andrew
 */
public class gameBoard {
    
    
    public static void scoreboard(int score){
        
        switch (score) {
            case 0:     System.out.println("|--------    "); 
                        System.out.println("|       |    "); 
                        System.out.println("|            "); 
                        System.out.println("|            "); 
                        System.out.println("|            "); 
                        System.out.println("|___________ "); 
                     break;
            case 1:     System.out.println("|--------    "); 
                        System.out.println("|       |    "); 
                        System.out.println("|       0    "); 
                        System.out.println("|            "); 
                        System.out.println("|            "); 
                        System.out.println("|___________ "); 
                     break;
             case 2:    System.out.println("|--------    "); 
                        System.out.println("|       |    "); 
                        System.out.println("|       0    "); 
                        System.out.println("|       |    "); 
                        System.out.println("|            "); 
                        System.out.println("|___________ "); 
                     break;
             case 3:    System.out.println("|--------    "); 
                        System.out.println("|       |    "); 
                        System.out.println("|       0    "); 
                        System.out.println("|      /|    "); 
                        System.out.println("|            "); 
                        System.out.println("|___________ "); 
                     break;                 
             case 4:    System.out.println("|--------    "); 
                        System.out.println("|       |    "); 
                        System.out.println("|       0    "); 
                        System.out.println("|      /|\\   "); 
                        System.out.println("|            "); 
                        System.out.println("|___________ "); 
                     break;
             case 5:    System.out.println("|--------    "); 
                        System.out.println("|       |    "); 
                        System.out.println("|       0    "); 
                        System.out.println("|      /|\\   "); 
                        System.out.println("|      /     "); 
                        System.out.println("|___________ "); 
                     break;
             case 6:    System.out.println("|--------    "); 
                        System.out.println("|       |    "); 
                        System.out.println("|       0    "); 
                        System.out.println("|      /|\\  "); 
                        System.out.println("|      /\\    "); 
                        System.out.println("|___________ "); 
                     break;
             default:  System.out.println("Unrecognized command, Please try again.");
                    start.startMenu();
                    break;
        }
        
 
    System.out.println("Word:");
    System.out.println("_  _  _  _  _  _  _  _");
    System.out.println("Avalable:");
    System.out.println("A B C D E F G H I"); 
    System.out.println("Wrong:");
    System.out.println("Q Z X LCF]");
  }
  
    
}
