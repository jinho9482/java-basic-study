package day2;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int i = 0; i < 100; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}	
//		}
//		for (int i = 2; i < 100; i+=2) {
//			System.out.println(i);	
//		}  // �� ������.
//		
		for (int i = 0; i < 5; i++) {
			for (int x = 0; x < i; x++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for (int i = 0; i < 8; i++) {
			String star = "*";
			for (int x = 0; x < i; x++) {
				star += "*";
			}
			System.out.println(star);		
		}
		
//		-----------------------------------------------------------
//		Escape statement (\)
//		\t (tab) \n (enter, line break)
//		System.out.println("I have 'a' car");
		
		String star = "";
		for (int i = 0; i < 8; i++) {
			for (int x = 0; x < i; x++) {
				star += "*";
			}
			star += "*\n";		
		}
		System.out.print(star);
		
	
	}

}
