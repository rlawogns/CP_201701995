package hw05;

public class Date {
	int y,m,d;
	public void printEastern() {
		System.out.println("����� ��¥ ǥ�� : "+y+"."+m+"."+d);
	}
	public void printWestern() {
		switch(m) {
		case 1:
			System.out.println("�̱��� ��¥ ǥ�� : January "+d+", "+y);
			break;
		case 2:
			System.out.println("�̱��� ��¥ ǥ�� : February "+d+", "+y);
			break;
		case 3:
			System.out.println("�̱��� ��¥ ǥ�� : March "+d+", "+y);
			break;
		case 4:
			System.out.println("�̱��� ��¥ ǥ�� : April "+d+", "+y);
			break;
		case 5:
			System.out.println("�̱��� ��¥ ǥ�� : May "+d+", "+y);
			break;
		case 6:
			System.out.println("�̱��� ��¥ ǥ�� : June "+d+", "+y);
			break;
		case 7:
			System.out.println("�̱��� ��¥ ǥ�� : July "+d+", "+y);
			break;
		case 8:
			System.out.println("�̱��� ��¥ ǥ�� : August "+d+", "+y);
			break;
		case 9:
			System.out.println("�̱��� ��¥ ǥ�� : September "+d+", "+y);
			break;
		case 10:
			System.out.println("�̱��� ��¥ ǥ�� : October "+d+", "+y);
			break;
		case 11:
			System.out.println("�̱��� ��¥ ǥ�� : November "+d+", "+y);
			break;
		case 12:
			System.out.println("�̱��� ��¥ ǥ�� : December "+d+", "+y);
			break;
		}
	}
}
