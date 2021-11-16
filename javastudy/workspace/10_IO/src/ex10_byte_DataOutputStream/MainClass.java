package ex10_byte_DataOutputStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("byte4.dat"))){
			
			int age = 27;
			double height = 167.5;
			String name = "이유정";
			
			dos.writeInt(age);
			dos.writeDouble(height);
			dos.writeUTF(name);
			
			System.out.println("파일 생성");
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
