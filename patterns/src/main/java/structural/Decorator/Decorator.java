package structural.Decorator;

/**
 * This class maintains a reference to a Component object and defines an interface
 * that conforms to Component's interface.
 * @version 1.0
 * @updated 30-jan-2013 16:09:52
 */
public abstract class Decorator extends Component {

	protected Component m_Component;
	
	public Decorator(Component decoratedcomponent){
		this.m_Component = decoratedcomponent;
	}
	
	public void doSomething() {
		m_Component.doSomething();
	}

	public String getDescription(){
		return m_Component.getDescription();
	}
}//end Decorator