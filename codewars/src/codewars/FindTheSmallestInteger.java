package codewars;

public class FindTheSmallestInteger {

	public static void main(String[] args) {
	

	}
    public static int findSmallestInt(int[] args) {
    	int smallestInteger = args[0];
    	for(int i = 1; i < args.length; i++) {
    		if(args[i] < smallestInteger) {
    			smallestInteger = args[i];
    		}
    		
    	}
		return smallestInteger;

    } 	
}
