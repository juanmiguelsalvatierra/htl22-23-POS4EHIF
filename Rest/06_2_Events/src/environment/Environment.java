package environment;
import java.util.ArrayList;
import java.util.List;


 public class Environment {
    
   
	 
// Attribute	
    private int index=0;
    private AccidentListener[] listeners = new AccidentListener[4];  // wichtig - dynamischer Typ AccidentListener!!

    
    

// Listener hinzufügen
    public void addListener(AccidentListener toAdd) {
        listeners[index]=toAdd;
        index++;
        
    }
    
// Listener entfernen    
    public void removeListener() {    // könnte noch ausgefeilter sein!
       if (index>0) {index--;}	
    }
    
    
    
// Event auslösen
    public void setTemperatur(int temperature,int x,int y) {
      if (temperature>100) {						// START EVEN - TODO - HIER KEINE ABFRAGE SONDERN TEMPERATURÄNDERUNG IST EVENT!!
    	  for (AccidentListener hl : listeners)
              hl.fire(x, y);
      }
    }
    

}  // end class
