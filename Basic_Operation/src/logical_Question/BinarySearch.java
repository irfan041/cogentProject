package logical_Question;


import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter search element ");
		int search = sc.nextInt();
		
		binarySearch(arr,search);
			}
	
	public static void binarySearch(int[] array,int search){
		int first = 0;
		int last=array.length-1;
		int middle = (first + last) / 2; 
		while( first <= last ){  
		      if ( array[middle] < search ){  
		        first = middle + 1;     
		      }else if ( array[middle] == search ){  
		        System.out.println("Element is found at index: " + middle);  
		        break;  
		      }else{  
		         last = middle - 1;  
		      }  
		      middle = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  

	}
	}
