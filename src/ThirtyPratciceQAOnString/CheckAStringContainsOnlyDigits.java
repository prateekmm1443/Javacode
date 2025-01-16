package ThirtyPratciceQAOnString;

public class CheckAStringContainsOnlyDigits {

	public static void main(String[] args) {
		
		System.out.println("Check if a String Contains Only Digits");
		String str = "1234";
		boolean status = false;
		
		for(int i=0; i<str.length()-1; i++) {
			if(Character.isDigit(str.charAt(i))) {
				status = true;
				
			}else {
				status = false;
				break;
			}
			
		}
		if(status) {
			System.out.println("Given string contains only digits");
		}else {
			System.out.println("Given string contains both digits & characters");
		}
		
	}

}
