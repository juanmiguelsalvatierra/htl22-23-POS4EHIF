import java.util.Timer;
import java.util.TimerTask;



public class StopTask extends TimerTask {

	
	private Timer timer1;
		
	StopTask(Timer timer1) {
		this.timer1=timer1;
	}
	
	@Override
	public void run() {
		System.out.println("Die Zeit ist um!");
		timer1.cancel();
		
		
	}
	
}
