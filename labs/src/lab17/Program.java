package lab17;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map germany = new Map(500, 400);
		
		Submarine sub1 = new Submarine(5, 10, germany, 157);
		Plane plane1 = new Plane(2, 7, germany, 245);
		
		plane1.climb(60);
		
		plane1.land();
		
		System.out.println(plane1.getHeight());
		
		sub1.dive(20);
		sub1.surface();
		
		System.out.println(sub1.getDepth());

	}

}
