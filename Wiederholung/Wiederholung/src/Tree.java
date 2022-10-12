import java.nio.file.NotDirectoryException;

public class Tree {
    Node root;


    public void add_rekursiv(int data){
        if(root == null)
            root = new Node(data);
        else
            add_rekursiv(root, data);
    }

    private void add_rekursiv(Node n, int data){
        if(data < n.data){
            if(n.left == null){
                n.left = new Node(data);
            }else{
                add_rekursiv(n.left, data);
            }
        }else{
            if(n.right == null)
                n.right = new Node(data);
            else
                add_rekursiv(n.right, data);
        }
    }

    public void ausgabe(Node n){
        if(n!=null){
            ausgabe(n.left);
            ausgabe(n.right);
            System.out.println(n.data);
        }
    }
    public void ausgabe(){
        //ausgabe(root);
        root.ausgabe();
    }
    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(Node n) {
        if (n != null) {
            return countNodes(n.left) + countNodes(n.right) + 1;
        }

        return 0;
    }
    public int countLeaves() {
        return countLeaves(root);
    }
    public int countNodesonLevelN(int level) {
        return countNodesonLevelN(root, level, 0);
    }

    private int countLeaves(Node n) {
        if (n != null && n.left==null && n.right==null) {
            return 1;
        }else if(n != null){
           return 0 + countLeaves(n.left) + countLeaves(n.right);
        }
        return 0;
    }


    private int countNodesonLevelN(Node n, int level, int aktLevel) {
        if (n != null && level == aktLevel) {
            return 1;
        }else if(n != null){
            return countNodesonLevelN(n.left, level, aktLevel+1) + countNodesonLevelN(n.right, level, aktLevel+1);
        }
        return 0;
    }

}
