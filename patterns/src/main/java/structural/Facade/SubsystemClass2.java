package structural.Facade;


/**
 * This class (a) implements subsystem functionality, (b) handles work assigned by
 * the Facade object, and (c) keeps no reference to the facade.
 * @version 1.0
 * @updated 30-jan-2013 16:09:46
 */
public class SubsystemClass2 implements ActionDo {

	public SubsystemClass2(){

	}
	
	public String doSomething() {
		return "I, SubsystemClass2, did something";
	}
}//end SubsystemClass2