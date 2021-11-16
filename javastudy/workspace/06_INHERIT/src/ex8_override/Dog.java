package ex8_override;

public class Dog extends Animal{
    
	
	private String name;
	
	
	public Dog(int age, String name) {
		super(age);                         // 소스 -> 콘스턱~~~유징~~!
		this.name = name;
	}


	@Override                 // 소스 -> 오버라이드 메소드
	public void move() {
		
		System.out.println("달린다.");
		
	}

	
   @Override
      public void info() {
	// TODO Auto-generated method stub
	  super.info();  // Animal 클래스의 info 메소드 호출 
	  System.out.println("이름: " + name);
	  
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
