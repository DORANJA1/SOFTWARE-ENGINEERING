
public class hamSU {
	
	private int point1x;
	private int point1y;
	private int point2x;
	private int point2y;
	private int degree;
	
	void setPointAndDegree(int pointX, int pointY, int degree) {
		this.point1x=pointX;
		this.point1y=pointY;
		this.degree=degree;
	}
	
	void setPoint2(int pointX, int pointY) {
		this.point2x=pointX;
		this.point2y=pointY;
	}
	
	public void pointAndDegree() {
		
		int b=point1y-(point1x*degree);
		
		
		System.out.println("y="+degree+"x+("+b+")");
	}
	
	
	
	public void pointAndPoint() {
		int slope=0;
	    
		slope=(point2y-point1y)/(point2x-point1x);
		
		int a=point2y-(point2x*slope);
		
		if(slope==0) {
			System.out.println("y="+slope);
		}else if(a==0){
			System.out.println("y="+a+"x");
		}else {
		
		System.out.println("y="+slope+"x+"+a);
		}
	}
	
}
