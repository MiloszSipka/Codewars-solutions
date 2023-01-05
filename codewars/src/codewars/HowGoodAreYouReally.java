package codewars;

public class HowGoodAreYouReally {

	public static void main(String[] args) {
	int[] classPoints = {2,3};
	int yourPoints = 5;
	System.out.println(betterThanAverage(classPoints,yourPoints));
	
	}
	public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
	    int sum = 0;
	    for(int i = 0; i < classPoints.length; i++) {
	    	sum += classPoints[i];
	    }
	    sum += yourPoints;
	    double avg = sum / (classPoints.length+1);
	    
	    if(yourPoints > avg) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	  }
}
