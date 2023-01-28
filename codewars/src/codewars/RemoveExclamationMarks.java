package codewars;

public class RemoveExclamationMarks {

	public static void main(String[] args) {
		String greeting = "Hello there!!!";
		
		System.out.println(removeExclamationMarks(greeting));

	}
	static String removeExclamationMarks(String s) {
	     return s.replaceAll("!", "");
}
	}

