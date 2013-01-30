package structural.Decorator;

/**
 * This class adds responsibilities to the component.
 * @version 1.0
 * @updated 30-jan-2013 16:09:52
 */
public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component decoratedcomponent){
		super(decoratedcomponent);
	}

	public String getDescription(){
		return super.getDescription() + ", including addedBehaviorA";
	}

	public void doSomething() {
		super.doSomething();
		doAdditional();
	}
	
	public void doAdditional(){
		System.out.println("ConcreteDecoratorA did something");
	}
}//end ConcreteDecoratorA