package logical_Question;


class CountRepeatedNumberInGivenArray
{
public static void main(String[] args)
{
//creating a new array
int[] a={5,3,5,2,5,2,5,2,6,7};

// creating same array length of empty array
int[] fr=new int[a.length];
		int rev=-1;
                
		for(int i=0;i<a.length;i++)
		{
                  int count=1;
                   for(int j=i+1;j<a.length;j++)
		   {	
				
                        //compare the current element with next elemen;
                      		if(a[i]==a[j])
				{
					count++;
					//to avoid same elemenet
					fr[j]=rev;
				}
		   }
					if(fr[i] != rev)
					{
						fr[i]=count;;
					}
		}

				System.out.println("Originam | Frequency");
			for(int i=0;i<a.length;i++)
			{
				if(fr[i] != rev )
				{
					System.out.println(a[i] +"       "+ fr[i]);
					System.out.println();
					
			        }
			}
}

}