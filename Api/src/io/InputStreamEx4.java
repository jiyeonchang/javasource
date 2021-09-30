package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {

	public static void main(String[] args) {

		InputStream in = System.in;
		OutputStream out =System.out;
		
		byte [] datas = new byte[100];
		
		//사용자로부터 데이터를 이름과 하고싶은 말을 입력받은 후에 
		//String 객체로 변환 
		
		System.out.print("이름 : ");
		try {
			int nameBytes = in.read(datas);//홍길동 엔터 치면 엔터값까지 같이 들어감 
			String name = new  String(datas, 0, nameBytes-2);//-2는 엔터값 뺌 
			//Enter : carriage return => 13번 , line feed : 10 번 //두개의 바이트로 연결되어있기 때문에 -2함 
			//예외발생하는 코드 집어넣음 
			System.out.println("하고 싶은 말 :");
			int commentsByte = in.read(datas);
			String comment = new String(datas, 0, commentsByte-2);
			
			System.out.println("입력한 이름 "+ name);
			System.out.println("입력한 하고 싶은 말 "+ comment);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				in.close();
				out.close();
			} catch ( Exception e2) {

			  e2.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
