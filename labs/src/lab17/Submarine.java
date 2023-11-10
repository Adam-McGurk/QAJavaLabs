package lab17;

public class Submarine extends Token{
	
	private static int maxSpeed = 15;
	private int depth;
	
	
	public Submarine(double xCoor, double yCoor, Map map, int depth) {
		super(xCoor, yCoor, map);
		this.depth = depth;
	}

	public int getDepth() {
		return depth;
	}
	
	public int dive(int howDeep) {
		
		depth += howDeep;
		return howDeep;
		
	}
	
	public void surface() {
		depth = 0;
	}
	
	

}
