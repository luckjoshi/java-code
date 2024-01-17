package first;
import java.util.Scanner;
public class programfour {
	public static void main(String args[]) {
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
	    if (a>=0) {
	    	System.out.println("This is positive number.");
	    }
	    else {
	    	System.out.println("This is negative number.");
	    }
	}

}
