
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		student first = new student();
		first.setName("Seunghoon Kwak");
		first.setID(44395515);
		first.setKor(80);
		first.setEng(60);
		first.setMath(70);

		System.out.println("평균은 "+first.calAvg());
		System.out.println("합계는 "+first.calTotal());
		first.studentInfo();
		first.gradeScore();
	
		
	}
		
}
