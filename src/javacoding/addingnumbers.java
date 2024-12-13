package javacoding;

public class addingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5678;
		int sum = 0, pp=0, kk=0, sum1=0;
		
		System.out.println(5678);
		while (num!=0) {
			pp=num%10;
			sum=sum+pp;
			num = num/10;
		}
		
		System.out.println(sum);
		
		if(sum>0 && sum <9) {
			System.out.println(sum);
		}else {
			while(sum!=0) {
				kk=sum%10;
				sum1=sum1+kk;
				sum = sum/10;
			}
		}
		System.out.println(sum1);
	}

}
