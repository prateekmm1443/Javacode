package ThirtyPratciceQAOnString;

public class ReplaceAllInstancesAfASubstringwithAnotherSubstring {

	public static void main(String[] args) {
		System.out.println("Replace All Instances of a Substring with Another Substring");
		System.out.println();
		
		 String str = "Hello world, welcome to the world of Java.";
		 
		 String replacedString = str.replace("world", "universe");
		 
		 System.out.println("Orginal String: "+ str);
		 System.out.println("Modified String: "+ replacedString);
	}

}
