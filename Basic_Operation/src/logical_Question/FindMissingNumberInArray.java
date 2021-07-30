package logical_Question;

class FindMissingNumberInArray
{
public static void main(String[] args)
{

int[] a={1,2,3,4,5,6,8};
int exp_sum=a.length +1;
int total_sum=0;
int exp_total_sum=(exp_sum *(exp_sum+1))/2;


	for(int no:a)
	{
		total_sum=total_sum+no;
	}
	int missingNubmr=exp_total_sum-total_sum;
System.out.println("Missing number in given array is "+missingNubmr);

}

}