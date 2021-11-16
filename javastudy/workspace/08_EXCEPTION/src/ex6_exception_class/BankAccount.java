package ex6_exception_class;

import java.util.Scanner;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter

public class BankAccount {

	private static BankAccount[] accounts = new BankAccount[] {
			new BankAccount("이유정","010-1234-5678",7000),
			new BankAccount("정뚜노","0102345-6789",50000)
			};
	private String owner;
	private String accNo;
	private long balance;
	private Scanner sc = new Scanner(System.in);
	
	public BankAccount(String owner, String accNo,long balance) {
		this.owner = owner;
		this.accNo = accNo;
		this.balance = balance;
	}
	//입금
	//예외상황 : 마이너스 입금
	private void deposit() {
		try {
		System.out.println("====입금 서비스===");
		System.out.print("입금액 입력 >>");
		long money = sc.nextLong();
		if(money<=0) {
			throw new DepositException( money+"원 입금 불가", 1234);
		}
			balance += money;
		}catch(DepositException e) {
			System.out.println(e.getMessage()+"(에러코드 :"+e.getErrorCode()+")");
		}
	}
	//이체에서 사용할 입금
	private void deposit(long money) {
		try {
		if(money<=0) {
			throw new DepositException( money+"원 입금 불가", 1234);
		}
			balance += money;
		}catch(DepositException e) {
			System.out.println(e.getMessage()+"(에러코드 :"+e.getErrorCode()+")");
		}
	}
	
	//출급
	//예외사항 : 마이너스 출금, 잔액보다 큰 금액 출금
	private void withdrawal() {
		try {
		System.out.println("===출금 서비스===");
		System.out.print("출금액 입력 >>");
		long money = sc.nextLong();
		if (money <=0) {
			throw new WithdrawalException(money + "원 출금 불가", 1235);
		}else if(money >balance) {
			throw new WithdrawalException("잔액 부족", 1236);
		}
			balance -= money;
		}catch(WithdrawalException e){
			System.out.println(e.getMessage()+"(에러코드 :"+e.getErrorCode()+")");	
		}
	}
	//이체에서 사용할 출금
	private long withdrawal(long money) { //실제 출금된 금액 반환
		try {
		if (money <=0) {
			money=0;
			throw new WithdrawalException(money + "원 출금 불가", 1235);
		}else if(money >balance) {
			money=0;
			throw new WithdrawalException("잔액 부족", 1236);
		}
			balance -= money;
		}catch(WithdrawalException e){
			System.out.println(e.getMessage()+"(에러코드 :"+e.getErrorCode()+")");	
		}
		return money;
	}
	
	//이체
	private void transfer() {
		System.out.println("===이체 서비스===");
		System.out.print("이체할 계좌번호 입력 >>");
		String accNo = sc.next();
		for(BankAccount account : accounts) {
			if(account.getAccNo().equals(accNo)) {
				System.out.println("이체할 계좌확인 :"+ account.getOwner());
				System.out.print("이체할 금액 확인");
				long money = sc.nextLong();
				//출금액을 반환
				//->출금액을 입금
				account.deposit(withdrawal(money));
			} 
		}
	}
	
	//조회
	private void inquiry() {
		System.out.println("===조회 서비스===");
		System.out.println("예금주"+owner+"("+accNo+")"+balance+"원");
		System.out.println("등록 계좌 확인");
		for(BankAccount account : accounts) {
			System.out.println("예금주"+ account.owner+"("+ account.accNo +")"+ account.balance+"원");
		}
	}
	
	//메뉴
	private void menu() {
		System.out.println("==============");
		System.out.println("1.입금");
		System.out.println("2.출금");
		System.out.println("3.이체");
		System.out.println("4.조회");
		System.out.println("0.종료");
		System.out.println("==============");
	}
	
	//관리
	public void accoutMange() {
		while(true) {
			menu();
			System.out.println("입력");
			switch(sc.nextInt()) {
			case 1: deposit(); break;
			case 2: withdrawal(); break;
			case 3: transfer(); break;
			case 4: inquiry(); break;
			case 0 : System.out.println("===계좌서비스 종료==="); return;
			default: System.out.println("다시 선택하세요");
			}
		}
	}
}
