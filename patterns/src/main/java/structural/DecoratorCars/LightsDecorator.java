package structural.DecoratorCars;

/**
 * This class adds responsibilities to the component.
 * @author Joost
 * @version 1.0
 * @updated 30-jan-2013 16:09:56
 */
public class LightsDecorator extends Decorator {

	private boolean lighton;
	
	public LightsDecorator(Car decoratedcomponent){
		super(decoratedcomponent);
		lighton = false;
	}
	
	public void startengine() {
		super.startengine();
		System.out.println("Lights switched on");					
		lighton = true;
	}

	public void stopengine() {
		super.stopengine();
		System.out.println("Lights switched off");					
		lighton = false;
	}

}