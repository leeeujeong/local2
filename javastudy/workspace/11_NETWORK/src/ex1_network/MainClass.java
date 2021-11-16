package ex1_network;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Connection;

public class MainClass {

	public static void method1(){
		
		URL url1 = null;
		URL url2 = null;
		
		try {
			
			url1 = new URL("http://www.naver.com?query=날씨&page=3");
			System.out.println("호스트"+ url1.getHost());
			System.out.println("뭐리:"+url1.getQuery());
			System.out.println("프로토콜"+url1.getProtocol());
			
			url2 = new URL("http://www.naver.com/news/webew.html");
			System.out.println("파일 : "+ url2.getFile());
			
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public static void method2() {
		
		URL url = null;
		URLConnection con = null;
		
		try{
			url = new URL("http://www.naver.con");
			con = url.openConnection();
			
			System.out.println("콘텐츠 타입 : "+ con.getContentType());
			System.out.println("콘텐트 : "+ con.getContent());
			System.out.println("콘텐트 길이 : "+con.getContentLength());
			System.out.println("콘텐트 인코딩: "+con.getContentEncoding());
			System.out.println("URL"+con.getURL());
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally {

		}
	}
	
	public static void method3() {
		
		BufferedWriter bw= null;
		HttpURLConnection con = null;
		URL url = null;
		BufferedReader br= null;

		try {
		url =new URL("https://www.naver.com");
		con = (HttpURLConnection)url.openConnection();
		br = new BufferedReader(new InputStreamReader(con.getInputStream()));

		bw = new BufferedWriter(new FileWriter(("weather.xml")));
		
//		StringBuilder sb = new StringBuilder();
		String line = null;
		
		while(true) {
			line = br.readLine();
			if(line == null) {
				break;
			}bw.write(line+"\n");
		}
		
//			sb.append(line+"\n");
		
		System.out.println("wqather.xmlㅠㅏ일 생성 완료");
		
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}finally {
			try {
			if(br!=null) br.close();
			if(con != null)con.disconnect();
		}catch (Exception e) {
			e.printStackTrace();
		}
			}
		
				
		
				
	}


	public static void method4() {
		
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader br= null;
		try {
			
			url = new URL("https://www.daum.net");
			con = (HttpURLConnection)url.openConnection();
			br = new BufferedReader(new InputStreamReader(con.getInputStream())); //문자기반으로 변경해서 
			
			String line = null;
			while((line = br.readLine())!= null) {
				if(line.contains("link_favorsch @")) {
					//System.out.println(line);
					System.out.println(line.split(">")[1].split("<")[0]);
				}
			}
			br.close();
			con.disconnect();
			
			
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void method5() {
		
		String a = "안녕 자바 nice to meet you";
		String b = "안녕+자바+nice+to+meet+you";
		
		try {
		//인코딩 암호화
		String encodedA = URLEncoder.encode(a, "UTF-8");
		String encodedB = URLEncoder.encode(b, "UTF-8");
		System.out.println(encodedA);
		System.out.println(encodedB);
		
		
		//디코딩 복호화
		String decodedA = URLDecoder.decode(encodedA,"UTF-8");
		String decodedB = URLDecoder.decode(encodedB,"UTF-8");
		
		System.out.println(decodedA);
		System.out.println(decodedB);
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		method5();

	}

}
