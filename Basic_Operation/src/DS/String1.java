package DS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String1 {

	public static void main(String[] args) {
		String str = "$sampl$Stringhghdkghdkgh";
	      /*int i = 0;
	      for(char c: str.toCharArray()) {
	         i++;
	      }
	      System.out.println("Length of the given string ::"+i);*/
	      Matcher m = Pattern.compile("$").matcher(str);
	      m.find();
	      int length = m.end();
		System.out.println("Length of the given string ::"+length);
		/*int length=str.lastIndexOf("");
	      System.out.println("Length of the given string ::"+length);*/
	}

}
