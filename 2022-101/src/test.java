
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test= new int[] {1,2,3,5,4}; 
			
		bubbleSort bs = new bubbleSort();
		
		bs.bubbleS(test, true);
		
		for(int i=0; i<test.length;i++) {
			System.out.println(test[i]);
		}

	}

}
