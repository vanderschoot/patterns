package structural.Decorator;

public class Client {
	
	static Component decoratedComponent;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        // create a decorated Window with horizontal and vertical scrollbars
        decoratedComponent = new ConcreteDecoratorA (
        						new ConcreteDecoratorB(
        							new ConcreteComponent()));
 
        // print the Components description
        System.out.println("call doSomething()");
        decoratedComponent.doSomething();
        
        System.out.println("call getDescription()");
        System.out.println(decoratedComponent.getDescription());
	}
}
