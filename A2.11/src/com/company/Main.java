package com.company;

public class Main {

    public static void main(String[] args) {

        String email = "max-mustermann@studierende-uni-vienna-ac-at";

        String[] emailsplit = email.split("@");

        String newEmail = emailsplit[1];

        System.out.println(newEmail);
    }
}
