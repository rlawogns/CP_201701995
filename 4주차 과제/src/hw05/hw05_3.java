package hw05;

import java.util.Scanner;

import hw05.Date;

public class hw05_3 {
	public static void main(String[] args) {
		Date date = new Date();
		Scanner a=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		date.y = a.nextInt();
		System.out.print("�� �Է� : ");
		date.m=a.nextInt();
		System.out.print("�� �Է� : ");
		date.d=a.nextInt();
		date.printEastern();
		date.printWestern();
	}
}
