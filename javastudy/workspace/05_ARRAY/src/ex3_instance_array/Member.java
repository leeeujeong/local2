package ex3_instance_array;

public class Member {

// field
private String id;
private String password;

// constructor
public Member() {
	// TODO Auto-generated constructor stub
}

public Member(String id, String password) {
	super();                                                   // 소스 눌러서 제너널  유징 필드 클릭
	this.id = id;
	this.password = password;
}




// method	개터 셋터
public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}







	
	
	
}
