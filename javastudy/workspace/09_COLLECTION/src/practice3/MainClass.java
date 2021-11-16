package practice3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
	

	Map<String,Object> staff1 = new HashMap<String, Object>();
	staff1.put("시원번호",100);
	staff1.put("사원명","김과장");
	staff1.put("시원부서","영업");
	Map<String,Object> staff2 = new HashMap<String, Object>();
	staff2.put("시원번호",110);
	staff2.put("사원명","정과장");
	staff1.put("시원부서","전략");
	Map<String,Object> staff3 = new HashMap<String, Object>();
	staff3.put("시원번호",120);
	staff3.put("사원명","이과장");
	staff3.put("시원부서","기업");

	
	List<Map<String,Object>> staffs =Arrays.asList(staff1,staff2,staff3);
	
	for(Map<String,Object> staff :staffs) {
		for(Map.Entry<String, Object> entry : staff.entrySet()){
		System.out.println( entry.getKey()+ entry.getValue());
			}
		}
	}
}
