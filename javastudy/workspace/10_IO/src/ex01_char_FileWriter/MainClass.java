package ex01_char_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class MainClass {

	public static void method1() {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("text1.txt");
			
			char[] cbuf = {'h','e','l','l','o'};
			String str = "java";
			int ch = '!';
			
			fw.write(cbuf);
			fw.write(str);
			fw.write(ch);
			fw.write('\n');
			fw.write(cbuf, 0, 1); //인덱스 0부터 1개만 쓴다
			fw.write( cbuf,0,cbuf.length);//전체내용쓰기
			
			System.out.println("text.txt파일이 생성되었다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw != null) {
			fw.close();					
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void method2() {
		try(FileWriter fw = new FileWriter("text2.txt")){
			
			fw.write("안녕하세요\n");
			fw.write("반갑습니다\n");
			System.out.println("txet2파일이 생성되었다");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		method2();
		
	}

}
