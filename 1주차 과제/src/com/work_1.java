package com;

import java.util.Scanner;
public class work_1 {

	public static void main(String[] args) {
		int b,c,d,s;
		Scanner a=new Scanner(System.in);
		System.out.print("��ȯ�� �� �Է� : ");
		b=a.nextInt();
		c=b/60;
		d=c/60;
		s=b-(c*60);
		System.out.print(b+"�ʴ� "+d+"�ð� "+c%60+"��"+s+"�� �Դϴ�.");
		a.close();
	}

}
