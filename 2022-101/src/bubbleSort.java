
public class bubbleSort {
	int[] test= new int[6]; 
	
	
	public boolean bubbleS(int[] data, boolean isASC) {
		int temp;
		
		
		for(int i=0; i<data.length-1; i++) {
			boolean earlyFin=true;
			
			for(int k=0; k<data.length-i-1;k++) {
				
				if(isASC==true) {
					if(data[k]>data[k+1]) {
						temp=data[k+1];
						data[k+1]=data[k];
						data[k]=temp;
						earlyFin=false;
					}
				}
				else 
				{
					if(data[k]<data[k+1]) {
						temp=data[k+1];
						data[k+1]=data[k];
						data[k]=temp;
						earlyFin=false;
					}
			}
		}
		
			if(earlyFin==true) {
				break;
			}
			
		}
		
		return true;
		
	}
}
