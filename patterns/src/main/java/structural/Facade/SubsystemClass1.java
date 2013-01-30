package structural.Facade;


/**
 * This class (a) implements subsystem functionality, (b) handles work assigned by
 * the Facade object, and (c) keeps no reference to the facade.
 * @version 1.0
 * @updated 30-jan-2013 16:09:45
 */
public class SubsystemClass1 {

	public SubsystemClass1(){

	}
	
	public String saySomething() {
		return "I, SubsystemClass1, said something";
	}

	public String doSomething(){
		return "I, SubsystemClass1, did something";
	}
}//end SubsystemClass1