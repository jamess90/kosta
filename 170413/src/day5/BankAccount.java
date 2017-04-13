package day5;

import java.text.DecimalFormat;

public class BankAccount {
	private String name; // 계좌 개설자 이름
	private long number; // 계좌 번호
	private int balance; // 잔고

	// 새로운 계좌 신청
	public BankAccount(String name, int number, int balance) {

		DecimalFormat df = new DecimalFormat("#,###");
		
		this.name = name;
		this.number = number;
		this.balance = balance;
		System.out.println(this.name +"님 계좌가 생성되었습니다.");
		System.out.println("계좌 번호 : " + this.number);
		System.out.println("잔고 : " + df.format(this.balance) + "원");
		System.out.println();
	}

	// 잔액 조회
	public int getBalance() {
		return balance;
	}

	// 인출 요청
	private void withdraw(int amt)throws BankException{
		
		if (amt > balance) throw new BankException("계좌 잔액 부족ㅜ.ㅜ", getBalance());
		balance -= amt;
	}
	//	인출 내역 출력
	public void printWithdraw(int amt) throws BankException{

		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.println("<<<<<<<" + this.name + "님 출금>>>>>>>");
		System.out.println("출금 요청 금액 : " + amt);
		withdraw(amt);
		System.out.println(amt + "원 출금하셨습니다.");
		System.out.println("현재 잔액 : " + df.format(getBalance()) + "원");
		System.out.println();
	}

	// 입금 요청
	private void deposit(int amt) throws BankException{
	
		if (amt < 0) throw new BankException("Error : 0보다 작은 금액 입금 요청", getBalance());
		balance += amt;
	}
	
	//	입금 내역 출력
	public void printDeposit(int amt) throws BankException{
		
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println("<<<<<<<" + this.name + "님 입금>>>>>>>");
		deposit(amt);
		System.out.println("입금 요청 금액 : " + amt);
		System.out.println(amt + "원 입금하셨습니다.");
		System.out.println("현재 잔액 : " + df.format(getBalance()) + "원");
		System.out.println();
	}
	
	public static void main(String[] args) {

		BankAccount HyeongJun = new BankAccount("시형준", 100253368, 1000000000);
		BankAccount HyeonJeong = new BankAccount("박현정", 123452124, 324);
		BankAccount HyeongJin = new BankAccount("김형진", 1005221414, 100000);
		
		try {
			HyeongJun.printDeposit(123773000);
			HyeonJeong.printWithdraw(1000);
//			HyeongJin.deposit(-10000);
		} catch (BankException e) {
			DecimalFormat df = new DecimalFormat("#,###");
			System.out.println(e.getMessage());
			System.out.println("현재 잔액 : " + df.format(e.balance) + "원");
			e.printStackTrace();
		}
	}
}

@SuppressWarnings("serial")
class BankException extends Exception {
	
	int balance;
	public BankException(String msg, int balance) {
		super(msg);
		this.balance = balance;
	}
}
