package codewars;

public class Grasshopper {

	public static void main(String[] args) {
		int s1 = 58;
		int s2 = 59;
		int s3 = 60;
		System.out.println(getGrade(s1,s2,s3));
		
	}
	 public static char getGrade(int s1, int s2, int s3) {
		 int avg = (s1+s2+s3)/3;
		 
		 if(avg >= 90) {
			 return 'A';
		 }
		 else if(avg >= 80 || avg < 90){
				 return 'B';
			 }
		 else if(avg >= 70 || avg < 80) {	
			 return 'C';
		 }
		 else if(avg >= 60  || avg < 70) {
			 return 'D';
		 }
		 else
		 {
			 return 'F';
		 }
	    }
}
