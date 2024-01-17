package first;

import java.util.Scanner;

public class ifElse {
public static void main(String args[]) {
	System.out.println("Enter your age");
	Scanner sc = new Scanner(System.in);
	int a= sc.nextInt();
	if (a>= 18) {
		System.out.println("you are an adult now ...:)");
		
	}
	else {
		System.out.println("you are not an adult yet ....:(");
	}
}
}
