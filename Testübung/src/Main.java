import java.util.Random;

public class Main {

    public static void Main(String args[]){
        Boolean[][] brett = new Boolean[8][8];
        Random rnd = new Random();

        for(int i = 0; i < brett.length; i++){
            for(int j = 0; j < brett.length; j++){
                brett[i][j] = rnd.nextBoolean();
            }
        }

        Dame d = new Dame(0, 8);

    }

    public void maxAbstand(boolean[][] brett, Dame d){
        int distanz = 0;
        int xmax = 0;
        int ymax = 0;
        for (int i = 0; i < brett.length; i++){
            for(int j = 0; j < brett.length; j++){
                if(brett[i][j]){
                    xmax = i;
                    ymax = j;
                }
            }
        }
    }
}
