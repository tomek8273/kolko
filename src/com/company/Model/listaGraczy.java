package com.company.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class listaGraczy {

    ArrayList<Gracz> lista = new ArrayList<>();
    public listaGraczy() {
        for (int i=0;i<20;i++){
            lista.add(new Gracz(i));
        }

        for (int i=0;i<20;i++){
            System.out.println("Oto element listy numer - "+i+" - "+lista.get(i).getWynik());
        }
    }

    public void sortArray () {
        int rozmiar = lista.size();
        for (int j = 0; j < rozmiar; j++) {
            for (int i = 1; i < rozmiar-j; i++) {
                int temp = 0;
                if (lista.get(i - 1).getWynik() > lista.get(i).getWynik()) {
                    temp = lista.get(i - 1).getWynik();
                    lista.get(i - 1).setWynik(lista.get(i).getWynik());
                    lista.get(i).setWynik(temp);
                }
            }
            wyswietlPosortowane();
        }
    }

    public void wyswietlPosortowane(){
        System.out.println("Oto wynik sortowania");
        for (int i=0;i<20;i++){
            System.out.print(+lista.get(i).getWynik()+"   ");
        }
    }
}
