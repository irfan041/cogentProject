package logical_Question;

class StringSelectionExample{

public static void main (String[] args){

 String[] a={"Katti","Jay","Balue","Saidu","Suresh"};
String temp="";
 int min;
                   for(int i=0;i<a.length;i++)
                   {
                     min=i;
                           for(int j=i+1;j<a.length;j++)
                             {
                                 if(a[min].compareTo(a[j])>0)
                                  {
                                   min=j;
                                  }
                             }

                      temp=a[i];
                      a[i]=a[min];
                      a[min]=temp;
                    }
    
for(String i:a)
{
System.out.print(i+" ");
}

}


}