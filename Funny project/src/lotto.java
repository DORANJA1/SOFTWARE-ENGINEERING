
public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int [] lotto = new int[6];
				getLotto(lotto);
				
				
			}
			
			public static void getLotto (int [] lotto) { 
				
				for(int i=0; i<6;i++) {
					
					lotto[i]=setRandom();
					int j=0;
					
					while(j<i) {
						int n=(int)(Math.random()*45)+1;
						if(lotto[i]==lotto[j]) {
							lotto[i]=n;
						}else {
							j++;
						}
						
					}
				}
				
				for(int i=0; i<6; i++) {
					System.out.println("번호는"+lotto[i]);
				}
				
			}
			
			public static int setRandom() {
			
				return (int)(Math.random()*45)+1;
			}

		}
