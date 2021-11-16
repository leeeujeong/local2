package ex09_byte_BufferedIntputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("byte2.txt"))){
			
			byte[] b = new byte[5];
			int readCount = 0;
			
			while((readCount =bis.read(b))!= -1) {
				System.out.print(new String(b, 0,readCount));
			}
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
