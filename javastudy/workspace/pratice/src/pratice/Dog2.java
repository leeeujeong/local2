package pratice;

public class Dog2 extends Animal2 {

	
	private String name;

	public Dog2(int age, String name) {
		super(age);
		this.name = name;
	}

	
	
	
	
	
	
	
	@Override
	public void info() {
		
		super.info();
		System.out.println("이름: " + name);
	}
	
	
	
	
	
	
	
}
