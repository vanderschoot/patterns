package creational.AbstractFactory;

/**
 * This class declares an interface for operations that create abstract product
 * objects.
 * @version 1.0
 * @created 30-jan-2013 16:57:58
 */
public abstract class AbstractFactory {

	public AbstractFactory(){

	}

	public abstract AbstractProductA CreateProductA();

	public abstract AbstractProductB CreateProductB();
}