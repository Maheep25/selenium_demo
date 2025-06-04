package LeetCode;

import java.util.Arrays;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 */
public class Problem1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] num = {100,4,200,1,3,2, 9, 19};
		System.out.println(Arrays.toString(num));
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		int curLen = 1;
		int maxLen = 1;
		
		for(int i = 1; i<num.length; i++)
		{
			if(num[i] == num[i-1])
			{
				continue;
			}
			else if(num[i] == num[i-1]+1)
			{
				curLen++;
			}
			else {
				break;
			}
			maxLen = Math.max(maxLen, curLen);
		}
		System.out.println(maxLen);
		

	}

}
