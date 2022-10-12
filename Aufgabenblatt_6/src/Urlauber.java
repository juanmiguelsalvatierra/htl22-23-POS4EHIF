public class Urlauber extends Mensch{
    final String heimatland;
    final int badewettertemp;
    protected Urlauber(String vorname, String nachname, String heimatland, int badewettertemp) {
        super(vorname, nachname);
        this.heimatland = heimatland;
        this.badewettertemp = badewettertemp;
    }


    public void fahreHeim() {
        System.out.println(vorname + " " + nachname + " fährt nach Hause");
    }

    public void geheBaden(){
        System.out.println(vorname + " " + nachname + " geht baden");
    }

    public void eRegen(int regen){
        fahreHeim();
    }

    public void eTemperatur(int temp){
        if(temp >= badewettertemp){
            geheBaden();
        }
    }
}
