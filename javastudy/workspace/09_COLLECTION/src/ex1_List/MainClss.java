package ex1_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClss {

	
	public static void method1() {
		//생성
		List<String>list = new ArrayList<>();
		
		//추가
		list.add("자바");
		list.add("데이터베이스");
		list.add(0,"dldbwjd");
		//제거
		list.remove(0);
		list.remove("자바");
		
		//확인
		System.out.println(list);
	}
	
	public static void method2() {
		
		//초기화
		List<String> foods = Arrays.asList("d","d","s","f");
		//길이
		System.out.println(foods.size());
		//개별요소
		System.out.println();
		//수정
		foods.set(0, "123");
		
		System.out.println(foods.get(0));
	}
	
	public static void method3() {
		List<String>list = Arrays.asList("짜욱","뽀로로","ㄸ띠뽀");
		
		//일반  for문
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//개선된 일반 for문 size(메소드를 한번만 호출
		for (int i=0,size = list.size(); i<size; i++) {
			System.out.println(list.get(i));
		}
		//향상 for문
		for (String s: list) {
			System.out.println(s);
		}
	}
	
	
	public static void main(String[] args) {
		method1();


	}

}
