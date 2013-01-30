package structural.Decorator;

/**
 * This class defines an object to which additional responsibilites can be
 * attached.
 * @version 1.0
 * @updated 30-jan-2013 16:09:51
 */
public class ConcreteComponent extends Component {

	public ConcreteComponent(){

	}
	
	public void doSomething() {
		System.out.println("ConcreteComponent did something");		
	}

	public String getDescription(){
		return "ConcreteComponent Description";
	}
}//end ConcreteComponent