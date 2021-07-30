package logical_Question;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class SpecialCharacterRemoval 
{
    public static void main(String[] a) throws IOException
    {	int i;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s=br.readLine();
       String str = s.replaceAll("[^a-zA-z]", "");
       System.out.println(str);
    }
    
   static void test(int i){
    	System.out.println(i=30);
    }
}
