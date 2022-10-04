
public class chulSuNom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [][] score = new int [3][4];
		resetScore(score);
		
		int [][] score1 = new int [6][3];
		
		
//		getKor(score, 78);
//		getKor(score, 55);
//		getKor(score, 78);
//		getKor(score, 60);
//		getKor(score, 99);
//		getKor(score, 77);
//		
//		getAvg(score);
//		resetScore(score);
//		
//		getEng(score, 78);
//		getEng(score, 56);
//		getEng(score, 95);
//		getEng(score, 90);
//		getEng(score, 33);
//		getEng(score, 66);
//		getAvg(score);
//		resetScore(score);
//		
//		getMath(score, 77);
//		getMath(score, 88);
//		getMath(score, 74);
//		getMath(score, 93);
//		getMath(score, 57);
//		getMath(score, 80);
//		getAvg(score);
		
		
		
		
		getKor1(score1, 78);
		getKor1(score1, 55);
		getKor1(score1, 78);
		getKor1(score1, 60);
		getKor1(score1, 99);
		getKor1(score1, 77);
		
		getEng1(score1, 78);
		getEng1(score1, 56);
		getEng1(score1, 95);
		getEng1(score1, 90);
		getEng1(score1, 33);
		getEng1(score1, 66);
		
		getMath1(score1, 77);
		getMath1(score1, 88);
		getMath1(score1, 74);
		getMath1(score1, 93);
		getMath1(score1, 57);
		getMath1(score1, 80);
		
		sessionAvg(score1);
		
		lectureAvg(score1);
	}

	
	
	public static void resetScore(int [][] a) {
		int num=1;
		for(int i=0;i<3;i++) {
			
			
			for(int j=0;j<4; j++) {
				
				a[i][j]=num;
				if(j==3) {
				System.out.println(num);
				}
				else {
					System.out.print(num+" ");
				}
				num++;
			}
			
			
		}
		
	}
	
//	public static void getKor(int [][] a, int kor) {
//		int slot1 =0;
//		for(int i=0;i<4;i++) {
//			
//			if(a[slot1][i]<13) {
//			a[slot1][i]=kor;
//			break;
//			}
//			
//			if(i==3) {
//				i=-1;
//				slot1=slot1+1;
//				
//			}
//			
//		}
//	
//		
//	}
//	public static void getEng(int [][] a, int eng) {
//		int slot1 =0;
//		for(int i=0;i<4;i++) {
//			
//			if(a[slot1][i]<13) {
//			a[slot1][i]=eng;
//			break;
//			}
//			
//			if(i==3) {
//				i=-1;
//				slot1=slot1+1;
//				
//			}
//			
//		}
//	
//		
//	}
//	
//	public static void getMath(int [][] a, int math) {
//		int slot1 =0;
//		for(int i=0;i<4;i++) {
//			
//			if(a[slot1][i]<13) {
//			a[slot1][i]=math;
//			break;
//			}
//			
//			if(i==3) {
//				i=-1;
//				slot1=slot1+1;
//				
//			}
//			
//		}
//	
//		
//	}
//	
	
	public static void getAvg(int [][] a) {
		
		int fir=0;
		int sec=0;
		int sum=0;
		int cnt=0;
		
		
		while(a[fir][sec]>13) {
			sum=sum+a[fir][sec];
			cnt++;
			sec++;
			
			if(sec==4) {
				fir++;
				sec=0;
			}
			
		}
		sum=sum/cnt;
		System.out.println("과목 평균은 "+sum);
	}
	
	
	public static void getKor1(int [][] a, int kor) {
		int i=0;
		while(i<6) {
			if(a[i][0]==0) {
				a[i][0]=kor;
				break;
			}
			i++;
			
			
			}
			
			
		
			
		}
	
	public static void getEng1(int [][] a, int eng) {
		int i=0;
		while(i<6) {
			if(a[i][1]==0) {
				a[i][1]=eng;
				break;
			}
			i++;
			
			
			}
			
			
		
			

			
		}
	
	public static void getMath1(int [][] a, int math) {
		int i=0;
		while(i<6) {
			if(a[i][2]==0) {
				a[i][2]=math;
				break;
			}
			i++;
			
			
			}
			
			
		
			

		}
	
	
	
	
	
	public static void sessionAvg(int [][] a) {
		
	
		double sum=0;
		for(int i=0; i<6; i++) {
			
		for(int j=0; j<3; j++) {
			
			
			sum=sum+(a[i][j]/(double)3);
			
			if(j==2) {
				System.out.println("학기 평균은 "+sum);
				sum=0;
			}
		}
		
		
		}
		
	}
	
	
	public static void lectureAvg(int [][] a) {
		
		
		double sum=0;
		int lecture=0;
			
		while(lecture<3) {
		for(int j=0; j<6; j++) {
			
			
			sum=sum+(a[j][lecture]/(double)6);
			
			if(j==5) {
				System.out.println("과목 평균은 "+sum);
				sum=0;
				lecture++;
			}
			
		}
		}
		
	}
		
	
}
