package hw02;

import java.util.Scanner;

public class hw2_1 {

	public static void main(String[] args) {
		String a;
		String b="";
		int c=0,d=0;
		int i=0;
		
		Scanner s=new Scanner(System.in);
		for(i=0; i<7; i++) {
			System.out.print("����, ����, ���� �ϳ��� �Է��ϼ��� : ");
			a=s.nextLine();
			int userNum=(int)(Math.random()*10)+1;
			if(userNum==1||userNum==4||userNum==7)b="����";
			if(userNum==2||userNum==5||userNum==8)b="����";
			if(userNum==3||userNum==6||userNum==9)b="��";
			if(a=="����") {
				if(b=="����") System.out.println("�����ϴ�.");
				else if (b=="����") {
					System.out.println("�����ϴ�.");
					d++;
				}
				else {
					System.out.println("�̰���ϴ�.");
					c++;
				}		
			}
			else if(a=="����") {
				if(b=="����") System.out.println("�����ϴ�.");
				else if (b=="��") {
					System.out.println("�����ϴ�.");
					d++;
				}
				else  {
					System.out.println("�̰���ϴ�.");
					c++;
				}
				
			}
			else{
				if(b=="��") System.out.println("�����ϴ�.");
				else if (b=="����") {
					System.out.println("�����ϴ�.");
					d++;
				}
				else  {
					System.out.println("�̰���ϴ�.");
					c++;
				}	
			}
			System.out.println("stage "+(i+1)+"> user : "+c+"�� vs computer"+d+"��");
		}
		if(c>d)
			System.out.println("user");
		else
			System.out.println("computer");
	}

}