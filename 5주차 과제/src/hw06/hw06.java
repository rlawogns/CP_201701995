package hw06;

public class hw06 {

	public static void main(String[] args) {
		int[] asd=new int[10];
		for(int i=0; i<10; i++)
			asd[i]=(int)(Math.random()*100);
		int a=asd[0];
		for(int i=1; i<10; i++) 
			if(asd[i]>a) a=asd[i];
		int b=asd[0];
		for(int i=1;i<10;i++)
			if(asd[i]<b) b=asd[i];
		System.out.println("10���� �� �� ���� ū ����: "+a);
		System.out.println("10���� �� �� ���� ���� ����: "+b);
	}

}
