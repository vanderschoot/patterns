package structural.DecoratorCars;

public class Client {
	
	static Car basicCar;
	static Car turboCar;
	static Car luxCar;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Drive Basic Car:");	System.out.println("----------------");					
        basicCar = new BasicCar(); 
        basicCar.startengine();
        basicCar.throttle();
        basicCar.throttle();
        basicCar.throttle();
        basicCar.slowdown();
        basicCar.slowdown();
        basicCar.brake();
        basicCar.stopengine();
 
		System.out.println("Drive Turbo Car:");	System.out.println("----------------");					
        turboCar = new SpeedDecorator (new BasicCar()); 
        turboCar.startengine();
        turboCar.throttle();
        turboCar.throttle();
        turboCar.throttle();
        turboCar.slowdown();
        turboCar.slowdown();
        turboCar.brake();
        turboCar.stopengine();

		System.out.println("Drive Luxe Car:");	System.out.println("----------------");					
        luxCar = new SpeedDecorator (new LightsDecorator(new BasicCar())); 
        luxCar.startengine();
        luxCar.throttle();
        luxCar.throttle();
        luxCar.throttle();
        luxCar.slowdown();
        luxCar.slowdown();
        luxCar.brake();
        luxCar.stopengine();

        
        
	}
}
