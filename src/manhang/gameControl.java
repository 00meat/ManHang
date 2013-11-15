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
    
        static private int rightWrong;
        static private int score = 0;
        static private int guessRight = 0;
        static private int guessWrong = 0;
        static private int thisIsAnArray[] = {1,2,3,4,5};
        static private int rand = chooseWord.randNumber(1,7);
        static private int wordIndex;
         //make word into char array
        static private String wordString;
        static private char wordCharArray[] = wordString.toCharArray();
        static private boolean foundIndex[] = makefoundIndex(wordCharArray.length);
        static private boolean foundIndexBefore[] = makefoundIndex(wordCharArray.length);
        
    
     public static int game(int difficulty, int winLoss, int win, int loss) {

 
         
         System.out.println("TEST. please type score, playerID, guessRight and guessWrong");
         //thisisanarray is just for an assignment, ignore it.
   
         //pick a word
        
         //get it's index
         wordIndex = chooseWord.wordIndex(difficulty, rand);
         wordString = chooseWord.pickRandWord(difficulty, rand);
         
 
         //output word result, disable in finished version
         //no more cheat mode.
     //    for(int i=0;i<wordCharArray.length;i++){
     //     System.out.println("Data at ["+i+"]="+wordCharArray[i]);
      //      }
   
                for (int again = 0; again >= thisIsAnArray[4]; again++){
             if (score == thisIsAnArray[again]){
                System.out.println(thisIsAnArray[again]);
             }
             }
         
         
         //play untill loose
         
         
         for(int gameOver = 0; gameOver <= 1;){
       //tturn menu, let player decide what they are doing with their turn
        int optionSwitch = turnOptionMenu.turnControl(difficulty, winLoss, win, loss);    
             
     //do what they decided, 1- alphabeize word, 2 smallest letter hint, 3biggest letter hint, 4 guess a letter
                            switch (optionSwitch) {
             case 1:
                 //can't do this, replace with a for loop sorting thing
               //  Arrays.sort(wordCharArray);
                 //trying new sort
                 wordCharArray = alphaSorter (wordCharArray);
                          //turn it off
                     optionSwitch = 0;    
                     break;
             case 2: char smallest = smallestLetter(wordCharArray);
                 break;
                 
             case 3: char biggest = biggestLetter(wordCharArray);
                 break;   
             case 4:
                 //get a guess, run it against the word and recrod results to foundIndex
                 char newGuess = askLetter.guess();
                  //copy foundindex 
                 foundIndexBefore = foundIndex;
                 foundIndex = checkWord (wordCharArray, newGuess, foundIndex);
                 rightWrong = 0;
                 for(int l=0;l < foundIndex.length;l++){
                     if (compare(foundIndex[l], foundIndexBefore[l]) == false){
                         rightWrong++; }                             
                 }
                  if (rightWrong == 0){
                        guessWrong++; }
                     else guessRight++;
                 
                 
                 gameBoard.hungMan(guessWrong);
                 gameScoreBoard.wordStatus(wordCharArray, foundIndex);
                 
                 
                 break;
            default: System.out.println("How did you even get this error? gamecontrol.game default case.");
                    break;
        }
                    
                            
    //                        for(int l=0;l<=wordCharArray.length;l++){
     //      System.out.println("Data at ["+l+"]="+wordCharArray[l]);
      //      }
                        
                            
         if(guessWrong >= 6)
         {gameOver++;
         winLoss = 0;}
         
         if(guessRight >= wordCharArray.length)
         {gameOver++;
         winLoss = 1;}
         
         
         }
         
         System.out.println("Did you win the game? 1-win 0-loose");
     
    return winLoss;
    }
     
public static char smallestLetter (char wordCharArray[]){
           for ( int k = 0;  k < wordCharArray.length;  k++ ){
                 
                 
            boolean flag = true;  // will determine when the sort is finished
            char temp = 'a';

            while ( flag )
            {
                  flag = false;
                  for (char j : wordCharArray )
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
    return wordCharArray[0];
}



   private static char biggestLetter (char wordCharArray[]){
        for ( int k = 0;  k < wordCharArray.length;  k++ ){
                 
                 
            boolean flag = true;  // will determine when the sort is finished
            char temp = 'a';

            while ( flag )
            {
                  flag = false;
                  for (char j : wordCharArray )
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
        System.out.println(wordCharArray[wordCharArray.length]);
    return wordCharArray[wordCharArray.length];
    
}  
     private static char[] alphaSorter (char wordCharArray[]){
             
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
     
     //pass in the word, the guess, and found index. It will run check letter for each place in the word
     //once it it stores weather or not the letter is a match into the found index aray.
             public static boolean[] checkWord (char wordCharArray[], char compChar, boolean foundIndex[]){
         for ( int k = 0;  k < wordCharArray.length;  k++ ){
               foundIndex[k] =  checkLetter(wordCharArray, compChar, k, foundIndex[k]); }
        return foundIndex;
     }
     
     //check letter takes the word, the guess, and the place in the array it is checking, compares it and returns
             // weather or not it found it.
     private static boolean checkLetter (char wordCharArray[], char compChar, int k, boolean foundIndex){
        boolean foundit = false;
                 if (wordCharArray[k] == compChar || foundIndex == true){
                 foundit = true;
                 }
        return foundit;
     }
         
     //make a bool array the length of the word, make everything in it false
     private static boolean[] makefoundIndex (int length){
        boolean fiBuilder[] = new boolean [length];
                for ( int k = 0;  k < length;  k++ ){
               fiBuilder[k] = false; }
         return fiBuilder;
     }
  
     private static boolean compare(boolean a1, boolean a2) {
            if(a1 == a2){
                return true;}
            else
         return false;
}
     
     
}
