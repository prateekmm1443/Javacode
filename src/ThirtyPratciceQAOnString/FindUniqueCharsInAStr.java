package ThirtyPratciceQAOnString;

import java.util.HashSet;

public class FindUniqueCharsInAStr {

	public static void main(String[] args) {
		System.out.println("Find all unique character in a given string");

		String str = "Prateek Marchappanavar";
		String str1 = str.toLowerCase();
		HashSet<Character> setChar = new HashSet<>();

		// add all character from string into hashset
		System.out.println("Unique Character in a String are: ");
		for (int i = 0; i < str1.length(); i++) {
			setChar.add(str1.charAt(i));
		}

		// print the hashset
		for (Character c : setChar) {
			System.out.print(c);
		}
		System.out.println();
		// create a string builder class and the iteams into it
		StringBuilder sb = new StringBuilder();
		for (Character c : setChar) {
			sb.append(c);
		}

		System.out.println("StringBuilder: " + sb);

		// convert string builder into string
		String str2 = new String(sb);
		System.out.println("String: " + str2);

	}

}
