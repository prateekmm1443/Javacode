package ThirtyPratciceQAOnString;

public class CountRepartingCharsInString {

	public static void main(String[] args) {

		System.out.println("Count the Frequency of Each Character in a String");

		String str = "Prateek Marchappanavar";
		String str1 = str.toLowerCase();

		StringBuilder sb = new StringBuilder(str1);

		for (int i = 0; i < sb.length() - 1; i++) {
			// System.out.println(sb);
			int count = 1;

			for (int j = i + 1; j < sb.length(); j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					count++;
					sb.setCharAt(j, ' ');/////////////////////////////////////////////////////////

				}
			}
			if (sb.charAt(i) == ' ') {
				System.out.println();
			} else {
				System.out.println("Character " + str1.charAt(i) + " Present " + count + " Times!");
				// System.out.println(sb);
			}
		}

	}

}
