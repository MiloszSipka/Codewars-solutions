package codewars;

public class GrowthOfAPopulation {

	public static void main(String[] args) {
		System.out.println(nbYear(1500,5,100,5000));

	}
	  public static int nbYear(int p0, double percent, int aug, int p) {
		  int population = p0;
		  int year = 0;
		  while(population < p) {
			  population = (int) (population + (population * (percent/100)) + aug);
			  year++; 
		  }
		return year;
	    }
}
