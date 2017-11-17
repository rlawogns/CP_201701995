package com;

import java.util.Scanner;
public class work_1 {

	public static void main(String[] args) {
		int b,c,d,s;
		Scanner a=new Scanner(System.in);
		System.out.print("변환할 초 입력 : ");
		b=a.nextInt();
		c=b/60;
		d=c/60;
		s=b-(c*60);
		System.out.print(b+"초는 "+d+"시간 "+c%60+"분"+s+"초 입니다.");
		a.close();
	}

}
