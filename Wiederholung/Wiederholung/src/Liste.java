public class Liste {
    public Kugel root;
    Kugel temp = root;


    public void add(Kugel k){
        if(root == null){
            this.root = k;
        }else{
            root.add(k);
        }
    }

    public void out(){
        if(root == null){
            System.out.println("keine elemente");
        }else{
            root.out();
        }
    }


    public void add(Kugel k, int i){
        if (root == null){
            root = new Kugel(i);
        }
        else
        if(k.next == null){
            k.next = new Kugel(i);
        } else {
            add(k.next, i);
        }
    }
}
