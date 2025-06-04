package LeetCode;

public class Int {

	public static void main(String args[]) {
		   String sent  = "apple ear rat tea";
		   
		  
		   String[] word = sent.split(" ");
		   
		   int len = word.length;
		   // System.out.println(word[0]);
		   
		   for (int i = 0; i<len; i++)
		   {
		       for (int j = i+1; j< len; j++)
		       {
		           if(word[i]==word[j])
		           {
		               System.out.print(true);
		           }
		       }
		   }
	}
}

