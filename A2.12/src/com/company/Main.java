package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] name = args;

        String temp = name[name.length-1]+", "+name[0]+" ";

        for (int i =1;i< name.length-1;i++){
            temp+=name[i].substring(0,1) +". ";
        }

        System.out.println(temp);
    }
}
