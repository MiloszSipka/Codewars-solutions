package codewars;

public class ConvertNumberToReversedArrayOfDigits {

	public static void main(String[] args) {
		

	}

public class Kata {
  public static int[] digitize(long n) {
    String numStr = String.valueOf(n);
    int digits[] = new int[numStr.length()];
    int counter = 0;

    for(int i = numStr.length() - 1; i >= 0; i--) {
      digits[i] = Integer.parseInt(Character.toString(numStr.charAt(counter++)));
    }

    return digits;
  }
}
}