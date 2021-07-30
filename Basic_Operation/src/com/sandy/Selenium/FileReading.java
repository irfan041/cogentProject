package com.sandy.Selenium;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/programs/pradhan.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line;
		int lineCount=0,wordCount=0;
		while ((line=reader.readLine())!= null) {
			lineCount++;
			String[] words=line.split(" ");
			wordCount+=words.length;
		}
		System.out.println("Number of Lines:"+lineCount+","+"Number of words:"+wordCount);
	}

}
