package practice3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass {

	public static void main(String[] args) {
		
	//원본 
		File src = new File("C:\\Smartweb0825\\installer\\eclipse-jee-2020-06-R-win32-x86_64.zip");
		
	//복사본
		File dir = new File("C:\\MyDir");
		if(dir.exists()==false) {
			dir.mkdirs();
			System.out.println("My Dir 생성");
		}
		File cpy = new File(dir,src.getName());
	//원본 읽을 스트림
		BufferedInputStream bis = null;		
	
	//복사본 만들 스트림
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(src));
			bos = new BufferedOutputStream(new FileOutputStream(cpy));
			
	//복사 이동 전 시간 측정
			
			long start = System.currentTimeMillis();
	//원본 ->복사본
	//1.복사
			byte[]b = new byte[1024]; //1KB준비
			int readCount =0;
			
			while((readCount =bis.read(b))!=-1) {
				bos.write(b,0,readCount);
			}
			System.out.println("복사");
			
	//2.원본 삭제
			if(src.exists()) {
//				src.delete();
				src.deleteOnExit();
				System.out.println("삭제");
			}
			
	//이동후 시간 측정
			long end = System.currentTimeMillis();
	//성공 메세지
			System.out.println(cpy.getPath()+"이동완료");
	//시간출력
			System.out.println("이동시간 :"+(end - start)*0.001+"초");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis != null)bis.close();
				if(bos != null)bos.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
			}
	
	}
	

}
