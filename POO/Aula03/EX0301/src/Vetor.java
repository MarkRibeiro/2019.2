
public class Vetor {
	
	private double x, y; 
		
	public Vetor ()
	{	
		x = 0.0;
		y = 0.0;
	}
	
	public Vetor (double newX) {
		x=newX;
	}
	
	public Vetor (double newX, double newY) {
		x=newX;
		y=newY;
	}
	
	public void exibe() {
		System.out.println(x);
		System.out.println(y);
	}
	
	public void soma(Vetor v2) {
		x = x+v2.x;
		y = y+v2.y; 
	}

}
