package hw05;

import java.util.Scanner;

public class hw05_1 {
	public static void main(String[] args) {
		int b=0,c=0;
		Scanner a=new Scanner(System.in);
		System.out.print("문자열을 입력하시오. ");
		String s=a.nextLine();
		for (int i= 0; i<=s.length()-1; i++) {
			switch(s.charAt(i)){
			case 'a':
			case 'e':
			case 'o':
			case 'i':
			case 'u':{
				b++;
				break;
			}
			default:{
				c++;
				break;	
			}
		}
	}
		System.out.println("자음의 개수: "+c+"개");
		System.out.println("모음의 개수: "+b+"개");
}
}
