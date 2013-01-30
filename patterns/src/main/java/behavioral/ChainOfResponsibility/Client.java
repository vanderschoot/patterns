package behavioral.ChainOfResponsibility;

/**
 * This class initiates the request to a ConcreteHandler object on the chain.
 * @version 1.0
 * @created 30-jan-2013 17:51:35
 */
public class Client {

	public static ConcreteHandler1 h1;
	public static ConcreteHandler2 h2;
	public static ConcreteHandler3 h3;
	public static ConcreteHandler4 h4;

	public static void main(String[] args) {
		
		h1 = new ConcreteHandler1();
		h2 = new ConcreteHandler2();
		h1.setNext(h2);
		h3 = new ConcreteHandler3();
		h2.setNext(h3);
		h4 = new ConcreteHandler4();
		h3.setNext(h4);
		
		h1.handle();
	}

}