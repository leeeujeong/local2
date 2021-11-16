package ex2_socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMainClass {

	public static void main(String[] args) {
		
		ServerSocket server = null;
		
		try {
			
			//서버 생성
			server = new ServerSocket();
			
			//호스트 , 포트 번호
			server.bind(new InetSocketAddress("localhost", 9090));
			
			//클라이언트로 메시지를 보낼 출력스트림
			BufferedWriter bw = null;
			
			
			//서버는 항상 켜져있다.
			while(true) {
				Socket client =server.accept(); //클라이언트 접속허용
				
				//클라이언트에게 웰컴메세지
				String message ="Welcome to Server!";
				bw = new BufferedWriter( new OutputStreamWriter(client.getOutputStream()));
				bw.write(message);
				bw.flush();
			}

		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
			if(!server.isClosed()) {
				server.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	  }
	}
}
