package codewars;

public class EvenOrOdd {

	public static void main(String[] args) {
		int number = 23;
		System.out.println(even_or_odd(number));
		
	}
	 public static String even_or_odd(int number) {
		if(number%2 == 0) {
			return "Even";
		}
		else {
			return "Odd";
		}
	        
	        
	    }
}
