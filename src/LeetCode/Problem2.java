package LeetCode;

import java.util.Arrays;
import java.util.List;

/**
 * Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words. Do not include any extra spaces.
 */
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "World full of living beings";
		
		List<String> rev = Arrays.asList(sentence.split(" "));
		
		for (int i = rev.size() -1 ; i>= 0; i--)
		{
			System.out.print(rev.get(i));
			if(i!=0) {
				System.out.print(" ");
			}
		}
		

	}

}
