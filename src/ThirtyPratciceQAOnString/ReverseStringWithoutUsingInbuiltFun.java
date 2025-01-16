package ThirtyPratciceQAOnString;

//import java.util.Scanner;

public class ReverseStringWithoutUsingInbuiltFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);		
		//System.out.println("Enter the String: ");
		//String str = sc.nextLine();
		
		
		System.out.println("Without using inbuilt function");
		String str = "prateek";
		//String str1 = str.toLowerCase();
		System.out.println(str);
		
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		System.out.println("With using inbuilt function");
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb.reverse());

	}

}
