package com.green;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest03 {
	//예외를 나중으로 미루는 작업 throws
	public static void main(String[] args) throws IOException {

		
		File file=new File("test02.txt");
		
		FileWriter fw=null;
		fw=new FileWriter(file,true);//추가모드
		fw.write("안녕하세요\n");
		fw.write("파일에 데이터를 저장하고 있습니다.\n");
		fw.write("입력값을 바꾸고 넣었어요\n");
		fw.close();
		System.out.println("저장완료");
		
	}

}
