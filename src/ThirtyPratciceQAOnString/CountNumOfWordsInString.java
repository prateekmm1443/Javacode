package ThirtyPratciceQAOnString;

public class CountNumOfWordsInString {

	public static void main(String[] args) {
		String str = "This is a test string.";

        // Split the string by space and count the number of words
        String[] words = str.split("\\s+"); // "\\s+" is a regular expression for one or more spaces
        System.out.println("Number of words: " + words.length); // Outp
	}

}
