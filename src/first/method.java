package first;

public class method {
	//static int c;
  public static void main(String args []) {
	method obj = new method ();
	//obj.sum(20,30);
	obj.sum3(20, 30);
	//System.out.println();
	//method.sum2(10, 20);
	//method.sum(20, 30);
	
	
	  
  }
  public int sum3(int a, int b) {
		// method.sum2(10, 20); we can call static method from a non static method
		  int c= a+b;
		  System.out.println(c);
		return c;

  }
  public void sum(int a, int b) {
	// method.sum2(10, 20); we can call static method from a non static method
	  int c= a+b;
	  System.out.println(c);
	  
  }
  public static void sum2(int a, int b) {
	 // method.sum(10, 20); but we can't call a nonstatic method from a static method
	  int c= a+b;
	  System.out.println(c);
  
  
}
}