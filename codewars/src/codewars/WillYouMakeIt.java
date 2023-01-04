package codewars;

public class WillYouMakeIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
	 	  if(distanceToPump > mpg * fuelLeft)
			{
				return false;
			}
			else{
				return true;
			}
	
	  }
}
