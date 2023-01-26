package codewars;

public class TheHighestProfitWins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	   public static int[] minMax(int[] arr) {
		  int [] output = new int[2];
		  output[0] = arr[0];
		  output[1] = arr[0];
		  for(int i = 1; i < arr.length; i++) {
			  if(arr[i] < output[0]) {
				  output[0] = arr[i];
			  }
			  else if(arr[i] > output[1]) {
				  output[1] = arr[i];
			  }
		  }
		return output;
	    }
}
