
public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=0;
		int year=2000;
		int a =10;
		int b=20;
		
		
		switch(year){
		case 1980:
		System.out.println("1980년생이시네요");
		System.out.println("축하드립니다");
		break;
		
		case 1990:
			System.out.println("1990년생이시네요");
			System.out.println("축하드립니다");
			break;
			
		case 2000:
			System.out.println("2000년생이시네요");
			System.out.println("축하드립니다");
			break;
			
		case 2010:
			System.out.println("20180년생이시네요");
			System.out.println("축하드립니다");
			break;
			
			default :
				System.out.println("탈락");
				break;
				
	}
		
		
		
		boolean resultOf =(a+b)<40;
		//논리연산(예제가 참이라면 true)
		result=51+51;
		System.out.println(resultOf);
		float c =5/3;
		System.out.println(c);
		//(int 값 반환)
		
		float d =5/3f;
		System.out.println(d);
		//(float 값 반환)
		System.out.println(result);
		System.out.println(plus(15,15));
		System.out.println(minus(15,15));
		System.out.println(multiple(15,15));
		System.out.println(devide(15,15));
		System.out.println(remainder(15,15));
		//사칙연산 및 나머지 계산
		System.out.println(result+3020);
		
		System.out.println(isOdd(5));
		System.out.println(isOdd(6));
		//odd number 인지 판별
		System.out.println(isEven(5));
		System.out.println(isEven(6));
		//even number 인지 판별
		System.out.println(sumOf(10));
		//0부터 10까지 수의 합 
		System.out.println(sumOfEven(10));
		//0부터 10까지의 수중 even number의 합
		System.out.println(sumOfOdd(10));
		//0부터 10까지의 수중 odd number의 합
		
		System.out.println(countOdd(50));
		//숫자 50 이하의 odd넘버 갯수 카운트
		System.out.println(countEven(50));
		//숫자 50 이하의 even넘버 갯수 카운트
		
		System.out.println(isPythagoreanTheorea(3,4,5));
		//피타고라스의 정리 (a^2+b^2=c^2)
		
		System.out.println(vaccine(50));
		//f문 프린트
		System.out.println(scored(100));
		
		year(1990);
	}
	
	public static int plus(int a, int b) {
		return a+b;
	}

	public static int minus(int a, int b) {
		return a-b;
	}

	public static int multiple(int a, int b) {
		return a*b;
	}

	public static int devide(int a, int b) {
		return a/b;
	}

	public static int remainder(int a, int b) {
		return a%b;
	}
	
	public static boolean isOdd(int a) {
		if(a%2==0) {
			return false;
		}
		return true;
	}

	public static boolean isEven(int a) {
		if(a%2==0) {
			return true;
		}
		return false;
	}
	
	public static int sumOf(int i) {
		
		int sum=0;
		
		while(i>0) {
			sum=sum+i;
			i--;
			
		}
		return sum;
	}
	
	public static int sumOfEven(int i) {
		int sum=0;
		
		for(; i!=0; i--) {
			if(i%2==0) {
				sum=sum+i;
			}
			
		}
		
		
		return sum;
	}
	
	public static int sumOfOdd(int i) {
		int sum=0;
		
		for(; i!=0; i--) {
			if(i%2==1) {
				sum=sum+i;
			}
			
		}
		
		
		return sum;
	}
	
	public static int countOdd(int i) {
		int count=0;
		while(i>0) {
			if(i%2==1) {
				count++;
			}
			i--;
		}
		
		return count;
	}
	
	public static int countEven(int i) {
		int count=0;
		while(i>0) {
			if(i%2==0) {
				count++;
			}
			i--;
		}
		
		return count;
	}
	
	public static boolean isPythagoreanTheorea(int a, int b, int c) {
		
		if(Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)) {
			return true;
		}
		return false;
	}
	public static String vaccine(int age) {
		
		if(age<=20) {
			return "A백신을 접종하시오";
		}else if((age>=21)&&(age<=50)){
			return "B백신을 접종하시오";
		}
		return "c백신을 접종하시오";
	}
	
	public static String scored(int s) {
		
		if(s<=20) {
			return "F";
		}else if(20<s&&s<=40) {
			return "D";
		}else if(40<s&&s<=60) {
			return "C";
		}else if(60<s&&s<=80) {
			return "B";
		}else if(80<s&&s<=100) {
			if(s==100) {
				return "A+";
			}else {
			return "A";
			}
		} 
		return "Error: out of range score";
	}
	public static void year(int y) {
		int year=y;
	switch(year){
	case 1980:
	System.out.println("1980년생이시네요");
	System.out.println("축하드립니다");
	break;
	
	case 1990:
		System.out.println("1990년생이시네요");
		System.out.println("축하드립니다");
		break;
		
	case 2000:
		System.out.println("2000년생이시네요");
		System.out.println("축하드립니다");
		break;
		
	case 2010:
		System.out.println("20180년생이시네요");
		System.out.println("축하드립니다");
		break;
		
		default :
			System.out.println("탈락");
			break;
	}
}
	
}
	
