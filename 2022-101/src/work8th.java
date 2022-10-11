import java.util.Calendar;
public class work8th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar ca = Calendar.getInstance();
		
		int Week =ca.get(Calendar.DAY_OF_WEEK);
		
		week toDay = null;
		
		switch(Week) {
		
		case 1:
			toDay=week.SUNDAY;
			break;
		case 2:
			toDay=week.MONDAY;
			break;
		case 3:
			toDay=week.THUDAY;
			break;
		case 4:
			toDay=week.WEDDAY;
			break;
		case 5:
			toDay=week.THUDAY;
			break;
		case 6:
			toDay=week.FRIDAY;
			break;
		case 7:
			toDay=week.SATDAY;
			break;
		}
	
		System.out.println(toDay);
	}

}
