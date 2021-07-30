package logical_Question;

class KthLargestNumber
{
public static void main(String[] args)
{

int[] a={12,4,6,7,32,6,8,37};
int k=4;

             for(int i=0;i<a.length;i++)
         	{
 			for(int j=i+1;j<a.length;j++)
			  {
				if(a[i]<a[j])
				 {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				 }
			  }
		
			if(i==k-1)
			 {
				System.out.println(k+" largest number in given array  is "+a[i]);
				break;
			 }
                }
				System.out.println("----------------------------------");
			for(int i:a)
			  {
				System.out.print(i+" ");
			  }
}

}