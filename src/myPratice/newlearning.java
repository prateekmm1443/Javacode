package myPratice;

public class newlearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madamt";
		int count = 0;
		boolean status = false;
		String str1 = str.toLowerCase();

		StringBuilder sb = new StringBuilder(str1);
		String revstr = sb.reverse().toString();

//		System.out.println(str1);
//		System.out.println(revstr);

		for (int i = 0; i <= str1.length() - 1; i++) {

			for (int j = count; j <= revstr.length();) {
				if (str1.charAt(i) == revstr.charAt(j)) {
					status = true;
				}
				count++;
				break;
			}
		}

		if (status) {
			System.out.println("pal");
		} else {
			System.out.println("Not a pal");
		}

	}

}
