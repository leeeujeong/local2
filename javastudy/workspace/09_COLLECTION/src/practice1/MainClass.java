package practice1;

import java.util.ArrayList;
import java.util.List;
public class MainClass {

	public static void main(String[] args) {
		
		
		List<Member> members = new ArrayList<Member>();
		
		members.add(new Member("1","1324"));
		members.add(new Member("1","1324"));
		members.add(new Member("1","1324"));
		members.add(new Member("1","1324"));
		
		System.out.println(members);

		for(Member meme:members) {
			System.out.println(meme);
		}
	}

}
