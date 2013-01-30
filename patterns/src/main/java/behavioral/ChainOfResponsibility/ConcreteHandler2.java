package behavioral.ChainOfResponsibility;

/**
 * This class (a) handles requests it is responsible for, (b) can access its
 * successor, and (c) if it can handle the request, does so, else it forwards it
 * to its successor.
 * @version 1.0
 * @created 30-jan-2013 17:51:31
 */
public class ConcreteHandler2 extends Handler {

	public ConcreteHandler2(){
	}

	public void handleRequest(){
		System.out.println("ConcreteHandler2 does it's job");
	}
}