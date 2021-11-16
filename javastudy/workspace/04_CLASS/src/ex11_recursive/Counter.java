package ex11_recursive;

// recursive call
// 재귀 호출
// 어떤 매소드가 자신을 다시 호출하는 것을 의미함



public class Counter {
    
	public void countDown(int count) {
		if (count == 0) {
			return;      // 반환 타입 void + return;  => 매소드의 실행 종료를 의미함.. 
		}
		System.out.println(count);                               
 		countDown(--count);   // recursive call 발생함..
	}
	
	/*
	public void countDown(int count) {
		while (count > 0) {

			System.out.println(count--);        
		}
	}
   */
}
