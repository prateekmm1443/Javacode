package javacoding;

public class countVowelsAndConsonents {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String alphabets = "Preateek Marchappanavar";//"qwertyuiopasdfghjklzxcVBNM";
		int count = 0;
		
		String loweralpha = alphabets.toLowerCase();
		System.out.println(loweralpha);		
		System.out.println(loweralpha.length());
		
		for(int i=0; i<loweralpha.length(); i++) {
			if(alphabets.charAt(i) == 'a' || alphabets.charAt(i)=='e' || alphabets.charAt(i)=='i' || alphabets.charAt(i)=='o' || alphabets.charAt(i)=='u') {
				count++;
			}
		}
		
		System.out.println("Number of vowels in a given string are: "+count);
		int con = alphabets.length()-count;
		System.out.println("Number of consonents in a given string are: "+con);
	}

}
