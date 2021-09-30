package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
//문자 변환 보조 스트림
//바이트 기반 스트림 => Reader or Writer 로 변환해서 사용 
//인코딩 방식 지정 가능 하기 때문에 한글이 깨지거나 하는걸 방지할 수 있다 (utf-8,ms949,euc-kr,ascii....)

	public static void main(String[] args) {

		// 메모장 저장 방식이 utf-8로 되어 있어서 파일에 쓸 때 형식을 맞춰줘야 해요
		// 그리고 지금 기존의 파일들은 화면상으로 읽어오면 깨지는 상황이 맞아요...인코딩이 안 맞았기 때문에
		// 지금같은 상황들 때문에 InputStreamReader 가 나온거고
		// 이클립스 워크 스페이스 인코딩도 utf-8로 맞춰내면 한글이 안 깨지는데
		// 지금 이클립스 워크 스페이스 인코딩을 바꾸면 이때까지 작업했던 주석 달아놨던 한글이 모두 깨져요
		// 그래서 나중에 다음 과목 할 때 워크 스페이스 변경하면서 한글 인코딩 방식 바꿀거에요...

		try (InputStreamReader reader = new InputStreamReader(new FileInputStream("c:\\temp\\file2.txt"), "utf8");
				FileWriter writer = new FileWriter("c:\\temp\\test3.txt")) {

			char cbuf[] = new char[100];
			while (reader.read(cbuf) != -1) {
				writer.write(cbuf);
				System.out.println(cbuf); // InputStreamReader 로 읽어와야 화면 출력을 걸었을 때도 안 깨진다(지금설정때문?)
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
