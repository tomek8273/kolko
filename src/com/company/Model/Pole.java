package com.company.Model;

import java.util.ArrayList;

public class Pole {
    boolean zajete = false;
    String symbol;

    public Pole(String symbol) {
        this.symbol = symbol;
    }

    public void poleZajete (Pole pole){
        this.zajete = true;
    }

    public String getSymbol() {
        return symbol;
    }
}
