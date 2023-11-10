package lab17;

public class Plane extends Token {
	
	private static int maxSpeed = 360;
	private int height;
	
	public Plane(double xCoor, double yCoor, Map map, int height) {
		super(xCoor, yCoor, map);
		this.height = height;
	}

	public int getHeight() {
		return height;
	}
	
	public int climb(int howHigh) {
		height = howHigh += height;
		return howHigh;
		
	}
	
	public void land() {
		height = 0;
	}
	
	
	
	

}
