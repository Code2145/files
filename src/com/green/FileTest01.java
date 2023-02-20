package com.green;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest01 {

	public static void main(String[] args) {

		//file 출력
		File file=new File("test.txt");//현재프로젝트 폴더의 파일
		
		//파일과 연결:Stream
		//바이트Stream(바이너리파일), 문자Stream(텍스트파일): Reader 와 Writer
		
		//예외가 발생할수 있는 구간
		FileWriter fw=null;
		try {
			fw=new FileWriter(file);
			//출력스트림인경우 파일이 존재하지 않으면
			//만들어서 연결
			fw.write('A');
			fw.write('B');
			fw.write('C');
			fw.write("문자열 출력");
			
		} catch (IOException e) {
			//e.printStackTrace();
			//try구간 실행중 Exception가 발생하면
			System.out.println("파일이 존재하지 않습니다. 확인해주세요!");
		}finally {
			try {if(fw!=null)fw.close();} catch (IOException e) {}
		}
		
		
		System.out.println("종료");
		
	}

}
