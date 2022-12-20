package codewars;

public class SquareSum {

	public static void main(String[] args) {
		int[] n = {10,15,20};
		System.out.println(squareSum(n));
		
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
