package first;

public class nestedIf {
	public static void main(String arge[]) {
		int a = 20;
        int b = 40;
        int c = 60;
        
        if (a==20) {
        	System.out.println("First if is executed.");
        	     
        	if (b==40) {
        		System.out.println("second if is executed.");
        		
        		if (c==60) {
        			System.out.println("Third if executed successfully.");
        		}
        	}
        }
        }

}

