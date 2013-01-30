package structural.DecoratorCars;

/**
 * This class defines an object to which additional responsibilites can be
 * attached.
 * @author Joost
 * @version 1.0
 * @updated 30-jan-2013 16:09:55
 */
public class BasicCar implements Car {
	
	private boolean started;
	private int speed;

	public BasicCar(){
		started = false;
		speed = 0;
	}
	
	public void startengine() {
		if (!started) {
			started = true;
		} else {
			System.out.println("Engine is running already");					
		}
	}
	
	public void stopengine() {
		if (started) {
			started = false;
		} else {
			System.out.println("Engine is not running");					
		}
	}

	public void throttle(){
		if (started) {
			speed = speed + 10;
			System.out.println("throttle, speed = " + speed);								
		} else {
			System.out.println("Engine is not running");								
		}
	}

	public void slowdown(){
		if (speed > 0) {
			speed = speed - 10;
			System.out.println("slowdown, speed = " + speed);								
		} else {
			System.out.println("Car is not moving");								
		}
	}

	public void brake(){
		speed = 0;
		System.out.println("brake, speed = " + speed);								
	}	
	
}