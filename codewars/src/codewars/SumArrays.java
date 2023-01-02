package codewars;

public class SumArrays {

	public static void main(String[] args) {
	double[] numbers = {1, 5.2, 4, 0, -1};
	System.out.println(sum(numbers));
	

	}
	  public static double sum(double[] numbers) {
		  double result = 0;
		  if(numbers != null) {
			  for(int i = 0; i < numbers.length; i++)
			  {
				result += numbers[i];
			  }
			  return result;
		  }
		  else {
			  return 0;
			
		  }
		  }
}
