package reviewclass4;

public class Repl68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * $$$$
		 * $  $
		 * $  $
		 * $$$$
		 */
		
		for(int i=1; i<=4;i++) {
		
			for(int j=1;j<=4;j++) {
				if((i==2&&j==2)||(i==2&&j==3)||(i==3&&j==2)||(i==3&&j==3)) {
					System.out.print(" ");
				}else {
					System.out.print("$");
				}
			}
			System.out.println();
		}
		
		
	}

}
