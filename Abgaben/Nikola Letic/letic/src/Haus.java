import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Haus extends TimerTask {
    private IEmailaufgabe[] interessenten = new IEmailaufgabe[20];
    private int anzinteresse=0;
    private Boolean runtf=true;
    private String email;
    private Scanner sc = new Scanner(System.in);
    private Timer emailchecker;
    private int emailcheckcounter=0, endcounter=-1;
    public Haus(){
        //alle sind standartmäßig auf false, bzw aus
        AddListener(new Heizung("Heizung 1"));
        AddListener(new Heizung("Heizung 2"));
        AddListener(new Wohnzimmerlampe("WZL 1"));
        AddListener(new Wohnzimmerlampe("WZL 2"));
        AddListener(new Schlafzimmerlampe("SZL 1"));
        AddListener(new Schlafzimmerlampe("SZL 2"));
        emailchecker = new Timer();
        emailchecker.schedule(this,0,1000);
//        System.out.println("Nun kann eine Aufgabe per Mail gesedet werden, NUR EINE PRO AUFGABE, wenn geändert wird ist es die letzte angegebene");
//        while(runtf){
//            email=sc.nextLine();
//        } hier könnte der User seine Mails "senden"

    }

    @Override
    public void run() {
        emailcheckcounter++; //counter der mitzählt wann die mail gecheckt werden soll
        if(endcounter!=-1){
            endcounter--;
        }
        if(endcounter==0){
            System.out.println("");
            runtf=false;
            emailchecker.cancel();
            // System.exit(0); ist da um die Eingabemöglichkeit des Users zu beenden
        }
        if(emailcheckcounter==4){  //Aufgabe 5 alle 4 Sekunden rein aka Timer ruft alle 4 sekunden getmail auf
            emailcheckcounter=0;
            String todo=getEmail();
            if(!todo.equals("")){
                if(todo.equals("NOTSTOP")){
                    if(endcounter==-1){
                        Random rn = new Random();
                        endcounter= 59+rn.nextInt(122); // 122 und 59 weil rn ab 1 beginnt und 121 das max für 180 sein muss
                        endcounter=10; //zu, testen auf 10 gesetzt
                        System.out.println("SIMULATION ENDET IN " + endcounter + " SEKUNDEN");
                    }
                }else{
                    System.out.println("*************EMAIL: " + todo + " wird gesendet****************");
                    for (int i = 0; i < interessenten.length; i++) {
                        if(interessenten[i]!=null) {
                            interessenten[i].Aufgabe(todo);
                        }
                    }
                }

            }
            else{
                System.out.println("Emailfach leer!");
            }
        }

    }

    //testing var für aufgabe 5
    private String[] mails = {"L1","L0","LW1","LW0","LS1","LS0","H1","H0", "hallooo", "", "NOTSTOP"};
    private int x=0;

    public String getEmail(){
        String mail= mails[x];
        x++;
        if(x == mails.length)
        {
            x=0;
        }
        return mail;
    }
    public void AddListener(IEmailaufgabe o){
        if(anzinteresse==20){
            System.out.println("Maximale Anzahl an Hausgegenständen erreicht");
        }else{
            interessenten[anzinteresse]=o;
            anzinteresse++;
        }
    }
}
