package hw03;

import java.util.Scanner;

public class hw3_2 {

	public static void main(String[] args) {
		String a;
		Scanner s=new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���. : ");
		a=s.nextLine();
		switch(a){
			case "a":
			case "e":
			case "o":
			case "i":
			case "u":{
				System.out.println("�����Դϴ�.");
				break;
			}
			default:{
				System.out.println("�����Դϴ�.");
				break;			
			}
		}
	}

}
