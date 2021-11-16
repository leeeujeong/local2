package ex2_Set;

import java.util.*;

public class MainClass {

	public static void method1() {

		//생성
		Set<String> subjects = new HashSet<String>();
		
		//추가
		subjects.add(" 하하ㅏㅎ ");
		subjects.add("이유정");
		subjects.add("이유정");
		subjects.add("dk");
		subjects.add("dk");
		//확인
		System.out.println(subjects);
		//제거
		subjects.remove("이유정");
		
		System.out.println(subjects);
	}
	
	public static void method2() {
		
		Set<String> habbies = new HashSet<String>(Arrays.asList("1","2","3","4"));
		//일반 for문 : 불가능
		
		//향상 for문
		for(String hobby : habbies) {
			System.out.println(hobby);
		}
	}
	
	public static void method3() {
		
		Set<Integer> lotto = new HashSet<Integer>();
	
		while(true) {
			lotto.add((int)(Math.random()*45 + 1));
			if(lotto.size()==6) {
				break;
			}
		}
		while(lotto.size()<6) {
			lotto.add((int)(Math.random()*45) + 1);
		}
		
		

		System.out.println(lotto);
	
		
		List<Integer> list = new ArrayList<Integer>(lotto);
		
		
		Collections.sort(list);
		Collections.sort(list,Collections.reverseOrder());
	
	
	}
	public static void main(String[] args) {
		
		method3();
	}

}
