package ex2_Gambling;

import java.util.Scanner;

public class Game {

	private Player[]p;
	private Scanner sc = new Scanner(System.in);
	
	public Game() {
		System.out.println(" 겜블링 게임에 참여할 선수 숫자 >>>");
		int nPlayer = sc.nextInt();
		sc.nextLine()
		p = new Player[nPlayer];
		for(int i=0; i<p.length; i++) {
			System.out.println((i+1)+"번째 선수 이름");
			p[i] = new Player(sc.nextLine())
		}
	}
}
