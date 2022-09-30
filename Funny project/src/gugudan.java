//import java.util.Scanner;
public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gugu();
			
		
		
	}

	public static void gugu(){

		int dan=2;
		int mul=1;
		for(int i=0; i<8;i++) {
			System.out.println(dan+"단");
			for(int j=0;j<9;j++) {
				
				System.out.println(dan+" x "+mul+" = "+(dan)*(mul));
				mul++;
			}
			dan++;
			mul=1;
		}
		
		
	}
	

//	public static void randomQuestion() {
//		int n = (int)(Math.random()*72)+1;
//		int [] id =new int[72];
//		int s1=0;
//		int s2=0;
//		Scanner sc = new Scanner(System.in);
//		int value =sc.nextInt();
//		int inter =0;
//		
//		for(int i=0; i<8;i++) {
//			s1=i+2;
//			for(int j=0;j<9;j++) {
//				s2=j+1;
//				System.out.println(s1*s2);
//				id[j+i]=s1*s2;
//			}
//		}
//		
//		
		
		
		
	
	
}
