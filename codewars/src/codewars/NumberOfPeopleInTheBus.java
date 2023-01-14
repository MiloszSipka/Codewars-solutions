package codewars;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {

	public static void main(String[] args) {
		

	}
	public static int countPassengers(ArrayList<int[]> stops) {
		int amoutOfPassengers = 0;
		int pplIn;
		int pplOut;
		for(int i = 0; i <stops.size(); i++){
			int temp[] = stops.get(i);
			pplIn = temp[0];
			pplOut = temp[1];
			amoutOfPassengers += (pplIn-pplOut);
		}
		return amoutOfPassengers;
		  }
}
