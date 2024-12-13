package myPratice;


import java.util.Scanner;

public class duplicateelementsinanarray {

	public static void main(String[] args) {

		/*
		 * $ $ $ $ $ $
		 */
		System.out.println();
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("$" + " ");
			}
			System.out.println();
		}

		/*
		 * $ $ $ $ $ $ $ $ $ $
		 * 
		 */
		System.out.println();
		for (int i = 0; i <= 3; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print("$" + " ");
			}
			System.out.println();
		}

		/*
		 * 3 2 1 2 1 1
		 * 
		 */
		System.out.println();
		for (int i = 1; i <= 3; i++) {

			for (int j = 3; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 3; i >= 1; i--) {

			for (int j = i; j >= 1; j--) {

				System.out.print(j + " ");
			}
			System.out.println();

		}

		/*
		 * Pattren for (int c = 0; c <= 25; c++) { System.out.print((char) ('A' + c)); }
		 * 
		 * A B A C B A D C B A
		 * 
		 * 
		 */

		System.out.println();
		for (int i = 0; i <= 3; i++) {
			for (int j = i; j >= 0; j--) {
				System.out.print((char) ('A' + j) + " ");
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 0; i <= 3; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print((char) ('A' + j) + " ");
			}
			System.out.println();
		}

		/*
		 * * * * * * *
		 */

		System.out.println();
		int n = 3; // Number of rows

//		for (int i = 1; i <= n; i++) {
//			// Print spaces for alignment
//			for (int j = i; j < n; j++) {
//				System.out.print(" ");
//			}
//			// Print stars for the triangle
//			for (int k = 1; k <= (2 * i - 1); k++) {
//				System.out.print("*");
//			}
//			System.out.println(); // Move to the next line
//		}
		
		for(int i=1 ; i<=n; i++) {
			for(int j=i; j<n; j++) {
				System.out.print(" ");				
			}
			for(int k=1; k<=(2*i-1); k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1 ; i<=n; i++) {
			for(int j=i; j<n; j++) {
				System.out.print(" ");				
			}
			for(int k=1; k<=(2*i-1); k++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
