package ex3_has_a_without_extends;

public class Soldier {           //extends 없이 하는 방법

	private Gun gun;
	
	public Soldier() {
		gun = new Gun();        // void 안쓰는 이유는..? 생성자 이고  반환타입이 없는 메소드 이기 때문에..
	}
	
	public void shoot() {
		
		gun.shoot();
	}
	
	public void walk() {
		System.out.println("WALK!");
	}
}
