package structural.DecoratorCars;

/**
 * This class adds responsibilities to the component.
 * @author Joost
 * @version 1.0
 * @updated 30-jan-2013 16:09:56
 */
public class SpeedDecorator extends Decorator {

	public SpeedDecorator(Car decoratedCar){
		super(decoratedCar);
	}

	public void throttle() {
		System.out.println("Turbo double speed");								
		super.throttle();
		super.throttle();
	}

	public void slowdown() {
		System.out.println("Turbo double slow down!!!");								
		super.slowdown();
		super.slowdown();		
	}

	public void startengine() {
		System.out.println("Turbo switched on!!!");								
		super.startengine();
	}

	public void stopengine() {
		super.stopengine();
	}

	public void brake() {
		super.brake();
	}

}