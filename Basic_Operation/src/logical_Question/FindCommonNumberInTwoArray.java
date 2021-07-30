package logical_Question;

import java.util.*;
class FindCommonNumberInTwoArray
{
public static void main(String[] args)
{

int[] a={1,2,23,5};
int[] b={5,23,8,0,12,34,6,1,3,2};

		Set<Integer>hs=new HashSet<>();

			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					if(a[i]==b[j])
					{
						hs.add(a[i]);
					}
				}
			}

System.out.println("Common Element between two array is ");
for(int no:hs)
{
System.out.println(no +" ,");

}

}


}