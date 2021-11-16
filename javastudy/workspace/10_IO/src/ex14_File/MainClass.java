package ex14_File;

import java.io.File;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class MainClass {

	public static void method1() {
		//File(String pathname) : 전체 경로 작성
		File file1 = new File("C:\\Smartweb0825\\javastudy\\workspace\\10_IO\\text1.txt");
		File file2 = new File("C:"+ File.separator+"Smartweb0825"+File.separator+"javastudy"+File.separator+ "workspace"+File.separator+"10_IO"+File.separator+"text2.txt");
		 System.out.println("파일명: " +file1.getName());
		 System.out.println("저장된 디렉토리: " +file1.getParent());
		 System.out.println("전체 경로 : " +file1.getPath());
		 System.out.println("수정한 날짜 : " +file1.lastModified()); 
		 System.out.println("존재하는가? :"+file1.exists());
		 System.out.println("파일인가 ? : "+ file1.isFile());
		 System.out.println("디렉터리인가? : "+file1.isDirectory());
		 
		 //경로, 파일 분리작성
		 //File(File parent(dir), String child(filename))
		 //File(String dir, String filename)
		 
		File dir = new File( "C:\\Smartweb0825\\javastudy\\workspace\\10_IO");
		File file3 = new File(dir,"text3.txt");
		
		File file4 = new File("C:\\\\Smartweb0825\\\\javastudy\\\\workspace\\\\10_IO\\\\text1.txt","text4.txt");
	}
	
	
	public static void method2() {
		//디렉토리 조작
		File dir = new File("C:"+File.separator+"MyDir");
		if(dir.exists()==false) { //존재하지 않으면,
			dir.mkdirs(); //디렉토리 만드는것
			System.out.println("C:\\MyDir생성완료");
		}
		
		if(dir.exists()) {
			dir.delete();
			System.out.println("삭제완료");
		}
	}
	
	
	public static void method3() {
		
		File javaHome = new File("C:\\Program Files\\jdk1.8.0_202");
		File[] files = javaHome.listFiles(); //전체 파일 경로를 가져옴
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd- a hh:mm");
		
		for(File file : files) {
			String date = sdf.format(new Date(file.lastModified()));
			String info = null;
			if(file.isDirectory()) { //디렉토리이면,
				info = "<DIR>";
			}else if(file.isFile()) {
				info = new DecimalFormat("#,##0").format(file.length()); //파일의 바이트 크기
			}
			String name = file.getName();
			System.out.println(date+"\t"+info+"\t"+name);
		}
	}
	
	public static void main(String[] args) {
		method3();

	}

}
