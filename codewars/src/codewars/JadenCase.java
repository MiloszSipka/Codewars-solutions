package codewars;
import java.util.Arrays;

	public class JadenCase {

	    public static String toJadenCase(String sentence) {
	        if (isEmpty(sentence))
	            return null;

	        String[] words = sentence.split(" ");

	        StringBuilder builder = new StringBuilder();

	        Arrays.stream(words)
	                .map(JadenCase::capitalizeWord)
	                .forEach(word -> {
	                    builder.append(word)
	                            .append(" ");
	                });

	        return builder.toString().trim();
	    }

	    public static String capitalizeWord(String word) {
	        if (isEmpty(word))
	            return null;

	        return word.substring(0, 1).toUpperCase() + word.substring(1);
	    }

	    public static boolean isEmpty(String str) {
	        return str == null || str.isEmpty();
	    }
	}