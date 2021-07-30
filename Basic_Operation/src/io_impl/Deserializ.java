package io_impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Demo implements Serializable {
	public int a;
	public String b;

	// Default constructor
	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}
}

public class Deserializ {

	public static void main(String[] args) throws ClassNotFoundException {
		String filename = "file.ser";
		Demo object1 = null;
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			// Method for deserialization of object
			object1 = (Demo) in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		
	}

}
