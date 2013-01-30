package creational.AbstractFactory;

/**
 * This class implements the operations to create concrete product objects.
 * @version 1.0
 * @created 30-jan-2013 16:58:05
 */
public class ConcreteFactory2 extends AbstractFactory {

	public ConcreteFactory2(){

	}

	public AbstractProductA CreateProductA(){
		return new ProductA2();

	}

	public AbstractProductB CreateProductB(){
		return new ProductB2();

	}
}