package com.company;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;




public class Haus extends TimerTask {

  // public IEmail []email =new IEmail[20];
   IEmail root;

    public Haus(){
        /*email[0]=new Heizkörper("Heizkörper1");
        email[1]=new Heizkörper("Heizkörper2");
        email[2]=new Wohnzimmerlampe("Wohnzimmerlampe1");
        email[3]=new Wohnzimmerlampe("wohnzimmerlampe2");
        email[4]=new Schlafzimmerlampe("Schlafzimmerlampe1");
        email[5]=new Schlafzimmerlampe("Schlafzimmerlampe2");

        */
        addListener(new Heizkörper("Heizkörper1"));
        addListener(new Heizkörper("Heizkörper2"));
        addListener(new Wohnzimmerlampe("Wohnzimmerlampe1"));
        addListener(new Wohnzimmerlampe("wohnzimmerlampe2"));
        addListener(new Schlafzimmerlampe("Schlafzimmerlampe1"));
        addListener(new Schlafzimmerlampe("Schlafzimmerlampe2"));


        Timer t= new Timer();
        t.schedule(this,0,1000);
    }

    public void addListener(IEmail mail){
        if(root==null){
            root=mail;
        }else{
            root.setNext(root);
        }
    }


    @Override
    public void run() {
        String s=getEmail();

        if(s.equals("NOTSTOPP")){
            Random rnd=new Random(180);

            Timer r = new Timer();
           // r.schedule(null,0,rnd*1000);
            //Thread.sleep(rnd*1000);

            this.cancel();
        }
        if(s.length()<=1){
            System.out.println("Es gibt kein Email oder Email wurde Falsch angegeben");
        }else{
            IEmail temp=root;
            while (temp != null){
                temp.aktionDurchführen(s);
                temp=temp.getNext();
            }

           // for (int i = 0; i < email.length; i++) {
             //   email[i].aktionDurchführen(s);
            //}
        }
    }

    public String getEmail(){
        return "LW1";
    }
}
