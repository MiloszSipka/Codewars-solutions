package codewars;

public class IfYouCantSleep {
	public static void main(String[] args) {
	System.out.println(countingSheep(3));
	
	}
	  public static String countingSheep(int num) {
		  String result = "";
				  for(int i = 1; i <= num; i++) {
					result += i + " sheep...";
				  }
		    return result;
		  }
		}