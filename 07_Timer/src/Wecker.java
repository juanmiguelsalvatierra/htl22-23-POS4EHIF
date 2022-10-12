import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class Wecker {

	static Timer timer1,timer2;
	static Task task;
	static StopTask stoptask;
	
	
	public static void main(String args[]) throws InterruptedException {
		
		timer1=new Timer();       // UserThread, must be canceled manually!
		timer2=new Timer(true);   // DaemonThread, stops when program has finished
		
		task=new Task();
		stoptask=new StopTask(timer1);
		
		//timer1.schedule(task,1000);
		timer1.schedule(task,0,1000);  // Display date once per second
		timer2.schedule(stoptask,5000); // stop timer1 after 5 seconds
		System.out.println("Fertig");
		
	}
	
	
}
