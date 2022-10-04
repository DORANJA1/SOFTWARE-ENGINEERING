
public class stringEqualExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1==strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");

		}
	
	
	
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 참조가 같음");

		}
		
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");

		if(strVar3==strVar4) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");

		}
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar1과 strVar2는 참조가 같음");

		}
		
		int[]ar1 = new int [6];
		int[][] ar2 = new int [2][3];
		int[][][] ar3 = new int [5][2][3];
		int[][][][] ar4 = new int [4][3][2][1];
		
		System.out.println("");

	}
	
	
	
}
