package io;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderEx2 {
	/*처리할 파일이 문자라면 Reader,Writer이 편함 
	 * char형태로 처리 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		try(Reader reader = new FileReader("c:\\temp\\file1.txt")) {
			char[] cbuf = new char[100];
			int readcharNo;//실제로 가져온 문자의 수를 알려줌 
			
			while((readcharNo = reader.read(cbuf))!=-1) {
				
				String data = new String (cbuf,0,readcharNo	);
				System.out.println(data);
			}
			
		} catch (Exception e) {

		e.printStackTrace();
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
