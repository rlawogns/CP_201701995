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
		System.out.println("���¹�ȣ : "+accountNumber);
		System.out.println("������ : "+owner);
		System.out.println("�ܾ� : "+balance);
	}
	void withdraw(int amount) {
		balance-=amount;
		System.out.println("=====================");
		if(balance<0)
			System.out.println("�ܾ��� �����մϴ�.");
		else {
		System.out.println("���¹�ȣ : "+accountNumber);
		System.out.println("������ : "+owner);
		System.out.println("�ܾ� : "+balance);
		}
	}
	public String toString() {
		System.out.println("=====================");
		System.out.println("���¹�ȣ : "+accountNumber);
		System.out.println("������ : "+owner);
		System.out.println("�ܾ� : "+balance);
		return "";
	}
	public int sendAccount(int amount, BankAccount otherAccount) {
		balance-=amount;
		otherAccount.balance+=amount;
		System.out.println("=====================");
		if(balance<0) {
			System.out.println("�ܾ��� �����մϴ�.");
		}
		
		else {
			if(zxc==1) {
				System.out.println("����1\n���¹�ȣ : "+accountNumber);
				System.out.println("������ : "+owner);
				System.out.println("�ܾ� : "+balance+"\n");
				System.out.println("����2\n���¹�ȣ : "+otherAccount.accountNumber);
				System.out.println("������ : "+otherAccount.owner);
				System.out.println("�ܾ� : "+otherAccount.balance);
		}
			else {
				System.out.println("����1\n���¹�ȣ : "+otherAccount.accountNumber);
				System.out.println("������ : "+otherAccount.owner);
				System.out.println("�ܾ� : "+otherAccount.balance+"\n");
				System.out.println("����2\n���¹�ȣ : "+accountNumber);
				System.out.println("������ : "+owner);
				System.out.println("�ܾ� : "+balance);
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int asd,zxc,amount;
		Scanner a=new Scanner(System.in);
		BankAccount b1=new BankAccount("","",0);
		BankAccount b2=new BankAccount("","",0);
		
		System.out.println("����1 ���� �Է�");
		System.out.print("���¹�ȣ : ");
		b1.accountNumber=a.nextLine();
		System.out.print("������ : ");
		b1.owner=a.nextLine();
		System.out.print("�ʱ� �ܾ� : ");
		b1.balance=a.nextInt();
		
		System.out.println("����2 ���� �Է�");
		System.out.print("���¹�ȣ : ");
		b2.accountNumber=a.nextLine();
		b2.accountNumber=a.nextLine();
		System.out.print("������ : ");
		b2.owner=a.nextLine();
		System.out.print("�ʱ� �ܾ� : ");
		b2.balance=a.nextInt();
		
		System.out.print("������ 1, ������ 2, �ܾ� ����� 3, ������ü�� 4�� �Է��ϼ���.");
		asd=a.nextInt();
		if(asd==1) {
			System.out.print("������ ���¸� �����ϼ���. :");
			zxc=a.nextInt();
			System.out.println("���¿� ������ �ݾ� : ");
			amount=a.nextInt();
			if(zxc==1)
				b1.deposit(amount);
			else
				b2.deposit(amount);
		}
		if(asd==2) {
			System.out.print("������ ���¸� �����ϼ���. :");
			zxc=a.nextInt();
			System.out.println("���¿��� ������ �ݾ� : ");
			amount=a.nextInt();
			if(zxc==1)
				b1.withdraw(amount);
			else
				b2.withdraw(amount);
		}
		if(asd==3) {
			System.out.println("�ܾ� ����� ���¸� �����ϼ��� :");
			zxc=a.nextInt();
			if(zxc==1)
				b1.toString();
			else
				b2.toString();
		}
		if(asd==4) {
			System.out.print("�۱��� ���¸� �����ϼ���. :");
			zxc=a.nextInt();
			
			if(zxc==1) {
				b1.zxc=1;
				System.out.println("����1���� ����2�� �۱��� �ݾ� : ");
				amount=a.nextInt();
				b1.sendAccount(amount, b2);
			}
				else
				{
				b2.zxc=2;
				System.out.println("����2���� ����1�� �۱��� �ݾ� : ");
				amount=a.nextInt();
				b2.sendAccount(amount, b1 );
				}
		}
	}
}
