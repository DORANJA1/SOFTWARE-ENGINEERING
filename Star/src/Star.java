
public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<10; i++) {
			for(int j=0; j<9-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		stars();
		
	}
	
	
	public static void stars() {
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
