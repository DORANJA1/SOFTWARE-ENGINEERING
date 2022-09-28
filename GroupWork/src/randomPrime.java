
public class randomPrime {

	public static void main(String[] args) {
		
		System.out.println(randomPrimeN(getRandom()));
		System.out.println(randomPrimeN(getRandom()));
		System.out.println(randomPrimeN(getRandom()));
		System.out.println(randomPrimeN(getRandom()));
		System.out.println(randomPrimeN(getRandom()));
		System.out.println(randomPrimeN(13));
	}
	
	public static boolean isPrimeNumber(int i) {
		
		boolean isPrime=true;
		int s=i-1;
		while(s>1) {
			if(i%s==0) {
				isPrime=false;
			}
			s--;
			
		}
		
			return isPrime;
	}
	
	public static int getRandom() {
		return (int)(Math.random()*100)+1;
	}
	
	public static boolean randomPrimeN(int i) {
		
		boolean ans=true;
		ans=isPrimeNumber(i);
		
		return ans;
	}

}
