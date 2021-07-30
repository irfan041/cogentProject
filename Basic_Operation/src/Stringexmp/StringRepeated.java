package Stringexmp;

public class StringRepeated {

	public static void main(String[] args) {
		String []str={"shaik Subhani","shaik","saik","saik","shuyaik hagjdgj"};
		String x="shaik";
		for(int i=0;i<str.length;i++){
			
			if(str[i].contains(x)){
				System.out.println(str[i]);
			}
		}

	}

}
