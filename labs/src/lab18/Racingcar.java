package lab18;

public class Racingcar extends Car {

	private String driver;
	private int turboFactor = 2;
	
	
	public Racingcar(String model, int speed, String driver, int turboFactor) {
		super(model, speed);
		this.driver = driver;
		this.turboFactor = turboFactor;
	}


	public String getDriver() {
		return driver;
	}


	public void setDriver(String driver) {
		this.driver = driver;
	}


	public int getTurboFactor() {
		return turboFactor;
	}


	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
	
	
	
	public void accelerate() {
		super.accelerate(turboFactor);
		
		
	}
	
	
}
