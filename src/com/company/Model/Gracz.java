package com.company.Model;

public class Gracz {

int numerGracza;

    public Gracz() {
    }

    public int zmianaGracza(int numerGracza){
        if (numerGracza == 1){
            System.out.println("Zmienilem gracza na 2");
            return 2;
        }

        if (numerGracza == 2){
            System.out.println("Zmienilem gracza na 1");
            return 1;}
            else {
            return 1;
        }
    }
}


