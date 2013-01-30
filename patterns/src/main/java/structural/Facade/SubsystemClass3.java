package structural.Facade;


/**
 * This class (a) implements subsystem functionality, (b) handles work assigned by
 * the Facade object, and (c) keeps no reference to the facade.
 * @version 1.0
 * @updated 30-jan-2013 16:09:46
 */
public class SubsystemClass3 {

	public SubsystemClass3(){

	}
	
	public String writeSomething() {
		return "I, SubsystemClass3, wrote something";
	}

	public String doSomething(){
		return "I, SubsystemClass3, did something";
	}
}//end SubsystemClass3