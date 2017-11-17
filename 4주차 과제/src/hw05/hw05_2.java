package hw05;

import java.util.Scanner;

public class hw05_2 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("문자열을 입력하시오. ");
		String s=a.nextLine();
		for (int i= 0; i<=s.length()-1; i++) {
			if(s.charAt(i)>96&&s.charAt(i)<123) System.out.print((char)(s.charAt(i)-32));
			else if(s.charAt(i)>64&&s.charAt(i)<91)System.out.print((char)(s.charAt(i)+32));
			else System.out.print(s.charAt(i));
		}
}
}
