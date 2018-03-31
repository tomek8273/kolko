package com.company.Model;

import java.util.Random;

public class Gracz {

String imie;
int wynik;
int numerGracza;


    public Gracz(int numerGracza) {
        this.imie = imie;
        Random r = new Random();
        wynik = r.nextInt(50);
        this.numerGracza = numerGracza;
    }

    public String getImie() {
        return imie;
    }

    public int getWynik() {
        return wynik;
    }

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }
}


