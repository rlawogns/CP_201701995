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
			System.out.print("가위, 바위, 보중 하나를 입력하세요 : ");
			a=s.nextLine();
			int userNum=(int)(Math.random()*10)+1;
			if(userNum==1||userNum==4||userNum==7)b="가위";
			if(userNum==2||userNum==5||userNum==8)b="바위";
			if(userNum==3||userNum==6||userNum==9)b="보";
			if(a=="가위") {
				if(b=="가위") System.out.println("비겼습니다.");
				else if (b=="바위") {
					System.out.println("졌습니다.");
					d++;
				}
				else {
					System.out.println("이겼습니다.");
					c++;
				}		
			}
			else if(a=="바위") {
				if(b=="바위") System.out.println("비겼습니다.");
				else if (b=="보") {
					System.out.println("졌습니다.");
					d++;
				}
				else  {
					System.out.println("이겼습니다.");
					c++;
				}
				
			}
			else{
				if(b=="보") System.out.println("비겼습니다.");
				else if (b=="가위") {
					System.out.println("졌습니다.");
					d++;
				}
				else  {
					System.out.println("이겼습니다.");
					c++;
				}	
			}
			System.out.println("stage "+(i+1)+"> user : "+c+"승 vs computer"+d+"승");
		}
		if(c>d)
			System.out.println("user");
		else
			System.out.println("computer");
	}

}