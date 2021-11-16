package ex03_char_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {

	public static void method1() {
		FileWriter fw = null;
		BufferedWriter bw =null;
		
		try {
			
			fw = new FileWriter("text3.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("안녕하세요\n");
			bw.write("반가원요n");
			bw.write("안녕하세요\n");
			
			System.out.println("text3 파일 생성");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw != null) {
					bw.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void method2() {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			char[] cbuf = {
					'a','b','c','d','e','f',
					'g','h','h','i','k','l',
					'm','n','o','p','q','r',
					's','t','u','v','w','x',
					'y','z','0','1','2','3'};
			
			bw= new BufferedWriter(new FileWriter("text4-1.txt"));
			long start1 = System.currentTimeMillis();
			for (int line =1; line <=100000;line ++) {
				for(int i=0;i<1000; i++) {
					bw.write(cbuf[(int)(Math.random()*cbuf.length)]);
				}
				bw.write('\n');
			}
			
			long end2 = System.currentTimeMillis();
			System.out.println((end2-start1)*0.01+"초 소요");
			
			
			
//			fw= new FileWriter("text4-1.txt");
//			long start1 = System.currentTimeMillis();
//			for (int line =1; line <=100000;line ++) {
//				for(int i=0;i<1000; i++) {
//					fw.write(cbuf[(int)(Math.random()*cbuf.length)]);
//				}
//				fw.write('\n');
//			}
//			
//			long end1 = System.currentTimeMillis();
//			System.out.println((end1-start1)*0.001+"초 소요");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw!=null) fw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
	public static void main(String[] args) {
		
		method2();

	}

}
