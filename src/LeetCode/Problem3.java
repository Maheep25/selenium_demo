package LeetCode;

/**
 * Given two integers a and b, return the sum of the two integers without using the operators + and -.
 */
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 34;
		int b = 4;
		int sum = 0;
		
		sum = Math.addExact(a, b);
		System.out.println(sum);

	}

}
