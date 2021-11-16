package ex1_uesr_type;

public class MainClass {
  public static void main(String[] args) {
	  // 같은곳에 있으면 import 필요 없음..!!
	  // Member를 만들어 본다
	  // Member : 클래스
	  // m      : 객체, 인스턴스
	  Member m = new Member();
	  
	  // m의 필드 사용하기
	  m.id = "admin";
	  m.password = "1234";
	  
	  // m의 값 출력하기
	  System.out.println(m);   
	  System.out.println(m.id);       //  admin
	  System.out.println(m.password); //  1234
	  System.out.println(m.MemberNo); // 0
	  System.out.println(m.korean);   // false
	 
	  
	  
	  
	  

	}

}
