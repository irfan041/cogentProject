package object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeData {

	public static void main(String[] args) {
		Emp object = null;  
		String filename = "shubham.txt";
		  
	        // Deserialization 
	        try { 
	  
	            // Reading the object from a file 
	            FileInputStream file = new FileInputStream 
	                                         (filename); 
	            ObjectInputStream in = new ObjectInputStream 
	                                         (file); 
	  
	            // Method for deserialization of object 
	            object = (Emp)in.readObject(); 
	            in.close(); 
	            file.close(); 
	            System.out.println("Object has been deserialized\n"
	                                + "Data after Deserialization."); 
	            SerialExample.printdata(object); 
	  
	            // System.out.println("z = " + object1.z); 
	        } 
	  
	        catch (IOException ex) { 
	            System.out.println("IOException is caught"+ex.getMessage()); 
	        } 
	  
	        catch (ClassNotFoundException ex) { 
	            System.out.println("ClassNotFoundException" + 
	                                " is caught"); 
	        } 

	}

}
