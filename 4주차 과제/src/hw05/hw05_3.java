package hw05;

import java.util.Scanner;

import hw05.Date;

public class hw05_3 {
	public static void main(String[] args) {
		Date date = new Date();
		Scanner a=new Scanner(System.in);
		System.out.print("연도 입력 : ");
		date.y = a.nextInt();
		System.out.print("월 입력 : ");
		date.m=a.nextInt();
		System.out.print("일 입력 : ");
		date.d=a.nextInt();
		date.printEastern();
		date.printWestern();
	}
}
