package creational.AbstractFactory;

/**
 * This class (a) defines a product object to be created by the corresponding
 * concrete factory, and (b) implements the AbstractProduct interface.
 * @version 1.0
 * @created 30-jan-2013 16:58:13
 */
public class ProductA2 extends AbstractProductA {

	public ProductA2(){

	}

	public void whoAmI() {
		System.out.println("I am product A2");
	}

}