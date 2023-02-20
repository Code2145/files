package com.green;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest04 {

	public static void main(String[] args) throws IOException {

		
		File file=new File("test02.txt");
		
		
		FileReader fr=new FileReader(file);
		
		long start=System.nanoTime();
		int data;
		while((data=fr.read()) != -1)
			System.out.print((char)data);
		long end=System.nanoTime();
		System.out.println(end-start);
		
		fr.close();
		
		
	
	}

}
