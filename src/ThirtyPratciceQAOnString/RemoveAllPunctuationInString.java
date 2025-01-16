package ThirtyPratciceQAOnString;

public class RemoveAllPunctuationInString {

	public static void main(String[] args) {
		
		System.out.println("Remove All Punctuation from a String meaning ");
		
		String str = "Hello, World! It's a beautiful day.";

		// Remove all punctuation
		String result = str.replaceAll("\\p{Punct}", "");

		System.out.println(result);
	}

}
