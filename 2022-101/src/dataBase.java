
public class dataBase {

	private String name;
	private int age;
	private int ID;
	private String dis;
	private String disID;
	private String docName;
	
	void setName(String name) {
		this.name=name;
	}
	
	void setAge(int age) {
		this.age=age;
	}
	
	void setID(int ID) {
		this.ID=ID;
	}
	
	void setDis(String dis) {
		this.dis=dis;
	}
	
	void setDisID(String disID) {
		this.disID=disID;
	}
	
	void setDocName(String docName) {
		this.docName=docName;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	int getID() {
		return ID;
	}
	
	String getDis() {
		return dis;
	}
	
	String getDisID() {
		return disID;
	}
	
	String getDocName() {
		return docName;
	}
	public void getPatientInfo(String name) {
		System.out.println("이름은 "+getName());
		System.out.println("나이는 "+getAge());
		System.out.println("주민번호는 "+getID());
		System.out.println("병명은 "+getDis());
		System.out.println("질병 코드는 "+getDisID());
		System.out.println("담당의 이름은 "+getDocName());
	}
	
}
