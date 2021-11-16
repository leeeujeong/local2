package practice2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		
		BufferedInputStream fis = null;
		BufferedOutputStream fos = null;
		
		try {
			fos = new BufferedOutputStream(new FileOutputStream("byte3.mp4"));
			fis = new BufferedInputStream(new FileInputStream("river.mp4"));
			
			byte[]b = new byte[1024];
			int readCount =0;
			
			while((readCount =fis.read(b))!=-1) {
				fos.write(b,0,readCount);
			}
			System.out.println("복사");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null)fis.close();
				if(fos != null)fos.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
