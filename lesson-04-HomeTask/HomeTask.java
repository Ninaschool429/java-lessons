import java.util.Scanner;
import java.util.Arrays;

class StringProcessor {

	String str;

	StringProcessor(String str) {
		this.str = str;
	}

	boolean isTitleCase(char c) {
		return Character.isTitleCase(c);
	}

	boolean isSpace(char c) {
		return Character.isWhitespace(c);
	}
	
	String getStr() {
		return str;
	}
	
	boolean isSentence() {
		// TODO: return true if str starts from title case letter (use
		// isTitleCase() method) and ends by '.', '!' or '?'.
		char c=str.charAt(1);
		int r=str.length()-1;
		char d=str.charAt(r);
		if((isTitleCase(c))&&(d == "."||d == "!"||d == "?")) return true;
		else return false;
	}

	String getFirstWord() {
		// TODO: return the first word of the str. Use isSpace() method to find
		// if character is a space.
		int i = 0;
		while(!isSpace(str.charAt(i))) i +=1;
		String word=str.substring(0,i-1);
		return word;
		
	}

	String getLastWord() {
		// TODO: return the last word of the str. Use isSpace() method to find
		// if character is a space.
		int i = str.length();
		while(!isSpace(str.charAt(i-1))) i -=1;
		String word = str.substring(str.length()-1-i, str.length());
		return word;
	}

	boolean contains(String other) {
		// TODO: return true if str contains the argument. Hint: you can check
		// String.indexOf() method documentation
        if(str.indexOf()=-1)   
        return false;  
		else return true;
	}

}

class ArrayGenerator {

	int[] getPowers(int x, int count) {
		// TODO: generate and return the array of powers of the x starting from
		// 0. For example getPowers(2, 4) should return [ 1, 2, 4, 8 ]
		int i=0;
		int[] powers = new int [4];
		powers[0]=1;
		for(i=1;i<count;i++ ) {
		powers[i] = powers[i]*x;
		}
		return powers;
	}

}

class ArrayProcessor {

	int[] nums;

	ArrayProcessor(int[] nums) {
		this.nums = nums;
	}

	int[] getNums() {
		return nums;
	}

	int sum() {
	// TODO: return the sum of the elements of the nums array
		int summa = 0;
		for (int i = 0; i < nums.length; i++) 
		{ summa += nums[i];		
		}
		return summa;
	}

	boolean[] even() {
		// TODO: retun array of booleans each element contains true if
		// corresponding element of the nums is even and false otherwise.
		boolean[] even = {};
		for (int i = 0; i < nums.length; i++) 
		if (nums[i]%2==0)
		 {                     
		even[i]= true;
		} 
		else {
			even[i]= false;
	}  
		return even;
	}

}

public class HomeTask {

	
	public static void main (String[] args) {
		StringProcessor strProc = new StringProcessor("Hello world!");
		System.out.println("String: " + strProc.getStr());
		System.out.println("Is sentence: " + strProc.isSentence());
		System.out.println("First word: " + strProc.getFirstWord());
		System.out.println("Last word: " + strProc.getLastWord());
		System.out.println("Contains 'world': " + strProc.contains("world"));

		System.out.println();

		ArrayGenerator arrGen = new ArrayGenerator();
		System.out.println("Powers of 6: " +
				Arrays.toString(arrGen.getPowers(6, 7)));

		ArrayProcessor arrProc = new ArrayProcessor(new int[] { 1, 2, 3, 4 });
		System.out.println("Array: " + Arrays.toString(arrProc.getNums()));
		System.out.println("Sum: " + arrProc.sum());
		System.out.println("Even: " + Arrays.toString(arrProc.even()));
		
	}
}
