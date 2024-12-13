package myPratice;

import java.util.ArrayList;

public class Iamwhatiam {

	public static void main(String[] args) {

//		String myString = "Prateekisgoodboy";
//		ArrayList<Character> charArr = new ArrayList<>();
//		boolean shouldStop = false;
//		int count = 1;
//		
//		//adding characters to an array
//		for ( int s=0; s<myString.length(); s++) {
//			charArr.add(myString.charAt(s));			
//		}
//		
//		//Printing char array
//		System.out.println(charArr);
//		
//		
//		//Iterating  char by char to check it as duplicate elements or not
//		for (int i=0; i<charArr.size(); i++) {
//			
//			if (i == charArr.size() - 1) { // If this is the last index of the first loop
//				shouldStop = true; // Set the flag to true
//			}			
//			if (!shouldStop) {
//				for (int j=count; j<charArr.size(); j++) {
//					if(charArr.get(i)==charArr.get(j)) {
//						System.out.println("Given string as duplicates and duplicate characters are: "+charArr.get(i));
//					}
//				}
//				count++;
//			}
//			
//		}

//		String str = "Prateek";
//		StringBuilder sb = new StringBuilder(str);
//		int i, j;
//		boolean status = false;

//		// Reversing a String using inbuilt function
//		System.out.println("Reversing a String using inbuilt function");
//		System.out.println(sb.reverse());
//		System.out.println();
//
//		// Reversing a String using without using inbuilt function
//		System.out.println("//////////////////////////////////////");
//		System.out.println("Reversing a String without using inbuilt function");
//		System.out.println("Length of the given String is: " + str.length());
//
//		for (i = str.length() - 1; i >= 0; i--) {
//			System.out.print(str.charAt(i));
//		}
//		System.out.println();
//
//		// check weather a string as duplicates or not
//		System.out.println();
//		System.out.println("//////////////////////////////////////");
//		System.out.println("check weather a string as duplicates or not");
//
//		for (i = 0; i < sb.length() - 1; i++) {
//			for (j = i + 1; j < sb.length(); j++) {
//				if (sb.charAt(i) == sb.charAt(j)) {
//					status = true;
//					System.out.println("String has duplicates");
//					break;
//				}
//			}
//			if (status) {
//				break;
//			}
//
//		}
//		if (!status) {
//			System.out.println("String has no duplicates");
//		}

//		// check weather a string as duplicates or not and print the index values
//		System.out.println();
//		System.out.println("//////////////////////////////////////");
//		System.out.println("check weather a string as duplicates or not and print the index values");
//
//		String myString = "Basanthi";
//		String lowerMyString = myString.toLowerCase();
//		System.out.println(lowerMyString + " " + "length of myString is: " + lowerMyString.length());
//
//		for (i = 0; i <= lowerMyString.length() - 1; i++) {
//			for (j = i + 1; j < lowerMyString.length(); j++) {
//
//				if (lowerMyString.charAt(i) == lowerMyString.charAt(j)) {
//					status = true;
//					System.out.println("String has dublicates char " + lowerMyString.charAt(i) + " " + "and" + " "
//							+ lowerMyString.charAt(j));
//					break;
//				}
//			}
//			if (status) {
//				System.out.println(i + " " + j);
//				break;
//			}
//		}
//		
//
//		if (!status) {
//			System.out.println("String has no duplicates elements");
//		}
//
		
		
//		System.out.println("Program to count repating number of characters");
//		String str = "Prateek Marchappanavar";
//		String strToLower = str.toLowerCase();
//		//int count=0;
//		
//		System.out.println(strToLower +"  :Length is: "+strToLower.length());		
//		StringBuilder sb = new StringBuilder(strToLower);
//		
//		for(int i=0; i<=sb.length()-1; i++) {
//			int count=1;
//			for(int j=i+1; j<sb.length(); j++) {
//				if(sb.charAt(i)==sb.charAt(j)) {
//					count++;
//					
//				}
//			}
//			System.out.println(sb.charAt(i)+" Repating count: "+count);
//		}
//		
		
		String str = "Prateek Marchappanavar";		
		StringBuilder sb = new StringBuilder(str);
		
		
		System.out.println(sb.length());
		
		for(int i=0; i<sb.length()-1; i++) {
			int count = 1;
			for(int j=i+1; j<sb.length(); j++) {
				if(sb.charAt(i) == sb.charAt(j)) {
					count++;
				}
			}

			System.out.println("Char: "+sb.charAt(i)+" "+"Present: "+count);	
		}
	}
}
