package creational.Singleton;

/**
 * This class (a) defines an Instance operation that lets clients access its
 * unique instance, and (b) may be responsible for creating its own unique
 * instance.
 * @version 1.0
 * @updated 30-jan-2013 16:09:43
 */
public class Singleton {

	private String singletonData = "Initial";
	
	
	// Private constructor prevents instantiation from other classes
	Singleton(){}
	
	public static Singleton getInstance() {
	    return SingletonHolder.INSTANCE;
	}

	public void setSingletonData(String singletonData){
		this.singletonData = singletonData;
	}
	
	public String getSingletonData(){
		return singletonData;
	}
	
	/**
	 * SingletonHolder is loaded on the first execution of Singleton.getInstance() or
	 * the first access to SingletonHolder.INSTANCE, not before.
	 * @author Joost
	 * @version 0.1
	 * @updated 30-jan-2013 16:09:44
	 */
	private static class SingletonHolder {

		private final static Singleton INSTANCE = new Singleton();

	}
}

