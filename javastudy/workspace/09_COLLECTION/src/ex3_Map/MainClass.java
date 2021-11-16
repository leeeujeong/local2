package ex3_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainClass {

	
	public static void method1() {
		//생성
		Map<String, Integer> sungjuk = new HashMap<String, Integer>();
		
		//저장
		sungjuk.put("국어", 90);
		sungjuk.put("수학", 65);
		sungjuk.put("영어", 70);
		sungjuk.put("일어", 80);
		//확인
		System.out.println(sungjuk);
		
		//데이터 수정
		sungjuk.put("국어", 1500);
		//확인
		System.out.println(sungjuk);
		
		//삭제
		sungjuk.remove("영어");
		//확인
		System.out.println(sungjuk);
	}
	
	public static void method2() {
		
		Map<String, Object> staff = new HashMap<String, Object>();
		
		staff.put("StaffNo", 1000);
		staff.put("name", "이유정");
		staff.put("dept", "전략");
	
		System.out.println("사원번호"+staff.get("staffNo"));
		System.out.println("사원명"+staff.get("name"));
		System.out.println("부서명"+staff.get("dept"));
	}
	
	public static void method3() {
		
		Map<String, Object> staff = new HashMap<String, Object>();
		staff.put("사원번호", 1000);
		staff.put("사원명", "이유정");
		staff.put("부서명", "전략");
		

		Set<String> keys = staff.keySet();
		for(String key : keys) {
			System.out.println(key+staff.get(key));
		}
		
		for( Map.Entry<String, Object> entry : staff.entrySet() ) {
			System.out.println(entry.getKey() + entry.getValue());
		}
	}
	public static void main(String[] args) {
		method3();

	}

}
