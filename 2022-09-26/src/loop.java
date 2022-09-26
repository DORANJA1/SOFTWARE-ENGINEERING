import java.util.Scanner;
public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		for(int i=0; i<10; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		
		System.out.println(whileLoop());
		//0부터 9까지의 수를 더하는 for루프	
		gugudan(3);
		gugudan(4);
		gugudan(5);
		System.out.println(zeroBack(2.7));
		
		average(30,40,50);
//		scan();
//		num();
		star();
		prime();
		starA();
	}	
	
	public static int whileLoop() {
		int sum=0;
		int i=0;
		while(i<10) {
			sum=sum+i;
			i++;
		}
		
		return sum;

	}//상단에 작성된 for 루프 while 버전

	
//	public public void fl() {
//		int count=1;
//		for(int f=0;f<12;f++) {
//			System.out.println(count+"Hello");
//			count++;
//		}
//		System.out.println("끝");
//		
//	}
	
	public static void gugudan(int i) {
		int sum=0;
		int dan =1;
		for(int c=0; c<9; c++) {
			sum=i*dan;
			System.out.println(i+" x "+dan+" = "+sum);
			dan++;
		}
		System.out.println("끝");
	}
	
	
	public static void average(int kor, int eng, int math) {
		int ave=0;
		ave=(kor+eng+math)/3;
		
		System.out.println("평균은 "+ave);
		
	}
	
	public static double zeroBack(double fast) {
		double max=200;
		double time=0;
		double speed=0;
		while(speed<=max){
			if(fast==0) {
				return 0;
			}
			speed=speed+fast;
			time=time+0.1;
		}
		
		return time;
	}
	
//	public static void scan() {
//		Scanner sc = new Scanner(System.in);
//		int value =sc.nextInt();
//		int i=0;
//		while(i<value) {
//
//			System.out.println("Hello");	
//			i++;
//		}
//		
//	}
	public static void num() {
		Scanner sc = new Scanner(System.in);
		int value =sc.nextInt();
		int num=1;
		int sum=0;
		
		while(num<=value) {
		sum=sum+num;
		num++;
	}	
		System.out.println(sum);
	}

	public static void star() {
		int cnt=1;
		for(int num=0;num<10;num++) {
			
		for(int i=0;i<cnt;i++) {
			
			if(i==cnt-1) {
				System.out.println("*");
				}else {
				System.out.print("*");
				}
			}
		cnt++;
		}
	}
	
	public static void prime() {
		
		boolean isPrime=true;
		
		for(int i=1; i<=100; i++) {
			isPrime=true;
			
			for(int n=2;n<i;n++) {
				if(i%n==0) {
				isPrime=false;
				}
			}
			
		
			if(isPrime==true) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void starA() {
		int blank=10;
		int count=1;
		for(int num=0;num<10;num++) {
		
		
		}
	}
}


