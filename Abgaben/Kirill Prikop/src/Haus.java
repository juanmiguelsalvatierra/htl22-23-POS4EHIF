import java.util.Random;
import java.util.TimerTask;

public class Haus extends TimerTask implements IEmail{

    private int countSek=0;
    Haus root;

    String code="L1";

    public void addListener(Haus listener){
        if(root==null){
            listener=root;
        }
        else{

        }
    }

    @Override
    public void run() {
        countSek++;
        if(countSek==60){
            getEmail(code);
        }
    }

    @Override
    public String getEmail(String code) {
        float count;
        Random rn = new Random();
        if(code!=null){
            if(code=="NOTSTOP"){
                count=rn.nextFloat(60,180);

            }
        }
        return code;
    }
}
