package first;
import java.util.Scanner;
public class programSix {
public static void main (String args[]) {
	System.out.println("marks obtain in 5 subjects is following");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	int e = sc.nextInt();
 System.out.println("total marks obtain of five subject is "+ (a+b+c+d+e));
float per=(a+b+c+d+e)/5;
System.out.println("total marks obtain of five subject is "+per);

 
 
}   

}
