package lab18;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("ford", 0);
		Car car2 = new Car("audi", 0);
		Racingcar car3 = new Racingcar("porshe", 0, "some guy", 2);
		Car car4 = new Car("vauxhall", 0);
		Racingcar car5 = new Racingcar("farrari", 0, "other guy", 2);
		
		Car [] cars = {car1, car2, car3, car4, car5};
		
		
	}
	
	public void processCars() {
		for( Car c : cars ) {
			
			System.out.println(c);
		}
			
			
		
		
	}

}
