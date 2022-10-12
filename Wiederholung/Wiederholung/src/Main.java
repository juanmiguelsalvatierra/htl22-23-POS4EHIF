public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Liste list = new Liste();


        tree.add_rekursiv(5);
        tree.add_rekursiv(1);
        tree.add_rekursiv(10);
        tree.add_rekursiv(20);
        tree.add_rekursiv(8);
        tree.add_rekursiv(4);
        tree.add_rekursiv(50);
        tree.add_rekursiv(40);
        tree.add_rekursiv(0);
        //System.out.println(tree.countNodes());
        //System.out.println(tree.countLeaves());
        System.out.println(tree.countNodesonLevelN(-1));
        //tree.ausgabe();

        list.add(new Kugel(4));
        list.add(new Kugel(5));
        list.add(new Kugel(3));
        list.add(new Kugel(1));

        //list.out();
    }
}
