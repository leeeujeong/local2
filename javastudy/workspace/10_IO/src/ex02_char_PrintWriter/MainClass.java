package ex02_char_PrintWriter;

import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {

	public static void main(String[] args) {
		
		PrintWriter out = null;
		
		try {
			out = new PrintWriter("sample.html");
			
			out.println("<script>");
			out.println("alert('hello java')");
			out.println("</script>");
		
			System.out.println("sample.html 파일이 생성되었다");
		}catch (IOException e) {
			e.printStackTrace(); 
		}finally {
			try {
				if(out !=null) {
					out.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
