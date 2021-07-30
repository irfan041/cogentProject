package stackoverflow;

import java.sql.SQLException;

public class ExceptionDemo {

	public static void main(String[] args) {
		number(5);
	}

	public static void number(int n) {
		System.out.print("int" + n);
	}

	public static void number(String n) {
		System.out.print("String" + n);
	}

	public static void number(Integer n) {
		System.out.print("Integer" + n);
	}

	public static void number(long n) {
		System.out.print("Long" + n);
	}
}
