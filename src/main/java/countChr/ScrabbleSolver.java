package countChr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScrabbleSolver {
  public static void main(String[] args) throws IOException {

   // Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the pool of letters:");
  //  String letters = scanner.nextLine().toUpperCase();
    String letters = "itself";
    Map<Character, Integer> lettersCountMap = getCharacterCountMap(letters);
    
   // BufferedReader reader = new BufferedReader(new FileReader("C:/Users/johnm/scrabblesolver/dictionary.txt"));
    
    System.out.println("All possible words you can make with those letters:");
    String sentence = "a set of words that is complete in itself, typically containing a subject and predicate, conveying a statement, question, exclamation, or command, and consisting of a main clause and sometimes one or more subordinate clauses.";
    String[] wordArray = sentence.split(" ");
  //  for (String currentWord = reader.readLine(); currentWord != null; currentWord = reader.readLine()) {
    for (int i=0;i<wordArray.length;i++) {
    	String currentWord = wordArray[i];
      Map<Character, Integer> currentWordMap = getCharacterCountMap(currentWord);
      
      boolean canMakeCurrentWord = true;
      for (Character character : currentWordMap.keySet()) {
        int currentWordCharCount = currentWordMap.get(character);
        int lettersCharCount = lettersCountMap.containsKey(character) ?
                               lettersCountMap.get(character) : 0;
        
        if (currentWordCharCount > lettersCharCount) {
          canMakeCurrentWord = false;
          break;
        }
      }
      if (canMakeCurrentWord) {
        System.out.println(currentWord);
      }
    }
    
 //   scanner.close();
 //   reader.close();
  }

  private static Map<Character, Integer> getCharacterCountMap(String letters) {
    Map<Character, Integer> lettersCountMap = new HashMap<>();
    
    for (int i = 0; i < letters.length(); i++) {
      char currentChar = letters.charAt(i);
      
      int count = lettersCountMap.containsKey(currentChar) ?
                  lettersCountMap.get(currentChar) : 0;
      
      lettersCountMap.put(currentChar, count + 1);
    }
    
    return lettersCountMap;
  }
}
