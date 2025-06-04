package LeetCode;

public class Problem5 {
	public static void main(String[] args) {
		int a = 5010;
		// boolean flag = false;
		System.out.println(EvenOdd(a));
		System.out.println(Prime(a));
	}

	public static boolean EvenOdd(int s) {

		if (s % 2 == 0) {
			System.out.println("Even");
			return true;
		} else {
			System.out.println("odd");
			return false;
		}
	}

	public static boolean Prime(int d) {
		if (d <= 1) {
			System.out.println("Non Prime");
			return false;
		}
		for (int i = 2; i <= Math.sqrt(d); i++) {
			if (d % i == 0) {
				System.out.println("Non Prime");
				return false;
			} else {
				System.out.println("Prime...");
				return true;
			}
		}
		return true;

	}

}