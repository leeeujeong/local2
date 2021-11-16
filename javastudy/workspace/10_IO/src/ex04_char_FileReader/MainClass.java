package ex04_char_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {

	public static void method1() {
		try(FileReader fr = new FileReader("text1.txt")){
			//int 단위로 읽기
			
			while(true) {
				int ch = fr.read(); 
				if(ch ==-1) {
					System.out.println("\n파일을 모두 읽었습니다.");
					break;
				}
				System.out.print((char)ch); //ch는 코드값으로 저장되므로 char로 캐스팅
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void method2() {
		
		try(FileReader fr = new FileReader("text2.txt")){
			
			char[] cbuf = new char[5];
			while(true) {
				
				int readCount = fr.read(cbuf); //읽은 내용은 cbuf에 저장되고 실제로 읽은 글자수는 readCount에 반환
											   //파일이 끝나면 readCount는 -1이다.
				
				
				if(readCount ==-1) {
					System.out.println("\n 파일을 읽었습니다");
					break;
				}
				for(int i=0; i<readCount; i++) {
					System.out.print(cbuf[i]);
				}
				
			} 
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		method2();
	}

}
