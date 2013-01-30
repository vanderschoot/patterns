package creational.Singleton;

public class Client {
	public static Singleton m_Singleton;


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		m_Singleton = Singleton.getInstance();
		
		System.out.println("created singleton, data = " + m_Singleton.getSingletonData());
		System.out.println("set singleton data");
		m_Singleton.setSingletonData("Version2");
		System.out.println("get singleton, data = " + m_Singleton.getSingletonData());
	}

}
