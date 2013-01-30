package behavioral.ChainOfResponsibility;

/**
 * This class defines an interface for handling requests and optionally implements
 * the successor link.
 * @version 1.0
 * @created 30-jan-2013 17:51:25
 */
public abstract class Handler {

	protected Handler next;
	
	public Handler(){
	}
	
	public void setNext(Handler h) {
        next = h;
    }
	
	public void handle() {
		handleRequest();
        if (next != null) {
            next.handle();
        }
	}
	
	public abstract void handleRequest();
}