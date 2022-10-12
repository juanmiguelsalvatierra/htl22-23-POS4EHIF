import java.sql.SQLOutput;

public class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }

    public void ausgabe(){
        //prefix
        System.out.println(data);
        if (left!=null){
            left.ausgabe();
        }
        if (right!=null){
            right.ausgabe();
        }
    }
}
