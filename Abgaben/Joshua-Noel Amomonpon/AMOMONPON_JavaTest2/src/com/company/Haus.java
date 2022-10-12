package com.company;

import java.util.Random;
import java.util.TimerTask;

public class Haus extends TimerTask {
    private int counter60 = 0;
    private int counterRandom;
    private int random = 0;
    private int countermail = 0;
    IEvent root = null;
    Random rnd = new Random();

    public void addListener(IEvent o){ //addListener für die Interessenten
        if (root == null){
            root = o;
        }else{
            if (o instanceof Wohnzimmerlampe){
                Wohnzimmerlampe tmp = (Wohnzimmerlampe)o;
                tmp.setNext(root);
            }
            if (o instanceof Schlafzimmerlampe){
                Schlafzimmerlampe tmp = (Schlafzimmerlampe)o;
                tmp.setNext(root);
            }
            if (o instanceof Heizkörper){
                Heizkörper tmp = (Heizkörper)o;
                tmp.setNext(root);
            }
            root = o;
        }
    }

    @Override
    public void run() { // Hier führen wie die Events aus
        String mail = getMail();
        IEvent temp = root;
        if(counter60 == 4 || !mail.equals(null) ){ // Falls 4 sekunden vergangen  und eine nachricht vorhanden ist
            if(root == null){
                System.out.println("Keine Interessenten vorhanden!");
                return;
            }else{
                while(temp !=null){ // Liste durchgehen um die Nachricht an die Haushaltsgeräte zu schicken
                    if (temp instanceof Wohnzimmerlampe){
                        Wohnzimmerlampe tmp = (Wohnzimmerlampe)temp;
                        tmp.sendNotification(mail);
                    }
                    if (temp instanceof Schlafzimmerlampe){
                        Schlafzimmerlampe tmp = (Schlafzimmerlampe)temp;
                        tmp.sendNotification(mail);

                    }
                    if (temp instanceof Heizkörper){
                        Heizkörper tmp = (Heizkörper)temp;
                        tmp.sendNotification(mail);
                    }
                    temp = temp.getNext();
                }
            }
            counter60 = 0; // Zurück setzten sodass die nächsten 4 Sekunden wieder was machen
        }

        /*if(getMail().equals("NOSTOP")){
            random = rnd.nextInt(120+60);
        }

        if (random == counterRandom){ // Hier hört der Timer auf
            // Timer cancel
        }         */

        counterRandom++;
        counter60++;
    }


    public String getMail(){ //getMail Methode mit fixem Return wert, erweitert für 4 sekunden abstände

        return "L1";

        /* switch (countermail){
            case 0:
                countermail++;
                return "L1";

            case 4:
                countermail++;
                return "L0";

            case 8:
                countermail++;
                return "LW1";

            case 12:
                countermail++;
                return "LW0";

            case 16:
                countermail++;
                return "LS1";

            case 20:
                countermail++;
                return "LS0";

            case 24:
                countermail++;
                return "H1";

            case 28:
                countermail = 0;
                return "H0";

            default:
                return "L1";
        }*/
    }
}
