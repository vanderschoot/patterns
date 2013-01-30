package structural.Facade;


/**
 * This class (a) implements subsystem functionality, (b) handles work assigned by
 * the Facade object, and (c) keeps no reference to the facade.
 * @version 1.0
 * @updated 30-jan-2013 16:09:47
 */
public class SubsystemClass5 {

	public SubsystemClass5(){

	}

	public String drawSomething() {
		return "I, SubsystemClass5, drew something";
	}
	
	public void finalize() throws Throwable {

	}

	public String doSomething(){
		return "I, SubsystemClass5, did something";
	}
}//end SubsystemClass5