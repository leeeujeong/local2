package ex05_char_BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("text3.txt"))){
			
			StringBuilder sb= new StringBuilder();
			char[] cbuf = new char[5];
			
			int readCount =0;
			
			while((readCount = br.read(cbuf))!= -1) {
				//읽은 파일 내용 : cbuf
				//읽은 글자수 :readCount
				//cbuf에서 readCount만큼 읽기
				
				sb.append(cbuf, 0, 3);
				//sb변수에 저장했다.
				
			}
			
			System.out.println(sb.toString());
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();	
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
