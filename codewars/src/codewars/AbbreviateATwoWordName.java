package codewars;

public class AbbreviateATwoWordName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static String abbrevName(String name) {
		 char firstName;
		 char lastName = 0;
		 char[] xyz = name.toCharArray();
		 firstName = xyz[0];
		 for(int i = 0; i < name.length(); i++) {
			 if(xyz[i] == ' ') {
				 lastName = xyz[i+1];
			 }
		 }
		 	String result = String.valueOf(firstName) + "." + String.valueOf(lastName);	
		    return result.toUpperCase();
		  }
}
