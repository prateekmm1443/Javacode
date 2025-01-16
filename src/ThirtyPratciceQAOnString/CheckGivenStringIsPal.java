package ThirtyPratciceQAOnString;

public class CheckGivenStringIsPal {

	public static void main(String[] args) {
		
		String str = "dehjged";
		boolean status = false;
		
		String str1 = str.toLowerCase();
		System.out.println(str1);
		
		StringBuilder sb = new StringBuilder(str1);		
		String xyz = sb.reverse().toString();
		System.out.println(xyz);
	 	
		
		for(int i=0; i<str1.length()-1;i++) {			
			
			if(str1.charAt(i)==xyz.charAt(i)) {
				status = true;
			}else {
				status = false;
				break;
			}
		}
		
		System.out.println(status);
		
		if(status) {
			System.out.println("Pal");
		}else {
			System.out.println("not Pal");
		}
		
		
	}

}

/*
 * Find the Longest Substring Without Repeating Characters
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Find All Permutations of a Given String
 * 
 * Count the Frequency of Each Character in a String
 * Create a New String by Removing All Occurrences of a Given Character
 * Determine if a String is a Valid Number (Integer/Float)
 * Check if a String is an Isogram (No Repeated Characters)
 * Implement a Method to Compare Two Strings for Equality (Without Using.equals())
 * Rotate a String to the Left by a Given Number of Characters
 * 
 * 
 * 
 * Convert a Given String to Camel Case
 * Count the Number of Times One String Occurs in Another
 * Extract Numbers from a String and Return as a List
 * Validate a String as a Proper Email Address
 * Find the Position of a Substring in a String
 * 
 * */
