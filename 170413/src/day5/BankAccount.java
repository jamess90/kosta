package day5;

import java.text.DecimalFormat;

public class BankAccount {
	private String name; // ���� ������ �̸�
	private long number; // ���� ��ȣ
	private int balance; // �ܰ�

	// ���ο� ���� ��û
	public BankAccount(String name, int number, int balance) {

		DecimalFormat df = new DecimalFormat("#,###");
		
		this.name = name;
		this.number = number;
		this.balance = balance;
		System.out.println(this.name +"�� ���°� �����Ǿ����ϴ�.");
		System.out.println("���� ��ȣ : " + this.number);
		System.out.println("�ܰ� : " + df.format(this.balance) + "��");
		System.out.println();
	}

	// �ܾ� ��ȸ
	public int getBalance() {
		return balance;
	}

	// ���� ��û
	private void withdraw(int amt)throws BankException{
		
		if (amt > balance) throw new BankException("���� �ܾ� ������.��", getBalance());
		balance -= amt;
	}
	//	���� ���� ���
	public void printWithdraw(int amt) throws BankException{

		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.println("<<<<<<<" + this.name + "�� ���>>>>>>>");
		System.out.println("��� ��û �ݾ� : " + amt);
		withdraw(amt);
		System.out.println(amt + "�� ����ϼ̽��ϴ�.");
		System.out.println("���� �ܾ� : " + df.format(getBalance()) + "��");
		System.out.println();
	}

	// �Ա� ��û
	private void deposit(int amt) throws BankException{
	
		if (amt < 0) throw new BankException("Error : 0���� ���� �ݾ� �Ա� ��û", getBalance());
		balance += amt;
	}
	
	//	�Ա� ���� ���
	public void printDeposit(int amt) throws BankException{
		
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println("<<<<<<<" + this.name + "�� �Ա�>>>>>>>");
		deposit(amt);
		System.out.println("�Ա� ��û �ݾ� : " + amt);
		System.out.println(amt + "�� �Ա��ϼ̽��ϴ�.");
		System.out.println("���� �ܾ� : " + df.format(getBalance()) + "��");
		System.out.println();
	}
	
	public static void main(String[] args) {

		BankAccount HyeongJun = new BankAccount("������", 100253368, 1000000000);
		BankAccount HyeonJeong = new BankAccount("������", 123452124, 324);
		BankAccount HyeongJin = new BankAccount("������", 1005221414, 100000);
		
		try {
			HyeongJun.printDeposit(123773000);
			HyeonJeong.printWithdraw(1000);
//			HyeongJin.deposit(-10000);
		} catch (BankException e) {
			DecimalFormat df = new DecimalFormat("#,###");
			System.out.println(e.getMessage());
			System.out.println("���� �ܾ� : " + df.format(e.balance) + "��");
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
