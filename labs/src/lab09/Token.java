package lab09;

public class Token {
	
	private double xCoor;
	private double yCoor;
	private Map map;
	
	
	public double getxCoor() {
		return xCoor;
	}
	public void setxCoor(double xCoor) {
		this.xCoor = xCoor;
	}
	public double getyCoor() {
		return yCoor;
	}
	public void setyCoor(double yCoor) {
		this.yCoor = yCoor;
	}
	public Token(double xCoor, double yCoor, Map map) {
		
		this.xCoor = xCoor;
		this.yCoor = yCoor;
		this.map = map;
	}
	
	public boolean move(String direction, int distance) {
//		if(direction != "north" || "east" || "south" || "west") {
//			System.out.println("invalid direction");
//		}
		return true;
	}
	
	

}
