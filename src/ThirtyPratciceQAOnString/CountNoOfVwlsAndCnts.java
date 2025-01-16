package ThirtyPratciceQAOnString;

public class CountNoOfVwlsAndCnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//a e i o u
		String str1 = "I am Prateek Marchappanavar";
		String str = str1.toLowerCase();
		int vowels=0, consonants=0;
		
		for(int i=0; i<=str.length()-1; i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u') {
				vowels++;
			}else {
				consonants++;
			}
		}
		
		System.out.println("Number of vowels in a given string are: "+vowels);
		System.out.println("Number of consonants in a given string are: "+consonants);
		
	}

}
