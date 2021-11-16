package ex9_override;

public class Alba extends staff {
  
	private int payPerHour;
	private int times;
	
	
	public Alba(String name, String dept, int payPerHour) {
		super(name, dept);
		this.payPerHour = payPerHour;
		
	}
	
	
	public void addTimes(int hour) {
		
		times += hour;
	} 
	
	@Override                    //직접
	public int getPay() {
		return payPerHour * times;
	}
	
	@Override                   // ctrl + 스페이스 ->  info()  엔터
	public void Info() {
		
		super.Info();
		System.out.println("근무시간: " + times + "시간");
		System.out.println("급여: " + getPay());
	}
	
	
	
	
	
	
	
	
}
