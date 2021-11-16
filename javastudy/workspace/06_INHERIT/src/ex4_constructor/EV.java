package ex4_constructor;

public class EV extends Car {

	public EV() {    // 자식이 생기려면 먼저 부모가 먼서 생겨야 한다.
	 super();   // super (부모 클래스) -> 부모 클래스의 생성자 호출   디폴트 형태이므로 생략 가능하다.!!	
	 System.out.println("EV 생성 완료!");
	
	}
}
