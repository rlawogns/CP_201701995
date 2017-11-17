package hw05;

public class Date {
	int y,m,d;
	public void printEastern() {
		System.out.println("동양식 날짜 표현 : "+y+"."+m+"."+d);
	}
	public void printWestern() {
		switch(m) {
		case 1:
			System.out.println("미국식 날짜 표현 : January "+d+", "+y);
			break;
		case 2:
			System.out.println("미국식 날짜 표현 : February "+d+", "+y);
			break;
		case 3:
			System.out.println("미국식 날짜 표현 : March "+d+", "+y);
			break;
		case 4:
			System.out.println("미국식 날짜 표현 : April "+d+", "+y);
			break;
		case 5:
			System.out.println("미국식 날짜 표현 : May "+d+", "+y);
			break;
		case 6:
			System.out.println("미국식 날짜 표현 : June "+d+", "+y);
			break;
		case 7:
			System.out.println("미국식 날짜 표현 : July "+d+", "+y);
			break;
		case 8:
			System.out.println("미국식 날짜 표현 : August "+d+", "+y);
			break;
		case 9:
			System.out.println("미국식 날짜 표현 : September "+d+", "+y);
			break;
		case 10:
			System.out.println("미국식 날짜 표현 : October "+d+", "+y);
			break;
		case 11:
			System.out.println("미국식 날짜 표현 : November "+d+", "+y);
			break;
		case 12:
			System.out.println("미국식 날짜 표현 : December "+d+", "+y);
			break;
		}
	}
}
