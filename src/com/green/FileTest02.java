package com.green;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest02 {

	public static void main(String[] args) {

		
		File file=new File("test.txt");
		/*
		if(!file.exists()) {//파일이 존재하지않으면
			//파일생성
			file.createNewFile();
			System.out.println("새로운파일생성");
		}
		*/
		
		System.out.println("길이:"+file.length());
		
		//입력스트림은 파일이 존재하지 않으면 FileNotFoundException 발생
		FileReader fr=null;
		try {
			fr=new FileReader(file);
			System.out.println("파일이 존재하면 실행해요");
			int data;//-1 if the end of the stream has been	:EOF
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
			
			
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("파일이 존재하지 않아요!");
		}finally {
			try {
				//NullPointerException 방지를 위해 : RuntimeException의 가장 대표적인 예외
				if(fr!=null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("파일종료시 문제발생!");
			}
		}

	System.out.println("\n프로그램 종료!");
	
	}

}
