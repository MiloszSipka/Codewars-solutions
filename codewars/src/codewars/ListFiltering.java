package codewars;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class Kata {
		  public static List<Object> filterList(final List<Object> list) {
	      Object temp;
	      List<Object> result = new ArrayList<Object>();
			  for(int i = 0; i < list.size(); i++) {
	        temp = list.get(i);
				 if(temp instanceof Integer) {
					 result.add(temp);
				 }
	        
			  }
			return result;
	}
		  }
}
