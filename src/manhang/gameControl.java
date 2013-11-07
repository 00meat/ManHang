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
     public static int game(int difficulty, int winLoss, int win, int loss) {

 
         
         System.out.println("TEST. please type score, playerID, guessRight and guessWrong");

         int score = 0;
         int guessRight = 0;
         int guessWrong = 0;
         //thisisanarray is just for an assignment, ignore it.
         int thisIsAnArray[] = {1,2,3,4,5};
         int rand = chooseWord.randNumber(1,7);
         //pick a word
         String wordString = chooseWord.pickRandWord(difficulty, rand);
         //get it's index
         int wordIndex = chooseWord.wordIndex(difficulty, rand);
         //make word into char array
         char wordCharArray[] = wordString.toCharArray();
         boolean foundIndex[] = makefoundIndex(wordCharArray.length);
         boolean foundIndexBefore[] = makefoundIndex(wordCharArray.length);
 
         //output word result, disable in finished version
         //no more cheat mode.
     //    for(int i=0;i<wordCharArray.length;i++){
     //     System.out.println("Data at ["+i+"]="+wordCharArray[i]);
      //      }
   
         //play untill loose
         for(int gameOver = 0; gameOver <= 1;){
       //tturn menu
        int optionSwitch = turnOptionMenu.turnControl(difficulty, winLoss, win, loss);    
             
       //  gameBoard.scoreBoard(score, guessRight, guessWrong);
       //  System.out.println("How many wrong guesses? 1-6");
       
        //this dosn't do much, turning it off.
     //    gameBoard.turnBoard(score);
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
                 int rightWrong = 0;
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
            default: 
                    break;
        }
                  gameScoreBoard.wordStatus(wordCharArray, foundIndex);          
                            
    //                        for(int l=0;l<=wordCharArray.length;l++){
     //      System.out.println("Data at ["+l+"]="+wordCharArray[l]);
      //      }
               gameScoreBoard.wordStatus(wordCharArray, foundIndex);             
                            
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



   public static char biggestLetter (char wordCharArray[]){
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
     
     //pass in the word, the guess, and found index. It will run check letter for each place in the word
     //once it it stores weather or not the letter is a match into the found index aray.
             public static boolean[] checkWord (char wordCharArray[], char comare, boolean foundIndex[]){
         for ( int k = 0;  k <= wordCharArray.length;  k++ ){
               foundIndex[k] =  checkLetter(wordCharArray, comare, k); }
        return foundIndex;
     }
     
     //check letter takes the word, the guess, and the place in the array it is checking, compares it and returns
             // weather or not it found it.
     public static boolean checkLetter (char wordCharArray[], char comare, int k){
        boolean foundit = false;
                 if (wordCharArray[k] == comare){
                 foundit = true;
                 }
        return foundit;
     }
         
     //make a bool array the length of the word, make everything in it false
     public static boolean[] makefoundIndex (int length){
        boolean fiBuilder[] = new boolean [length];
                for ( int k = 0;  k < length;  k++ ){
               fiBuilder[k] = false; }
         return fiBuilder;
     }
  
     public static boolean compare(boolean a1, boolean a2) {
            if(a1 == a2){
                return true;}
            else
         return false;
}
     
     
}
