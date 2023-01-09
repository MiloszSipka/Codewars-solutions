package codewars;

public class Grasshopper {

	public static void main(String[] args) {
		int s1 = 70;
		int s2 = 70;
		int s3 = 70;
		System.out.println(getGrade(s1,s2,s3));
		
	}
	 public static char getGrade(int s1, int s2, int s3) {
		 double avg = (s1+s2+s3);
		 avg = avg/3.0;
		 
		 if(avg >= 90) {
			 return 'A';
		 }
		 else if(avg < 90 && avg >= 80){
				 return 'B';
		 }
		 else if(avg < 80 && avg >= 70){	
			 return 'C';
		 }
		 else if(avg < 70 && avg >= 60) {
			 return 'D';
		 }
		 else
		 {
			 return 'F';
		 }
	    }
	 
}
