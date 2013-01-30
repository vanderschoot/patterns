package structural.Facade;

public class Client {

	public static Facade m_facade = new Facade();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("call doSomething : " + m_facade.doSomething());
		System.out.println("call drawSomething : " + m_facade.drawSomething());
		System.out.println("call saySomething : " + m_facade.saySomething());
		System.out.println("call writeSomething : " + m_facade.writeSomething());
	}
}
