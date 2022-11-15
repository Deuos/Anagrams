package application;
import java.util.Scanner;


public class Anagrams {
	
	/**
	 * @author Patel
	 * 
	 * Input two strings
	 * 
	 * Result tells whether or not they are anagrams or not.
	 * 
	 * How this works is that,
	 * first it will convert phrases into an array and then it will count how many times a letter is shown up
	 * Then, it will match the count to the other phrase and you will get a true if they are the same or a false if they are different even by 1 letter
	 * 
	 * 
	 * 
	 * 
	 */
	public static int[] countLetters(String word) {
		
		int[] counts = new int[26];
		
		//converts the string into all lowercase
		
		String letters = word.toLowerCase();
		
		//converts the string into char array
		
		char[] letter = letters.toCharArray();
		
		//list of alphabet in char
		
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		
		//The first for loop runs it 27 times, and for each letter it will test it with the word letter and if its correct then it will count++;
		
		for(int i = 0; i < alphabet.length; i++) {
			
		
			for(int k = 0; k < letter.length; k++) {
				
				if(alphabet[i] == letter[k]) {
					
					counts[i]++;
				
				}
				
			}
			
		}
				
		return counts;
	}
	
	/**
	 * Compares two arrays and
	 * returns true if they have
	 * the same contents
	 * 
	 * @param c1 array 1
	 * @param c2 array 2
	 * @return true if c1 and c2 have the same contents
	 */
	public static boolean sameCounts(int[] c1, int[] c2) {
		
		//This if statement first checks if its equals with both the lists in length wise, and then it loops thru and checks if one of them is not correct it will retrun false. 
		
		if(c1.length == c2.length) {
			
			for(int i = 0; i < c1.length; i++) {
				
				if(c1[i] != c2[i]) {
					
					return false;
				}
				
			}
			
			return true;
			
			
		}
		
		return false; // write your code here
	}

	/**
	 * Inputs two phrases and outputs
	 * if they are anagrams (ignoring
	 * case and any non-letter
	 * characters)
	 * 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Inputs
		
		String phrase1 = "";
		String phrase2 = "";
		
		System.out.print("Enter phrase 1: ");
		
		phrase1 = input.nextLine();
		
		System.out.print("Enter phrase 2: ");

		phrase2 = input.nextLine();
		
		//Calls the countletters for each phrase, and then it will do the samecount and return either true or false
		
		boolean test = sameCounts(countLetters(phrase1),countLetters(phrase2));
		
		//if statement to check whether of its true or false, and displaces based on that.
		
		String anagram = (test == true) ? "anagrams" : "not anagrams"; 
		
		System.out.printf("These phrases are %s.%n", anagram);
		
		input.close();
	
	}

}
