package hw07;
import java.util.Scanner;
public class BankAccount {
	Scanner a=new Scanner(System.in);
	String accountNumber;
	String owner;
	int balance;
	int zxc;
	public BankAccount(String q,String w, int e) {
		accountNumber=q;
		owner=w;
		balance=e;
	}
	void deposit(int amount) {
		balance+=amount;
		System.out.println("=====================");
		System.out.println("계좌번호 : "+accountNumber);
		System.out.println("예금주 : "+owner);
		System.out.println("잔액 : "+balance);
	}
	void withdraw(int amount) {
		balance-=amount;
		System.out.println("=====================");
		if(balance<0)
			System.out.println("잔액이 부족합니다.");
		else {
		System.out.println("계좌번호 : "+accountNumber);
		System.out.println("예금주 : "+owner);
		System.out.println("잔액 : "+balance);
		}
	}
	public String toString() {
		System.out.println("=====================");
		System.out.println("계좌번호 : "+accountNumber);
		System.out.println("예금주 : "+owner);
		System.out.println("잔액 : "+balance);
		return "";
	}
	public int sendAccount(int amount, BankAccount otherAccount) {
		balance-=amount;
		otherAccount.balance+=amount;
		System.out.println("=====================");
		if(balance<0) {
			System.out.println("잔액이 부족합니다.");
		}
		
		else {
			if(zxc==1) {
				System.out.println("계좌1\n계좌번호 : "+accountNumber);
				System.out.println("예금주 : "+owner);
				System.out.println("잔액 : "+balance+"\n");
				System.out.println("계좌2\n계좌번호 : "+otherAccount.accountNumber);
				System.out.println("예금주 : "+otherAccount.owner);
				System.out.println("잔액 : "+otherAccount.balance);
		}
			else {
				System.out.println("계좌1\n계좌번호 : "+otherAccount.accountNumber);
				System.out.println("예금주 : "+otherAccount.owner);
				System.out.println("잔액 : "+otherAccount.balance+"\n");
				System.out.println("계좌2\n계좌번호 : "+accountNumber);
				System.out.println("예금주 : "+owner);
				System.out.println("잔액 : "+balance);
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int asd,zxc,amount;
		Scanner a=new Scanner(System.in);
		BankAccount b1=new BankAccount("","",0);
		BankAccount b2=new BankAccount("","",0);
		
		System.out.println("계좌1 정보 입력");
		System.out.print("계좌번호 : ");
		b1.accountNumber=a.nextLine();
		System.out.print("예금주 : ");
		b1.owner=a.nextLine();
		System.out.print("초기 잔액 : ");
		b1.balance=a.nextInt();
		
		System.out.println("계좌2 정보 입력");
		System.out.print("계좌번호 : ");
		b2.accountNumber=a.nextLine();
		b2.accountNumber=a.nextLine();
		System.out.print("예금주 : ");
		b2.owner=a.nextLine();
		System.out.print("초기 잔액 : ");
		b2.balance=a.nextInt();
		
		System.out.print("저금은 1, 인출은 2, 잔액 출력은 3, 계좌이체는 4를 입력하세요.");
		asd=a.nextInt();
		if(asd==1) {
			System.out.print("저금할 계좌를 선택하세요. :");
			zxc=a.nextInt();
			System.out.println("계좌에 저금할 금액 : ");
			amount=a.nextInt();
			if(zxc==1)
				b1.deposit(amount);
			else
				b2.deposit(amount);
		}
		if(asd==2) {
			System.out.print("인출할 계좌를 선택하세요. :");
			zxc=a.nextInt();
			System.out.println("계좌에서 인출할 금액 : ");
			amount=a.nextInt();
			if(zxc==1)
				b1.withdraw(amount);
			else
				b2.withdraw(amount);
		}
		if(asd==3) {
			System.out.println("잔액 출력할 계좌를 선택하세요 :");
			zxc=a.nextInt();
			if(zxc==1)
				b1.toString();
			else
				b2.toString();
		}
		if(asd==4) {
			System.out.print("송금할 계좌를 선택하세요. :");
			zxc=a.nextInt();
			
			if(zxc==1) {
				b1.zxc=1;
				System.out.println("계좌1에서 계좌2로 송금할 금액 : ");
				amount=a.nextInt();
				b1.sendAccount(amount, b2);
			}
				else
				{
				b2.zxc=2;
				System.out.println("계좌2에서 계좌1로 송금할 금액 : ");
				amount=a.nextInt();
				b2.sendAccount(amount, b1 );
				}
		}
	}
}
