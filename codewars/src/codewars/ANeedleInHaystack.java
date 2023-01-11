package codewars;

public class ANeedleInHaystack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static String findNeedle(Object[] haystack) {
		 int position = 0;
		   for(int i = 0; i < haystack.length; i++) {
			   if(haystack[i] != null && haystack[i].equals("needle")) {
				  position = i;
			   } 
}
		   return "found the needle at position " + position;
	 }
	 }
	 
