package ThirtyPratciceQAOnString;

public class ConvertStringToArrayAndBack {

	public static void main(String[] args) {
		
		System.out.println("Converting String to charArray and charArray to String");
		
		String str = "Prateek";
		
		System.out.println("String -> charArray");
		
		char[] ch = str.toCharArray();
		for(char c : ch) {
			System.out.print(c+" ");
		}
		
		System.out.println("CharArray -> String");
		String str1 = new String(ch);
		System.out.println(str1);

	}

}
