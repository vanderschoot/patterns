package creational.AbstractFactory;

/**
 * This class uses only interfaces declared by AbstractFactory and AbstractProduct
 * classes.
 * @version 1.0
 * @created 30-jan-2013 16:58:29
 */
public class Client {

	public static AbstractProductB m_AbstractProductB;
	public static AbstractProductA m_AbstractProductA;
	public static AbstractFactory m_AbstractFactory;

	public static void main(String[] args) {
	
		m_AbstractFactory = new ConcreteFactory1();
		
		m_AbstractProductA = m_AbstractFactory.CreateProductA();
		m_AbstractProductA.whoAmI();

		m_AbstractProductB = m_AbstractFactory.CreateProductB();
		m_AbstractProductB.whoAmI();

		m_AbstractFactory = new ConcreteFactory2();
		
		m_AbstractProductA = m_AbstractFactory.CreateProductA();
		m_AbstractProductA.whoAmI();

		m_AbstractProductB = m_AbstractFactory.CreateProductB();
		m_AbstractProductB.whoAmI();

		
	}

}