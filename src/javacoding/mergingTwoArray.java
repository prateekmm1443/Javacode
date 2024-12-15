package javacoding;

import java.util.ArrayList;

public class mergingTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Using Array");
		int[] arr1 = { 10, 20, 30, 40 };
		int[] arr2 = { 30, 40, 50, 60 };

		int[] mergedarr = new int[arr1.length + arr2.length];

		for (int j = 0; j <= arr1.length - 1; j++) {
			mergedarr[j] = arr1[j];

		}

		for (int j = 0; j <= arr1.length - 1; j++) {
			mergedarr[arr1.length + j] = arr1[j];

		}

		for (int ele1 : mergedarr) {
			System.out.print(ele1 + " ");
		}

		System.out.println();
		System.out.println("Using Arraylist");
		ArrayList<Integer> intArr = new ArrayList<>();

		for (int i = 0; i <= arr1.length - 1; i++) {
			intArr.add(arr1[i]);
		}

		for (int j = 0; j <= arr2.length - 1; j++) {
			intArr.add(arr2[j]);
		}

		for (int ele : intArr) {
			System.out.print(ele + " ");
		}

	}

}
