package creational.AbstractFactory;

/**
 * This class implements the operations to create concrete product objects.
 * @version 1.0
 * @created 30-jan-2013 16:58:02
 */
public class ConcreteFactory1 extends AbstractFactory  {

	public ConcreteFactory1(){

	}

	public AbstractProductA CreateProductA(){
		return new ProductA1();

	}

	public AbstractProductB CreateProductB(){
		return new ProductB1();

	}
}