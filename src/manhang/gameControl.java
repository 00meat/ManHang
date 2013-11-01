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
     public static int game(int players, int difficulty, int winLoss, int win, int loss) {

 
         
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
 
         //output word result, disable in finished version
         for(int i=0;i<wordCharArray.length;i++){
           System.out.println("Data at ["+i+"]="+wordCharArray[i]);
            }
   
         //play untill loose
         for(int gameOver = 0; gameOver <= 1;){
       //tturn menu
        int alphabetSwitch = turnOptionMenu.turnControl(players, difficulty, winLoss, win, loss);    
             
         gameBoard.scoreBoard(score, playerID, guessRight, guessWrong);
         System.out.println("How many wrong guesses? 1-6");
         gameBoard.hungMan(getInput.number(6));

         gameBoard.turnBoard(score);
         //checking an array for a match. unused code start
             for (int again = 0; again >= thisIsAnArray[4]; again++){
             if (score == thisIsAnArray[again]){
                System.out.println(thisIsAnArray[again]);
             }
             }
         //end of unused code
             
             
             
             
             /*
              *    SORTING
              *       ALPHABETICALLY
              *             STARTS
              *                 RIGHT
              *  ------------------HERE
              * |
              * |    I would have put it in another function, but that
              * |    was like trying to pull a piston out of an engine, 
              * |    put it in the trunk, and get it to still work right.
              * |    This is where all the stuff it is working with is.
              * |    This is where it is going to work with it.
              * |___________
              *            \/
              */
                            switch (alphabetSwitch) {
             case 1:
                 //can't do this, replace with a for loop sorting thing
               //  Arrays.sort(wordCharArray);
                 //trying new sort
                 wordCharArray = alphaSorter (wordCharArray);
                          //turn it off
                     alphabetSwitch = 0;    
                     break;
             case 2: char smallest = smallestLetter(wordCharArray);
                 break;
                 
             case 3: char biggest = biggestLetter(wordCharArray);
                 break;   
            default: 
                    break;
        }
                            for(int l=0;l<wordCharArray.length;l++){
           System.out.println("Data at ["+l+"]="+wordCharArray[l]);
            }
                            
                            
         if(guessWrong >= 6)
         {gameOver++;
         winLoss = 0;}
         
         }
         
         System.out.println("Did you win the game? 1-win 0-loose");
     int currentWinLoss = getInput.number(900);
    return currentWinLoss;
    }
     
public static char smallestLetter (char wordCharArray[]){
           for ( int k = 0;  k < wordCharArray.length;  k++ ){
                 
                 int j;
            boolean flag = true;  // will determine when the sort is finished
            char temp = 'a';

            while ( flag )
            {
                  flag = false;
                  for ( j = 0;  j < wordCharArray.length - 1;  j++ )
                  {
                      if ( wordCharArray[ j ] > wordCharArray[ j+1 ] )
                                 {   // ascending sort
                                  //      sortingChars (wordCharArray[ j ], wordCharArray[ j+1], temp)= temp;
                                    temp = wordCharArray[ j ];
                                    wordCharArray[ j ] = wordCharArray[ j+1];   
                                     // swapping
                                     wordCharArray[ j+1] = temp; 
                                      flag = true;
                                  } 
                             } 
                        }  
                }
             
    
    //not implemetned
    return wordCharArray[0];
}



   public static char biggestLetter (char first[]){
    
             
    
    //not implemetned
    return first[first.length];
}  
     public static char[] alphaSorter (char wordCharArray[]){
             
            for ( int k = 0;  k < wordCharArray.length;  k++ ){
                 
                 int j;
            boolean flag = true;  // will determine when the sort is finished
            char temp = 'a';

            while ( flag )
            {
                  flag = false;
                  for ( j = 0;  j < wordCharArray.length - 1;  j++ )
                  {
                      if ( wordCharArray[ j ] > wordCharArray[ j+1 ] )
                                 {   // ascending sort
                                  //      sortingChars (wordCharArray[ j ], wordCharArray[ j+1], temp)= temp;
                                    temp = wordCharArray[ j ];
                                    wordCharArray[ j ] = wordCharArray[ j+1];   
                                     // swapping
                                     wordCharArray[ j+1] = temp; 
                                      flag = true;
                                  } 
                             } 
                        }  
                }
                 //end new sort
   
    return wordCharArray;
}  
        
     
}
