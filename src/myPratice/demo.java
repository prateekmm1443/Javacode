package myPratice;


public class demo {

	public static void main(String[] args) {

		String str = "Prateek";
		boolean status = false;
		int i, j;
		
		System.out.println("Length of the given String is: "+str.length());
		
		String lowerString = str.toLowerCase();
		System.out.println("Converting a whole string into lower case :"+lowerString);
		
		
		StringBuilder sb = new StringBuilder(lowerString);
		
		for(i=0; i<=sb.length()-1; i++) {
			for(j=i+1; j<sb.length(); j++) {
				if(sb.charAt(i)==sb.charAt(j)) {
					status = true;
					System.out.println("String has duplicates and duplicates values are: "+sb.charAt(i) +" "+sb.charAt(j));
					break;
				}
				if(status) {
					System.out.println("Duplicates index values are: "+i+" "+j);
					break;
				}
			}
			
		}
		if(!status) {
			System.out.println("String has no duplicates");
		}
		
		
	}

}
