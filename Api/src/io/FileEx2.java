package io;

import java.io.File;

//File :파일을 다루는 클래스 

public class FileEx2 {

	public static void main(String[] args) {
File file = new File("c:\\temp\\inputStream1.java");
		
//파일이름 

String fileName = file.getName();

System.out.println("파일명 "+fileName);
int p = fileName.lastIndexOf(".");
//순수 파일명만 가져오고싶을때 
//.위치 찾기 
System.out.println("확장자 제외한 파일명 "+fileName.substring(0,p));
System.out.println("확장자  "+fileName.substring(p+1));//(+1쓴이유는).다음부터 

//경로를 포함한 파일명 
System.out.println("경로를 포함한 파일명 "+ file.getPath());
System.out.println("파일이 속해있는 폴더명 "+ file.getParent());

System.out.println("File.separator : "+ File.separator); 
System.out.println("File.pathSeparator : "+ File.pathSeparator); 


	}

}
