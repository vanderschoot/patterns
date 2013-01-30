package structural.DecoratorCars;

/**
 * This class defines the interface for objects that can have responsibilities
 * added to them dynamically.
 * @author Joost
 * @version 1.0
 * @updated 30-jan-2013 16:09:55
 */
public interface Car {

	public abstract void startengine();
	public abstract void stopengine();
	public abstract void throttle();
	public abstract void slowdown();
	public abstract void brake();
}