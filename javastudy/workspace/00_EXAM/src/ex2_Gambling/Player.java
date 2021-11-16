package ex2_Gambling;

import java.util.Scanner;

public class Player {

	private String name;
	private Scanner sc = new Scanner(System.in);
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void getEnterKey() {
		sc.nextLine();
	}
	
	public boolean turn() {
		System.out.println("[" + name + "]:<Enter>");
		getEnterKey();
		int num[] = new int[3];
		for(int i= 0; i<num.length; i++) {
			num[i] = (int)(Math.random()*3+1);
		}
		System.out.println("\t\t");
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]+"\t");
		}
	}
	boolean result = true;
	for(int i=0; i<num.length;i++) {
		if(num[i] != num[0]) {
			result = false;
		}return result;
	}
}
