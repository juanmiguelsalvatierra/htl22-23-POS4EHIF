public class Kugel {
    public int wert;
    public Kugel next;

    public Kugel(int wert){
        this.wert = wert;
    }

    public void add(Kugel k){
        if (this.next == null){
            this.next = k;
        }
        else next.add(k);
    }

    public void out(){
        //System.out.println(wert);
        if(next != null){
            next.out();
        }
        System.out.println(wert);
    }
}
