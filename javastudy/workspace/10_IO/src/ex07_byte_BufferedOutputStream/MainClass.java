package ex07_byte_BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("byte2.txt"))){
			
			String str1 = "안녕하세요 방가방가";
			byte[]b = str1.getBytes();
			bos.write(b);
			
			System.out.println();
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
