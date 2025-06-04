package LeetCode;

import java.util.Stack;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "{}{[)}}}}[)";
		String s2 = "{}()[{])";
		String s3 = "{[}(()]}[]";
		//Strig s4 = ""

		System.out.println(isValid(s1)); // true
		System.out.println(isValid(s2)); // true
		System.out.println(isValid(s3)); // false
	}

	public static boolean isValid(String a) {
		Stack<Character> stack = new Stack<>();
		for (char ch : a.toCharArray()) {
			if (ch == ('('))
				stack.push(')');
			else if (ch == ('['))
				stack.push(']');
			else if (ch == ('{'))
				stack.push('}');
			else {
				if (stack.isEmpty() || stack.pop() != ch) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
//Prac.
//		public static boolean isValid(String s)
//		{
//			Stack<Character> stack = new Stack<>();
//			for(char ch : s.toCharArray())
//			{
//				if(ch == '{' ) stack.push('}');
//				else if(ch == ('[')) stack.push(']');
//				else if (ch == ('(')) stack.push(')');
//				else {
//					if(stack.isEmpty() || stack.pop() !=ch)
//					{
//						return false;
//					}
//				}
//			}
//			return stack.isEmpty();
//		}
//	}
