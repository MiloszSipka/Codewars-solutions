package codewars;

public class SquarenSum {

	public static void main(String[] args) {

	}
	public static int squareSum(int[] n)
	  {
		int result = 0;
		
		for(int i = 0; i < n.length; i++) {
			result += Math.pow(n[i], 2);
		}
		
		return result; 
	  
	  }
}
