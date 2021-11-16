package practice1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
				br = new BufferedReader(new FileReader("text4-1.txt"));
				
				bw = new BufferedWriter(new FileWriter("text4-2-1.txt"));
				
				char[]cbuf = new char[512];
				
				int readCount = 0;
				while((readCount = br.read(cbuf))!=-1) {
					
				bw.write(cbuf, 0, readCount);
				}
				System.out.println("복사됐다");
		}catch(FileNotFoundException e) {	
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw != null) bw.close();
				if(br != null) br.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
