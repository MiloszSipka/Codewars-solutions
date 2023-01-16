package codewars;

import java.util.List;

public class SumMixedArray {

	public static void main(String[] args) {

	}
	public int sum(List<?> mixed) {	
		int sum = 0;
	
		for(int i = 0; i < mixed.size(); i++) {
			Object temp = mixed.get(i);
			if(temp instanceof Integer) {
				int tempInt = (int) mixed.get(i);
				sum += tempInt;
			}
			else {
				String tempString = (String) mixed.get(i);
				int tempStringToInt = Integer.parseInt(tempString);
				sum += tempStringToInt;
			}
		}
		return sum;
}
}