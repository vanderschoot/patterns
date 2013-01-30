package structural.Decorator;

/**
 * This class defines the interface for objects that can have responsibilities
 * added to them dynamically.
 * @version 1.0
 * @updated 30-jan-2013 16:09:51
 */
public abstract class Component {

	public abstract void doSomething();

	public abstract String getDescription();

	public Component(){

	}

}