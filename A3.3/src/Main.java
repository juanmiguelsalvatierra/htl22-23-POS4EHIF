public class Main {

    public static void main(String[] args){
        Ringpuffer r = new Ringpuffer();
        for (int i = 0; i < 5; i++){
            r.eingabe(new Kind("kind" + i));
        }

        System.out.println(r.ausgabe());
    }
}
