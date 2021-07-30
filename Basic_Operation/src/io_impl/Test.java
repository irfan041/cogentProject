/*
 * package io_impl;
 * 
 * import java.io.FileInputStream; import java.io.FileOutputStream; import
 * java.io.IOException; import java.io.ObjectInputStream; import
 * java.io.ObjectOutputStream; import java.io.Serializable;
 * 
 * class Demo implements Serializable { public int a; public String b;
 * 
 * // Default constructor public Demo(int a, String b) { this.a = a; this.b = b;
 * }
 * 
 * }
 * 
 * public class Test {
 * 
 * public static void main(String[] args) { Demo object = new Demo(2,
 * "welcome"); String filename = "file.ser";
 * 
 * // Serialization try { // Saving of object in a file FileOutputStream file =
 * new FileOutputStream(filename); ObjectOutputStream out = new
 * ObjectOutputStream(file);
 * 
 * // Method for serialization of object out.writeObject(object);
 * 
 * out.close(); file.close();
 * 
 * System.out.println("Object has been serialized");
 * 
 * }
 * 
 * 
 * 
 * catch (IOException ex) { System.out.println("IOException is caught"); }
 * 
 * }
 * 
 * }
 */