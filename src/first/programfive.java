package first;
import java.util.Scanner;
public class programfive {
public static void main(String args[]) {
	System.out.println("Enter three numbers");
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	if (a>b && a>c){
		System.out.println("greatest number is"+ a);
	
	}
	if(b>a && b>c){
		System.out.println("greatest number is"+ b);
	}
	if (c>a && c>b) {
		System.out.println("greatest number is"+ c);
	}
}

}
