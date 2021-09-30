package io;

import java.io.File;

//File :파일을 다루는 클래스 
//폴더 (디렉토리):/,\ 운영체제 마다 다름 
// 역슬래시는 \t(이스케이프문자로 인식할수있으니 \\두개 붙인다)

public class FileEx1 {

	public static void main(String[] args) {
File file = new File("c:\\temp\\test1.txt");
File file2 = new File("c:\\temp","test1.txt");

File file3 = new File("c:\\temp");
File file4 = new File(file3,"test1.txt");

	//같은작업임 	File file4 = new File(new File("c:\\temp"),"test1.txt");

		
	}

}
