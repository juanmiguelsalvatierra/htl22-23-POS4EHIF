import java.util.Scanner;

public class GameControl {

    public Mensch rootM;
    public Pflanze rootP;

    public GameControl(){
        addMensch(new Urlauber("Momo", "Sui", "Österreich", 30));
        addMensch(new Urlauber("Matze", "Nez", "Pol", 18));
        addMensch(new Urlauber("Juan", "Sal", "Filo", 3));

        addMensch(new Polizist("Eren", "Ayn", "HTL Wien-West"));
        addMensch(new Polizist("Alex", "Mat", "HTL Donau"));
        addMensch(new Polizist("Hans", "Sch", "AMS"));

        addMensch(new Feuerwehrmann("Stefan", "Sta", "Zigeu"));
        addMensch(new Feuerwehrmann("Sandra", "Hik", "AT"));
        addMensch(new Feuerwehrmann("Ales", "Mat", "Rus"));

        addPflanze(new Baum("Tree", 25,12,20,6));
        addPflanze(new Baum("Feih", 17,3,13,1));
        addPflanze(new Baum("Reit", 30,7,14,5));
        addPflanze(new Baum("Nadel", 5,5,9,2));

        addPflanze(new Blume("Rose", "Schwarz", 2, 4, 0, 12));
        addPflanze(new Blume("Rose1", "Rot", 4, 4, 1, 18));
        addPflanze(new Blume("Rose2", "Gelb", 6, 10, 2, 21));
        addPflanze(new Blume("Rose3", "Blau", 3, 4, 2, 1));

        start();
    }

    public void start(){
        Mensch tempM = rootM;
        Pflanze tempP = rootP;
        int count = 0;
        Scanner antwort = new Scanner(System.in);
        System.out.println("Wie lange soll die Schleife laufen?");
        Scanner timer = new Scanner(System.in);
        int timert = timer.nextInt();
        while(timert < count){
            System.out.println("Geben Sie die Regenmenge ein (cm)");
            Scanner regenmenge = new Scanner(System.in);
            int rmenge = regenmenge.nextInt();

            System.out.println("Geben Sie die Temperaturaenderung ein (Grad)");
            Scanner temperatur = new Scanner(System.in);
            int tempe = temperatur.nextInt();

            while (tempM != null) {
                tempM.eRegen(rmenge);
                tempM.eTemperatur(tempe);
                tempM = tempM.getNext();
            }

            while (tempP != null) {
                tempP.eRegen(rmenge);
                tempP.eTemperatur(tempe);
                tempP = tempP.getNext();
            }

            count++;
        }
    }

    public void addMensch(Mensch m){
        if (rootM == null){
            rootM = m;
        }
        Mensch temp = rootM;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(m);
    }

    public void addPflanze(Pflanze p){
        if (rootP == null){
            rootP = p;
        }
        Pflanze temp = rootP;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(p);
    }
}
