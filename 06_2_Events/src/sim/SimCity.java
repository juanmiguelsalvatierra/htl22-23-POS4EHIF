package sim;
import environment.AccidentListener;
import environment.Environment;
import environment.House;
import environment.Person;


public class SimCity  {
    public static void main(String[] args) {
    	
        Environment environment = new Environment();   
        
        House house1 = new House(10,10);
        environment.addListener(house1);   // add house as interested Object on Events from the Environment

        
        House house2 = new House(20,20,environment); // another way to do the same as above
        
        environment.addListener(new Person(5,5));    // another way to do the same as above
        environment.addListener(new Person(50,50));
       
        
        // nothing happende till yet...
        environment.setTemperatur(102,10,10);     // well, 102 degrees in the city ;-)
        
        
    }
}
