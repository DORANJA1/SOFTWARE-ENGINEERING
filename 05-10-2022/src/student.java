
public class student {
	
	private String name;
	private int ID;
	private int kor;
	private int eng;
	private int math;
	
	
	
	void setName(String name) {
		this.name=name;
	}

	void setID(int ID) {
		this.ID=ID;
	}
	
	void setKor(int kor) {
		this.kor=kor;
	}
	
	void setEng(int eng) {
		this.eng=eng;
	}
	
	void setMath(int math) {
		this.math=math;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	public int calTotal() {
		return (kor+eng+math);
	}
	
	public int calAvg() {
		return (kor+eng+math)/3;
	}
	
	public void studentInfo() {
		System.out.println("학번은 "+getID()+"입니다. 이름은 "+getName()+" 입니다.");
	}
	
	public void gradeScore() {
		System.out.print("이번학기 평균 학점은 ");
		if(calAvg()<50) {
			System.out.println("fail");
		    }else if(calAvg()<65&&calAvg()>=50){
			System.out.println("pass");
			}else if(calAvg()<75&&calAvg()>=65){
			System.out.println("credit");
			}else if(calAvg()<85&&calAvg()>=75){
				System.out.println("distinction");
		}else if(calAvg()<=100&&calAvg()>=85){
			System.out.println("high distinction");
		}
		
	}

}
