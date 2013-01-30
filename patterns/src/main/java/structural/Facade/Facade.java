package structural.Facade;

/**
 * This class (a) knows which subsystem classes are responsible for a request, and
 * (b) delegates client requests to appropriate subsystem objects.
 * @version 1.0
 * @updated 30-jan-2013 16:09:45
 */
public class Facade implements ActionsAll {

	private SubsystemClass2 m_SubsystemClass2;
	private SubsystemClass3 m_SubsystemClass3;
	private SubsystemClass4 m_SubsystemClass4;
	private SubsystemClass6 m_SubsystemClass6;

	public Facade(){
		m_SubsystemClass2 = new SubsystemClass2();
		m_SubsystemClass3 = new SubsystemClass3();
		m_SubsystemClass4 = new SubsystemClass4();
		m_SubsystemClass6 = new SubsystemClass6();
	}
	
	public String doSomething() {
		return m_SubsystemClass2.doSomething();
	}
	
	public String saySomething() {
		return m_SubsystemClass4.saySomething();
	}
	
	public String drawSomething() {
		return m_SubsystemClass6.drawSomething();
		
	}
	
	public String writeSomething() {
		return m_SubsystemClass3.writeSomething();
		
	}

}//end Facade