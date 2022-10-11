
public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dataBase patient = new dataBase();

		patient.setName("jack");
		patient.setAge(29);
		patient.setID(5483245);
		patient.setDis("cancer");
		patient.setDisID("C120");
		patient.setDocName("Henly");
		
		
		
		patient.getPatientInfo("jack");
	
	}

	
	
}
