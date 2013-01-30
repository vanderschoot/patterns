package behavioral.Observer;

/**
 * This class maintains a reference to a ConcreteSubject object, stores state that
 * should stay consistent with the subject's and implements the Observer updating
 * interface to keep its state consistent with the subject's.
 * @author Joost
 * @version 1.0
 * @updated 30-jan-2013 16:09:59
 */
public class ConcreteObserverA implements Observer {

	private Subject subj;
	
	public ConcreteObserverA(Subject s){
		subj = s;
		subj.attach(this);
	}

	public void update() {
		System.out.print( "Observed by ConcreteObserverA : " + subj.getState());
	}
}