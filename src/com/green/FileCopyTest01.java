package com.green;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest01 {

	public static void main(String[] args) throws IOException{
		
		
		File file=new File("img_test.jpg");
		FileInputStream fis=new FileInputStream(file);
		File copy=new File("img_test_copy.jpg");
		FileOutputStream fos=new FileOutputStream(copy);
		
		long start=System.nanoTime();
		int data;
		while((data=fis.read()) != -1){
			fos.write(data);
		}
		long end=System.nanoTime();	
		
		System.out.println((end-start)/(double)100000000);
		
		fos.close();
		fis.close();
		System.out.println("파일복사 완료");
		
	}

}
