package com.company;

import com.company.Model.Gra;
import com.company.Model.Gracz;
import com.company.Model.listaGraczy;
import com.company.Widok.Dodatek;
import com.company.Widok.Wyswietlacz;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Wyswietlacz w = new Wyswietlacz();
        listaGraczy lista = new listaGraczy();
        lista.sortArray();
        lista.wyswietlPosortowane();

}
}
