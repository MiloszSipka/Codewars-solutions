package codewars;

public class OppositeNumber {

	public static void main(String[] args) {
	System.out.println(opposite(0));
	
	}
	  public static int opposite(int number)
      {
		  
		  if(number > 0) {
			  return 0 - number;
		  }
		  else {
			  return Math.abs(number);
		  }
     
      }
}
