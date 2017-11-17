package hw03;

import java.util.Scanner;

public class hw3_2 {

	public static void main(String[] args) {
		String a;
		Scanner s=new Scanner(System.in);
		System.out.print("문자를 입력하세요. : ");
		a=s.nextLine();
		switch(a){
			case "a":
			case "e":
			case "o":
			case "i":
			case "u":{
				System.out.println("모음입니다.");
				break;
			}
			default:{
				System.out.println("자음입니다.");
				break;			
			}
		}
	}

}
