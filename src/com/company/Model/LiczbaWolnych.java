package com.company.Model;

public class LiczbaWolnych {
    int liczba;

    public LiczbaWolnych(int liczba) {
        this.liczba = liczba;
    }

    public int odejmijW(int liczba) {
        return (liczba - 1);
    }

    public int getLiczba() {
        return liczba;
    }
}