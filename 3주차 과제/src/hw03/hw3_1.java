package hw03;

public class hw3_1 {

	public static void main(String[] args) {
		int a=1,b=1,c=0;
		int i,j;
		for(i=1; i<=8; i++) {
			c=c+a;
			a=b;
			b=c;
		}
		System.out.print(c);
	}

}
