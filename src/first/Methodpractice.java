package first;

public class Methodpractice {
             
	public static void main(String args[]) {
		int a = 5;
		int b = 10;
		int c = 15;
		int d = 8;
		Methodpractice obj = new Methodpractice();
		obj.sum(3, 2);
		obj.sum2(1,2,3);
		obj.sum3(a, b, c,d);
		obj.sum4(a, b, c, d);
		
	}
	public void sum(int a, int b) {
		a=4;
		b=8;
		System.out.println(a+b);
	}
	
public void sum2(int a, int b, int c) {
	System.out.println(a+b+c);
	
}
	public void sum3(int a, int b,int c,int d ) {
	 d = a+b+c;
	System.out.println(d+a+b+c);
}
	public void sum4(int a, int b,int c, int d) {	
	  d = b+c-a;
		System.out.println(d+a+b+c);
	}
//	public void sum5(int a, int b) {
//		
//	}
//	public static void sum6(int a, int b) {
//		
//	}
//	public static void sum7(int a, int b) {
//		
//	}
//	public static void sum8(int a, int b) {
//		
//	}
//	public static void sum9(int a, int b) {
//		
//	}
	
	
}
