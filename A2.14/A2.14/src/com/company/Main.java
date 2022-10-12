package com.company;

import java.io.*;
import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br =  null;

        try{
            FileReader fr = new FileReader(args[0]);
            br = new BufferedReader(fr);
        }
        catch(FileNotFoundException e) {
            System.out.println("Datei nicht vorhanden\n");

            String dateiName = "";
            while(!dateiName.equals("ende")){
                System.out.print("Bitte geben Sie den Dateinamen ein :");

                Scanner sc = new Scanner(System.in);
                dateiName =  sc.next();

                try{
                    FileReader fr = new FileReader(dateiName);
                    br = new BufferedReader(fr);
                    break;
                }
                catch(FileNotFoundException exception){
                    System.out.println("Datei nicht vorhanden\n");
                }
            }
        }

        String line="";
        String[] lineArray;
        PrintStream out = new PrintStream("Ergebnis.txt");
        double ergebnis;

        try{
            line = br.readLine();
            while(!line.equals(null)){
                lineArray = line.split(",");

                switch (lineArray[2]){
                    case "+":
                        ergebnis = Integer.parseInt(lineArray[1])+Integer.parseInt(lineArray[3]);
                        out.println(lineArray[1]+"+"+lineArray[3]+"="+ergebnis);
                        break;
                    case "-":
                        ergebnis = Integer.parseInt(lineArray[1])-Integer.parseInt(lineArray[3]);
                        out.println(lineArray[1]+"-"+lineArray[3]+"="+ergebnis);
                        break;
                    case "*":
                        ergebnis = Integer.parseInt(lineArray[1])*Integer.parseInt(lineArray[3]);
                        out.println(lineArray[1]+"*"+lineArray[3]+"="+ergebnis);
                        break;
                    case "/":
                        ergebnis = Integer.parseInt(lineArray[1])/Integer.parseInt(lineArray[3]);
                        out.println(lineArray[1]+"/"+lineArray[3]+"="+ergebnis);
                }
                line = br.readLine();
            }
        }
        catch(Exception e){
            if(line.equals(null)){
                System.out.println("Keine Daten mehr vorhanden");
            }else{
                System.out.println("In der Zeile "+line.split(",")[0]+" ist die Syntax falsch");
            }
        }
    }
}
