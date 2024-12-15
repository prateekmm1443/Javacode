package javacoding;

import java.util.ArrayList;

public class reverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num  = 5678, rev=0;
		ArrayList<Integer> arrlis = new ArrayList<>();
		
		
		System.out.println(num);
		
		while(num != 0) {
			rev = num%10;
			arrlis.add(rev);
			num = num/10;
		}
		
		
		for(int ele : arrlis) {
			System.out.print(ele);
		}

	}

}
