package ex5_constructor;

public class EV extends Car {

	private String batterMaker;

	public EV(String model, String batteryMaker) { // construc~~~ using~~!
		super(model); // Car 클래스의 생성자는 디폴트 생성자가 아니므로 반드시 직접 호출해야 한다. super() 무조건 1순위!!
		this.batterMaker = batterMaker;
	}

	public String getBatterMaker() {
		return batterMaker;
	}

	// getter setter 생성하기.
	public void setBatterMaker(String batterMaker) {
		this.batterMaker = batterMaker;
	}




}
