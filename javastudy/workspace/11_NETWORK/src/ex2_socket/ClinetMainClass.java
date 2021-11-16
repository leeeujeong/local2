package ex2_socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClinetMainClass {

	public static void main(String[] args) {
		
		Socket client = null;
		
		try {
			client = new Socket();
			
			client.connect(new InetSocketAddress("localhost", 9090));
			
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			char[] cbuf = new char[500];
			int readCount = br.read(cbuf);

			System.out.println(new String(cbuf, 0, readCount));
			
			br.close();
			client.close();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
