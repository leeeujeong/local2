package ex1_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
	
	public static void method1() {
	URL url1 = null;
	URL url2 = null;
	
	try {
		url1 = new URL("http://www.naver.com?query=날씨&page=3");
		System.out.println("host"+ url1.getHost());
		System.out.println("query"+url1.getQuery());
		System.out.println("프로토콜"+url1.getProtocol());
		
		url2 = new URL("http://www,naver.com/news/webnews/html");
		System.out.println(url2.getFile());
	}catch (MalformedURLException e) {
		e.printStackTrace();
	}


}

	
	public static void method2() {
		URL url = null;
		URLConnection con = null;
		try {
			url = new URL("http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108\"");
			con = url.openConnection();
			
			System.out.println("타입"+con.getContentType());
			System.out.println(con.getContent());
			System.out.println(con.getContentLength());
			System.out.println(con.getContentEncoding());
			System.out.println(con.getURL());
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public static void method3() {
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			url = new URL("http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108");
			con = (HttpURLConnection)url.openConnection();
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String line = null;
			while(true) {
				line = br.readLine();
				if(line ==null) {
					break;
				}bw.write(line+"\n");
				
			}
			
			br.close();
		}catch (Exception e) {
			// TODO: handle exception
//		}finally {
//			try {
//			if(br!=null)br.close();
//			if(bw!=null)bw.close();
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		}
	}
	
	public static void main(String[] args) {
		
		method3();

}
}