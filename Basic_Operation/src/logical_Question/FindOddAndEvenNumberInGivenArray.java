package logical_Question;

import java.util.*;
class FindOddAndEvenNumberInGivenArray
{
public static void main(String[] args)
{
int[] a={1,4,2,5,6,7};
List<Integer>even=new ArrayList<>();
List<Integer>odd=new ArrayList<>();
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			even.add(a[i]);
		}
		else
		{
			odd.add(a[i]);
		}
		
	}
	int sumEven=0;
	System.out.println("Following elements are Even number in given Array");
	for(Integer i:even)
	{
		sumEven=sumEven+i;
		
		System.out.println(i);
	
	}
	System.out.println("Sum of Even number is "+sumEven);

	System.out.println("-----------------------------------------------");
int sumOdd=0;
	System.out.println("Following elements are ODD number in given Array");
	for(Integer i:odd)
	{
		sumOdd=sumOdd+i;
		System.out.println(i);
	
	}
	
System.out.println("Sum of Odd number is "+sumOdd);




}

}