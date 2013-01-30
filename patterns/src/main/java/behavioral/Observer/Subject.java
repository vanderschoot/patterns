package behavioral.Observer;

/**
 * This class knows its observers and provides an interface for attaching and
 * detaching Observer objects.
 * @author Joost
 * @version 1.0
 * @updated 30-jan-2013 16:09:58
 */
public class Subject {

	  private Observer[] observers = new Observer[9];
	  private int totalObs = 0;
	  private int state;
	  
	  public void attach( Observer o ) {
	    observers[totalObs++] = o;
	  }

	  public int getState() {
	    return state;
	  }
	  
	  public void setState( int in ) {
	    state = in;
	    notifyObservers();
	  }

	  private void notifyObservers() {
	    for (int i=0; i < totalObs; i++) {
	      observers[i].update();
	    }
	  }
}//end Subject