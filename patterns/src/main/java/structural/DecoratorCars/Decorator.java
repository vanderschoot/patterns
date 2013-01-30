package structural.DecoratorCars;

/**
 * This class maintains a reference to a Component object and defines an interface
 * that conforms to Component's interface.
 * @author Joost
 * @version 1.0
 * @updated 30-jan-2013 16:09:57
 */
public abstract class Decorator implements Car {

	protected Car m_Component;
	
	public Decorator(Car decoratedcomponent){
		this.m_Component = decoratedcomponent;
	}
	
	public void throttle() {
		m_Component.throttle();
	}
	
	public void slowdown() {
		m_Component.slowdown();
	}

	public void startengine() {
		m_Component.startengine();
	}
	
	public void stopengine() {
		m_Component.stopengine();
	}

	public void brake() {
		m_Component.brake();
	}

}