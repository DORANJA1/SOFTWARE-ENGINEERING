
/*
 작성자: 곽승훈
 작성일: 22/09/2022
 모든 문구에 주석 달기
 ex)int는 정수, double은 소수, char는 문자,boolean은 참과 거짓, String은 문구
 int=4byte=32bit
 long=8byte=64bit
 float=4byte=32bit
 double=8byte=64bit
 short=2byte=16bit
 byte=1byte=8bit
 char=2byte=16bit
 boolean=1byte=8bit
 
*/

public class Welcome {
//클래스명 선언(클래스는 데이터와 로직(함수)으로 구성)
	public static void main(String[] args) {
		//
		// TODO Auto-generated method stub
		System.out.println("Hello, Welcome to Java World");
		//출력할 문장선언후 줄 바꿈(유명 자바 시작문구 프린트)
		System.out.println("myDouble 값은: "+myDouble(9,6));
		//출력할 문장선언후 줄 바꿈(myDouble 기능 값 프린트)
		int value = 0x100;
		//value값으로 100을 선언 
		System.out.println(value);
		//value 값 프린트
		value=value%15;
		//value 값은 value값을 15로 나눈후의 나머지 값
		System.out.println(value);
		//value 값 프린트
		value=200;
		//value 값 200으로 설정
		System.out.println(value);
		//value 값 프린트
		System.out.println("value의 값은 "+value+"이다");
		//문장을 포함한 value 값 프린트
		double Val=3.14;
		//Val의 값으로 소수 3.14선
		System.out.println(Val);
		//Val값 프린트
		Val=Val*12;
		//Val값에 12를 곱하다
		System.out.println(Val);
		//Val값 프린트
		System.out.println((int)Val);
		//Val값의 정수버전 프린트
		short vaLue = 100;
		//short 값 100 선언
		System.out.println((double)vaLue);
		//short 값 출력
		byte vAlue =100;
		//byte 값 100 선언
		System.out.println(vAlue);
		//byte 값 출력
		System.out.println(Math.PI);
		//원주율 출력
		
		System.out.println(happinessOfchulSu(false,true));
		
		char a =65;
		System.out.println(a);
		//ASKII코드 이용
	}
	
	public static int myDouble(int i, int k) {
		return (2*i)+k;
		//주우우ㅜㅜ석
		//myDouble은 2i+k값을 주는 함수
		
	}
	
	public static boolean happinessOfchulSu(boolean k,boolean s) {
		boolean happy;
		if(k&&s==true) {
			happy=true;
		}else {
			happy=false;
		}
		
		return happy;
	}

}
