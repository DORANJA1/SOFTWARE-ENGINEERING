package harmSu;

import java.util.Scanner;

public class function {
	
	public static int myFunction(int x){
		
		int y =(2*x)+1;
		
		return y;
		
	}
	
	public static void printDan(int dan) {
		int mul =1;
		for(int i=0; i<9; i++) {
			System.out.println(dan+" x "+ mul+ " = " +(dan*mul));
			mul++;
		}
	}

	public static void main(String[] args) {
	
		
		System.out.println(fuc(6,7));

		System.out.println(myFunction(6));
		
		alphabet('A');

		System.out.println(evenSum());

		System.out.println(oddOrRvenSum(100, true));
		
//		gugudan();
		
		
		
		
		Scanner in = new Scanner(System.in);
		int val = in.nextInt();
		printDan(val);

	}
	
	public static int fuc(int i, int j) {
		int ans=0;
		ans=(i+j);
		return ans;
	}
	
	public static void alphabet(char a) {
		if(a<='Z'&&a>='A') {
			System.out.println("이건 대문자");
		}else if(a>='a'&&a<='z'){
			System.out.println("이건 소문자");
		}else {
			System.out.println("잘못된 입력값");
		}
		
	}
	
	public static int evenSum() {
		int result=0;
		for(int i=0; i<=100; i++) {
			if(i%2==0) {
				result=result+i;
			}
			
		}
		
		return result;
	}
	
	public static int oddOrRvenSum(int max, boolean evenFlag) {
		int result=0;
		
		if(evenFlag==true) {
		for(int i=0; i<=max;i++) {
			if(i%2==1) {
				result=result+i;
			}
		}
		
		}else {
			for(int i=0; i<=max; i++) {
				if(i%2==0) {
					result=result+i;
				}
				
			}
		}
		
		return result;
	}

//	public static void gugudan() {
//		Scanner in = new Scanner(System.in); 
//		int num =in.nextInt();
//		for(int i =1;i<10;i++) {
//			System.out.println(num+" x "+i+" = "+i*num);
//		}
//		
//	}
}
