package myPratice;


public class reversingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0, num = 5678, reverse = 0;
//		
//		while(num!=0) {
//			
//			num = num/10;
//			System.out.println(num);
//			count++;
//		}
//		System.out.println("Number of digits in a given number is: "+count);
		
		if(num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		System.out.println(46/2);
		
		while(num!=0) {
			reverse = reverse * 10;
			reverse = reverse + num%10;
			num = num/10;
		}
		System.out.println("Reversed number is: "+reverse);
	}

	

}
