package behavioral.ChainOfResponsibility;

/**
 * This class (a) handles requests it is responsible for, (b) can access its
 * successor, and (c) if it can handle the request, does so, else it forwards it
 * to its successor.
 * @version 1.0
 * @created 30-jan-2013 17:51:31
 */
public class ConcreteHandler3 extends Handler {

	public ConcreteHandler3(){
	}

	public void handleRequest(){
		System.out.println("ConcreteHandler3 does it's job");
	}
}