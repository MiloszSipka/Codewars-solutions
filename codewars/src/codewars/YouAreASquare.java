package codewars;

public class YouAreASquare {

	public static void main(String[] args) {
		int x = 0;
		System.out.println(isSquare(x));
	}
	public static boolean isSquare(int n) {        
	double temp = Math.sqrt((double)n);
		
	if(n>= 0 && temp % 1 == 0) {
		return true;
	}
	else {
		return false;
	}
    }
}
