package javacoding;

import java.util.HashSet;

public class removeDupFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean status = false;

		int[] intArr = new int[6];
		// Insert values into the array
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		intArr[3] = 1;
		intArr[4] = 10;

		System.out.println("Array of type int with duplicates");
		for (int a : intArr) {
			System.out.print(a + " ");
		}
		
		HashSet<Integer> hsset = new HashSet<>();
		for(int i = 0; i<=intArr.length-1; i++) {
			hsset.add(intArr[i]);
		}
		
		System.out.println();
		
		for(int elee: hsset) {
			System.out.print(elee+" ");
		}
		
		System.out.println();
		
		
		

		System.out.println("*******************************************************");
		
		

		Integer[] numbers = new Integer[5];
		// Insert values into the array
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 10;
		numbers[4] = 50;

		System.out.println("Array of type Integer with duplicates");
		for (Integer a : numbers) {
			System.out.print(a + " ");
		}

		System.out.println();
		for (int i = 0; i <= numbers.length - 1; i++) {

			for (int j = i + 1; j <= numbers.length - 1; j++) {
				if (numbers[i] == numbers[j]) {
					status = true;
					numbers[j] = null;
				}
			}
		}

		if (status) {
			System.out.println("Array as duplicates");
		} else {
			System.out.println("Array as no duplicates");
		}

		System.out.println("Array of type Integer without duplicates");
		for (Integer a : numbers) {
			if (a == null) {
				System.out.print("    ");

			} else {
				System.out.print(a + " ");
			}
		}

	}

}
