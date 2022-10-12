public class Fahrzeug {
    public String modellName;
    Fahrzeugteil root = null;

    public Fahrzeug(String modellName){
        this.modellName = modellName;
    }

    public void add(Fahrzeugteil a){
        if(root == null){
            root = a;
            return;
        }
        a.next = root;
        root = a;
    }

    public void Ausgabe(){
        System.out.println(modellName);
        Fahrzeugteil tmp = root;
        String art = "";
        while(tmp.next != null){
            if (tmp instanceof Zubehoer){
                art="Zubehoer";
            }
            if (tmp instanceof Grundausstattung){
                art="Grundausstattung";
            }
            System.out.println(art + ";" + tmp.getInfo());
            tmp = tmp.next;
        }
    }
}
