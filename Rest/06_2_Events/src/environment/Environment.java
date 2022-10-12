package environment;
import java.util.ArrayList;
import java.util.List;


 public class Environment {
    
   
	 
// Attribute	
    private int index=0;
    private AccidentListener[] listeners = new AccidentListener[4];  // wichtig - dynamischer Typ AccidentListener!!

    
    

// Listener hinzuf�gen
    public void addListener(AccidentListener toAdd) {
        listeners[index]=toAdd;
        index++;
        
    }
    
// Listener entfernen    
    public void removeListener() {    // k�nnte noch ausgefeilter sein!
       if (index>0) {index--;}	
    }
    
    
    
// Event ausl�sen
    public void setTemperatur(int temperature,int x,int y) {
      if (temperature>100) {						// START EVEN - TODO - HIER KEINE ABFRAGE SONDERN TEMPERATUR�NDERUNG IST EVENT!!
    	  for (AccidentListener hl : listeners)
              hl.fire(x, y);
      }
    }
    

}  // end class
