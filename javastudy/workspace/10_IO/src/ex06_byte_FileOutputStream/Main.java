package ex06_byte_FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try (FileOutputStream fos = new FileOutputStream("byte1.txt")){
			String str1 ="Hello.Nice to meet you";
			String str2 = "안녕 만나서 만가워.";
			
			fos.write(str1.getBytes()); 
			fos.write('\n');
			fos.write(str2.getBytes());
			
			System.out.println("byte 파일이 생성되었다.");
			
  		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
