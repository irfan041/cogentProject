package logical_Question;

// Java program to find the number of charters 
// in the longest word in the sentence. 
class LongestLenghtOfGivenString{ 
	
	static int LongestWordLength(String str) 
	{ 
		String[] words = str.split(" "); 
		int length = 0; 
     String ref="";
		
		for(String word:words){ 
			if(length < word.length()){ 
				length = word.length(); 
                ref=word;
			} 
		} 
 
              System.out.println("Longest word of given string is "+ref + " and lenght is "+ length);



		return length; 

 

	} 
	
	// Driver code 
	public static void main(String args[]) 
	{ 
		String str = "My name is Hanamanta katti"; 
		
		LongestWordLength(str); 
			


  	}		
	 
} 
