/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manhang;

/**
 *
 * @author Andrew
 */
public class chooseWord {
  
    
    
    
    
    public static int randNumber(int min, int max){
            int randomNum = min + (int)(Math.random()*max);
            return randomNum;
    }
        
    public static String pickRandWord(int difficulty, int rand){
        String chosenWord = "";
        String wordListEasy[] = {"cat", "dog","rat","bird","salt","word","ball"};
        String wordListMedium[] = {"catapult", "racoondog","boggart","polecat","saltwatter","wording", "baloon"};  
        String wordListHard[] = {"hexadecimal", "mountian","tungsten","titanium","sodium","surveillance", "bitcoin"};        
        
           switch (difficulty) {
                case 1:  chosenWord = wordListEasy[rand]; break;
                case 2:  chosenWord = wordListMedium[rand]; break;
                case 3:  chosenWord = wordListHard[rand]; break;      
           default:  System.out.println("Invalid difficulty.");
                    break; }
        return chosenWord.toUpperCase();
    }
    
        public static int wordIndex(int difficulty, int rand){
        int easyIndex[] = {3,3,3,4,4,4,4};
        int medIndex[] = {8,9,7,7,10,7,6};
        int hardIndex[] = {11,8,8,8,6,12,7};
        int index = 0;
        switch (difficulty) {
                case 1:  index = easyIndex[rand]; break;
                case 2:  index = medIndex[rand]; break;
                case 3:  index = hardIndex[rand]; break;      
                  default:  System.out.println("Invalid difficulty.");
                    break; }
        return index;
    }
    
    
    
    
}
