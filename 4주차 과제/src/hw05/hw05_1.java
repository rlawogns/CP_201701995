package hw05;

import java.util.Scanner;

public class hw05_1 {
	public static void main(String[] args) {
		int b=0,c=0;
		Scanner a=new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ�. ");
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
		System.out.println("������ ����: "+c+"��");
		System.out.println("������ ����: "+b+"��");
}
}
