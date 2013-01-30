package behavioral.Observer;

public class Client {
	
	private static Subject sub;
	private static ConcreteObserverA observerA;
	private static ConcreteObserverB observerB;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	    sub = new Subject();
	    // Client configures the number and type of Observers
	    observerA = new ConcreteObserverA( sub );
	    observerB = new ConcreteObserverB( sub );
	    
	    sub.setState(100);
	    
	}
}
