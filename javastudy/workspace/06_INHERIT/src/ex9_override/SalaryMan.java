package ex9_override;

public class SalaryMan extends staff {

	
	private int salary;
	
	
	public SalaryMan(String name, String dept, int salary) {
		
		super(name, dept);                               // 소스 -> 유징!!
		this.salary = salary;
	
	
	}
	@Override               // 직접 입력함
	public int getPay() {
		return salary;
	}
	
	
	@Override    // ctrl + 스페이스  ->  info() 엔터~~!
	public void Info() {
		
		super.Info();
	    System.out.println("급여: " + getPay());
	}
	
	

	
}
