package hw02;

import java.util.Scanner;

public class hw2_2 {

	public static void main(String[] args) {
		int y,m,d;
		int c=0;
		int i;
		Scanner b=new Scanner(System.in);
		System.out.print("년/월/일을 입력하세요 : ");
		y=b.nextInt();
		m=b.nextInt();
		d=b.nextInt();
		
		for(i=1900; i<y; i++) {
			if((i%4==0 && i%100!=0)||i%400==0) c+=366;
			else c+=365;
		}
		for(i=1; i<=m-1; i++) {
			if((y%4==0 && y%100!=0)||y%400==0) {
				if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) c+=31;
				else if(i==2) c+=29;
				else c+=30;
			}
			else {
				if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) c+=31;
				else if(i==2) c+=28;
				else c+=30;;
			}
		}
		c+=(d-1);
		c=c%7;
		switch(c) {
		case(1):{	
			System.out.println("화");
			break;
			}
		case(2):{	
			System.out.println("수");
			break;
			}
		case(3):{	
			System.out.println("목");
			break;
			}
		case(4):{	
			System.out.println("금");
			break;
			}
		case(5):{	
			System.out.println("토");
			break;
			}
		case(6):{	
			System.out.println("일");
			break;
			}
		default:{	
			System.out.println("월");
			break;
			}
		}
		b.close();
	}
}