
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String para1 = "1";
        int para2 = 2;
        String[] addarray = addieren(para1, para2);
        System.out.println("String und Int Addition und jeder Parameter wird am Anfang um den Wert 1 erhöht");
        System.out.println(Arrays.toString(addarray));
        System.out.println(para1 + " + " + para2);


        int[] parameter = new int[]{(3),(4)};
        String[] addarray2 = addieren(parameter);
        System.out.println("Int Array Addition und jeder Parameter wird am Anfang um den Wert 1 erhöht");
        System.out.println(Arrays.toString(addarray2));
        System.out.println(Arrays.toString(parameter));
    }

    public static String[] addieren(String para1, int para2) {
        int paratemp = Integer.parseInt(para1);
        paratemp++;
        para2++;
        int erg = paratemp + para2;
        return new String[]{("String " + paratemp + " + " + " int " + para2), (erg + "")};
    }

    public static String[] addieren(int[] parameter){
        int summe = 0;
        String summestring = "";
        for(int i = 0; i < parameter.length; i++){
            summestring += parameter[i] + " + ";
            parameter[i]++;
            summe += parameter[i];
        }
        return new String[]{(summestring+" "),(summe+" ")};
    }
}
