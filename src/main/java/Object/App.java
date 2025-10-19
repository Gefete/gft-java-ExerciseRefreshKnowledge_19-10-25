package Object;

import Vehicles.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Car car1 = new Car();
    	
    	car1.mostrarInfo();
    	
    	car1.setMark("Ford");
    	car1.setModel("Fiesta");
    	car1.setOwnership(true);
    	car1.setWheels(4);
    	
    	car1.mostrarInfo();
    }
}
