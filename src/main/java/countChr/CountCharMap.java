package countChr;

import java.util.HashMap;
import java.util.Map;

public class CountCharMap {
	
	public static void main(String[] args) {
		String leterstoMakeWord = "itself";
		
		Map<Character,Integer> letterCount = new HashMap<>();
		
		letterCount = getCharCount(leterstoMakeWord);
		
		System.out.println(letterCount.entrySet());
		System.out.println(letterCount.keySet());
		
		String sentence = "a set of words that is complete in itself, typically containing a subject and predicate, conveying a statement, question, exclamation, or command, and consisting of a main clause and sometimes one or more subordinate clauses.";
		String[] words = sentence.split(" ");
		
		for(String word:words) {
			Map<Character,Integer> sentenceLetterCount = new HashMap<>();
			sentenceLetterCount = getCharCount(word);
			boolean canMakeWord = false;
			for(int i=0;i<word.length();i++) {
				int charLetterCount = letterCount.containsKey(word.charAt(i))?letterCount.get(word.charAt(i)):0;
				
				int charsentenceLetterCount = sentenceLetterCount.get(word.charAt(i));
				if(charLetterCount<charsentenceLetterCount) {
					canMakeWord = true;
					break;
				}
			}
			if(!canMakeWord)
				System.out.println(word);
			
		}
		
	}

	private static Map<Character, Integer> getCharCount(String leterstoMakeWord) {
		Map<Character,Integer> letterCount = new HashMap<>();
		for(int i=0; i<leterstoMakeWord.length();i++) {
			char currentChar = leterstoMakeWord.charAt(i);
			int count = letterCount.containsKey(currentChar)?letterCount.get(currentChar) : 0;
			letterCount.put(currentChar, count+1);
			
		}
		return letterCount;
	}

}
