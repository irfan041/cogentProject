
public class Main {
	// Driver Program 
    public static void main(String args[]) 
    { 
    	int a1[] = { 3, 4, 5 };
		int a2[] = myArrayElements(a1);
		System.out.println(a1[0] + a1[1] + a1[2]);
		System.out.println(a2[0] + a2[1] + a2[2]);
} 
    public static int[] myArrayElements(int a3[]) {
		a3[1] = 7;
		return a3;
	}

}
