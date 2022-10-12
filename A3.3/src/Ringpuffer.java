public class Ringpuffer {
    public Kind root = null;

    public void eingabe(Kind k){
        if(root == null){
            root = k;
            return;
        }
        Kind temp = root;
        while(temp.getnext() != null){
            temp = temp.getnext();
        }
        temp.setnext(temp);
    }

    public String ausgabe(){
        String sausgabe = "";
        if(root == null) {
            System.out.println("Es ist keine Liste vorhanden");
        }
        Kind temp = root;
        while(temp.getnext() != null){
            sausgabe += temp.getname();
            temp = temp.getnext();
        }
        return sausgabe;
    }

    public void rutschen(){
        Kind first = root;
        Kind temp =root;
        root=temp.getnext();
        while (temp.getnext() != null){
            temp=temp.getnext();
        }
        temp.setnext(first);
        temp=temp.getnext();
        temp.setnext(null);
    }

    public void loeschen(String name){
        Kind temp=root;
        while (temp.getnext() != null){
            if (temp.getnext().getname().equals(name)){
                temp.setnext(temp.getnext().getnext());
            }
            temp=temp.getnext();
        }
    }

}
