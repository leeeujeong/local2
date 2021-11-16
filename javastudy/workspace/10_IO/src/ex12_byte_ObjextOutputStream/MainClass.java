package ex12_byte_ObjextOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("memeber.dat"))){
			//객체 하나 보내기
			Member member1 = new Member("user1", "1111");
			oos.writeObject(member1);
			//객체 모아서 보내기
			Member member2 = new Member("user2", "1112");
			Member member3 = new Member("user3", "1113");
			Member member4 = new Member("user4", "1114");
			
			List<Member> members = Arrays.asList(member2,member3,member4);
			oos.writeObject(members);
			
			System.out.println("파일 생성완료");
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
