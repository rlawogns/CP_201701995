package com;
	import java.util.Scanner;
public class work_2 {

	public static void main(String[] args) {
		int a;
		Scanner b=new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ��� : ");
		a=b.nextInt();
		if((a%4==0 && a%100!=0)||a%400==0)
			System.out.println(a+"���� �����Դϴ�.");
		else
			System.out.println(a+"���� ������ �ƴմϴ�.");
		b.close();
	}

}
