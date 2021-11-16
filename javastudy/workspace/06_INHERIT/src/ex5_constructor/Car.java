package ex5_constructor;

public class Car {

	private String model;

	public Car(String model) {
		super();                               //EV코드에서 오류 난 이유는 super(); 생략할 수 없기 때문에...
		this.model = model;
	
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	
	
	
}
