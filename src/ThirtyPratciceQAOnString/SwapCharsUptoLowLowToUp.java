package ThirtyPratciceQAOnString;

public class SwapCharsUptoLowLowToUp {

	public static void main(String[] args) {
		
		System.out.println("Read each Character from string and swap it to upper if it is lower viserse the other condition");
		
		String str = "PratEEk";
		
		StringBuilder sb = new StringBuilder(str);
		StringBuilder sb1 = new StringBuilder();
				
		System.out.println(sb);
		for (int i=0; i<sb.length(); i++) {
			
			if(Character.isUpperCase(sb.charAt(i))) { ////////////////////////////////////////////////
				sb1.append(Character.toLowerCase(sb.charAt(i)));
			}else if(Character.isLowerCase(sb.charAt(i))) {
				sb1.append(Character.toUpperCase(sb.charAt(i)));
			}
			
		}
		System.out.println(sb1);

	}

}
