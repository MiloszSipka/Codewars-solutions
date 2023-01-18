package codewars;

public class DoubleChar {

	public static void main(String[] args) {
		String name = "Milosz";
		System.out.println(doubleChar(name));

	}
	public static String doubleChar(String s){
		char[] temp = s.toCharArray();
		String result = "";
		
		for(int i = 0; i < temp.length; i++) {
			result += temp[i];
			result += temp[i];
		}
		return result;
	  }
}
