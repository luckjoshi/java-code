package first;

public class while_loop {
	public static void main(String args[]) {
		while_loop fl = new while_loop();
//		fl.submition();
		fl.table();
//		System.out.println("Lets print A to Z");
//		char i='A';
//		while(i<='Z') {
//			System.out.print(i+ ", " );
//			i++;
//		}
		
	}
//		public void submition() {
//			
//			int i=1,count=0;
//			while(i<=10) {
//				count=count+i;
//				i++;
//			}
//			System.out.println(count);
//
//			
//		}
		
		public void table () {
			int i=1;
			while (i<=10){
				System.out.println(2*i+"\t"+3*i+"\t"+4*i+"\t"+5*i+"\t");
				i++;
				
			}
		}
		
		
	}


