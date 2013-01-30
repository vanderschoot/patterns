package structural.Decorator;

/**
 * This class adds responsibilities to the component.
 * @version 1.0
 * @updated 30-jan-2013 16:09:53
 */
public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component decoratedcomponent){
		super(decoratedcomponent);
	}

	public String getDescription(){
		return super.getDescription() + ", including addedBehaviorB";
	}

	public void doSomething() {
		super.doSomething();
		doAdditional();
	}
	
	public void doAdditional(){
		System.out.println("ConcreteDecoratorB did something");
	}
}//end ConcreteDecoratorB