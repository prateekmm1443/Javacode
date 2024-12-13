package myPratice;


public class countRepatingCharacters {
	public static void main(String[] args) {

		String str = "Prateek Marchappanavar";
		String str1 = str.toLowerCase();
		System.out.println(str1);

		StringBuilder sb = new StringBuilder(str1);
		for (int i = 0; i < sb.length() - 1; i++) {
			int count = 1;

			for (int j = i + 1; j < sb.length(); j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					count++;
					sb.setCharAt(j, ' ');

				}
			}
			if (sb.charAt(i) == ' ') {
				System.out.println();

			} else {
				System.out.println("Char: " + sb.charAt(i) + " " + "Present: " + count);
			}
		}

	}
}
