package ex08_byte_FileIntputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("byte1.txt")){
			
			int ch =0;
			
			while((ch=fis.read())!=-1) {
				System.out.print((char)ch);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
