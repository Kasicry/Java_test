package hello;

public class T1_Fibonacci {

	public static void main(String[] args) {
		
		int a1 = 1;
		int a2 = 1;
		int a3;
		
		// 1 1 2 3 5 8  13 21
		// 0 1 1 2 3 5 8 
		System.out.println(a1);
		System.out.println(a2);
		
		for(int i=0; i<5; i++) {
			
			a3 = a1+a2;
				
				System.out.println(a3);
				
				a1=a2;
				a2=a3;
			
		}
		


	}

}
