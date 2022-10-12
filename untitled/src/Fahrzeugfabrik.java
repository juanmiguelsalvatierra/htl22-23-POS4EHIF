public class Fahrzeugfabrik {
    static Fahrzeug[][] fahrzeuge = new Fahrzeug[2][50];
    public static void main(String args[]){
        for(int i = 0; i < fahrzeuge.length; i++){
            for(int j = 0; j < fahrzeuge[0].length; j++){
                if(i == 0){
                    fahrzeuge[i][j] = new Fahrzeug("Audi");
                    fahrzeuge[i][j] = add(new Grundausstattung("4 Sitze",1));
                    fahrzeuge[i][j] = add(new Grundausstattung("Hupe",1));
                }
                else{
                    fahrzeuge[i][j] = new Fahrzeug("Fahrrad");
                    fahrzeuge[i][j] = add(new Grundausstattung("Lenkstange",1));
                    fahrzeuge[i][j] = add(new Zubehoer("Klingeö","htm"));
                }
            }
        }
        System.out.println(fahrzeuge[0][0].Ausgabe());
    }
}
