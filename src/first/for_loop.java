package first;

public class for_loop {
	public static void main(String args[]) {
	for_loop fl = new for_loop();
//	fl.table();
//	fl.series();
//	fl.pattern();
//	fl.hash();
//	fl.p_3();
//	fl.dec();
//	fl.Dec_pattern();
//	fl.Dec_pat_num();
	fl.fabonacci();
	
	
	
	}	
//	public void table() {
//		for (int i=1;i<=18;i++) {
//			System.out.println(2*i);
//		}
//	
//		public void series() {
//			for (int i=0;i<=20;i++) {
//				System.out.print(+2*i+1+", ");
//			}
//				
//			}
		
//		public void pattern() {
//			for (int i=1; i<=5; i++) {
//				for (int j=1;j<=i;j++) {
//				System.out.print("*");
//		
//			}
//				System.out.println("");
//
//		}
//		}	
		
//	     public void hash() {
//	    	 for(int i=1;i<=5;i++) {
//	    		 for(int j=1;j<=i;j++) {
//	    		 System.out.print(j); 
//	    	 }
//	    	     System.out.println("");
//	    	 }	 
//	    public void p_3() {
//	    	for(int i =1;i<=3;i++) {
//	    		for(int j=1;j<=3;j++) {
//	    			System.out.print("*");
//	    		}
//	    		   System.out.println("");
//	    	}
	
//	decrement statments-
	    	
//	     public void dec() {
//	        for(int i=20;i>=1;i--) {
//	        	System.out.println(2*i);
//	        }
////	
//	
//	
//	     }
	
//	   public void Dec_pattern() {
//		   for(int i=1;i<=5;i++) {
//			   for(int j=5;j>=i;j--) {
//			   System.out.print("*");
//		   }
//		      System.out.println("");
//	   }
//	
//	 public void Dec_pat_num()
	
	
//	{
//		   for(int i=1;i<=5;i++) {
//			   for(int j=5;j>=i;j--) {
//			   System.out.print(j);
//		   }
//		      System.out.println("");
//	   }
//	
	public void fabonacci() {
		int a = -1;
		int b = 1;
		for (int i=1;i<=10;i++) {
			int temp  =a+b;
			a=b;
			b=temp;
			System.out.print(temp+ " ");
		}
		
	}
	
}		

			
	


