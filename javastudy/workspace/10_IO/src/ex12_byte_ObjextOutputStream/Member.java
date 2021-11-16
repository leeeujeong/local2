package ex12_byte_ObjextOutputStream;

import java.io.Serializable;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Member implements Serializable {
	
	/** default serial version
	private static final long serialVersionUID = 1L;
	 * 
	 */

	/**
	 * generated serial version
	 */
	private static final long serialVersionUID = -8122624483767210131L;
	
	private String id;
	private String password;
	
	public void info() {
		System.out.println(id + "("+password+")");
	}
}
