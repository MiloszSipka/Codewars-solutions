package codewars;

public class AreYouPlayingBanjo {

	public static void main(String[] args) {
	
		String name1 = "Roberto";
		String name2 = "matt";
		System.out.println(areYouPlayingBanjo(name1));
		System.out.println(areYouPlayingBanjo(name2));

	}
	
	
	  public static String areYouPlayingBanjo(String name) {
		char[] nameChar = name.toCharArray();
		 
		if(nameChar[0] == 'R' || nameChar[0] == 'r') {
			return name + " plays banjo";
		}
		else {
			return name + " does not play banjo";
		}
	
	  
	  
	}
}