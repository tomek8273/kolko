package com.company.Model;

import javax.swing.*;
import java.util.ArrayList;

public class Pole extends JButton{
    boolean zajete = false;
    String symbol;

    public Pole(String symbol) {
        this.symbol = symbol;
    }

    public Pole() {
        super();
    }

    public void poleZajete (){
        this.zajete = true;
    }

    public void poleWolne (){
        this.zajete = false;
    }

    public boolean isZajete() {
        return zajete;
    }

    public void setZajete(boolean zajete) {
        this.zajete = zajete;
    }
}
