package com;
	import java.util.Scanner;
public class work_2 {

	public static void main(String[] args) {
		int a;
		Scanner b=new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		a=b.nextInt();
		if((a%4==0 && a%100!=0)||a%400==0)
			System.out.println(a+"년은 윤년입니다.");
		else
			System.out.println(a+"년은 윤년이 아닙니다.");
		b.close();
	}

}
