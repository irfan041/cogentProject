package logical_Question;



import java.util.Scanner;

public class TwistedPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check Twisted Prime:");
		int number = sc.nextInt();
		int one=prime(number);
		
			int sum=0;
				while(number!=0){
					int r=number%10;
					sum=sum*10+r;
					number = number/10;
					
		}
				int two=prime(sum);
				if(one==0&&two==0)
					System.out.println("Given Number is Twisted Prime");
				else
					System.out.println("Not TwistedPrime");
	}
	
	public static int prime(int num){
		int flag=0;
		for(int i=2;i<Math.sqrt(num);i++){
			if(num%i==0){
				flag++;
				break;
			}
		}
		return flag;
	}

}
