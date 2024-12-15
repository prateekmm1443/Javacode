package javacoding;

import java.util.Arrays;

public class greatestOFTwoNumberInAnArray {
	
public static void main(String[] args) {
		
		int[] numArr = {4,2}; //10,20,30,90,300,50,60,100,200
		
		System.out.println("With using sorting technique");
		int firstLargest=numArr.length-1, secondLargest=numArr.length-2;		
		
		System.out.println(firstLargest);
		System.out.println(secondLargest);	
		
		Arrays.sort(numArr);
		for(int ele : numArr) {
			System.out.print(ele+" ");
		}
		
		System.out.println();
		System.out.println("First Largest element: "+numArr[firstLargest]);
		System.out.println("Second Largest element: "+numArr[secondLargest]);
		
		System.out.println();
		
		System.out.println("Without using sorting technique");		
		
		int greatest=Integer.MIN_VALUE, secondgreatest=Integer.MIN_VALUE;
		
		for(int num : numArr) {
			if(num > greatest) {
				secondgreatest = greatest;
				greatest = num;
			}
		}
		
		System.out.println("First Largest element: "+greatest);
		System.out.println("Second Largest element: "+secondgreatest);
		
	}

}
