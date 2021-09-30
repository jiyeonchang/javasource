package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx4 {

	public static void main(String[] args) {

		FileInputStream fis =null;
		FileOutputStream fos =null;
		try {
			fis= new FileInputStream(new File("c:\\temp\\rolling.mp3"));
			fos = new FileOutputStream("c:\\temp\\rolling_copy.mp3");
			byte[] datas =new byte[10000];
			while(fis.read(datas)!=-1) {
				fos.write(datas);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
