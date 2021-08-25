package hello;

public class T2_sleep {

	public static void main(String[] args) {
		
		
		try {
			for (int i = 0; i< 2; i++) {
				Thread.sleep(1000);
				System.out.println("Sleep" + i);
				
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		


	}

}
