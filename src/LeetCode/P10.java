package LeetCode;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int target = 10;
		
		
		for(int i = 0; i<num.length; i++)
		{
			for (int j = i+1; j< num.length; j++)
			{
				if(num[i]+num[j] == target)
				{
					System.out.println("Index value: " + num[i] +" "+num[j]);
				}
			}
		}
	}

}
