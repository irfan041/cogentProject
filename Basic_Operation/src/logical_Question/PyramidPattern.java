package logical_Question;



public class PyramidPattern {
	public static void main(String[] args){
		pattern();

	}

 static void pattern() { 
	for (int i = 0; i < 5; i++) { 
		for (int j = 0; j < 5 - i; j++) { 
			System.out.print(" ");
			} 
		for (int k = 0; k <= i; k++) { 
			System.out.print("* "); 
			} 
		System.out.println();
		}
 }
 }
