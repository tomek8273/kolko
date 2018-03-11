package com.company.Widok;

import com.company.Model.Gracz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class Wyswietlacz implements ActionListener {

    JPanel panel;
    JFrame ramka;

    JButton b11;
    JButton b12;
    JButton b13;
    JButton b21;
    JButton b22;
    JButton b23;
    JButton b31;
    JButton b32;
    JButton b33;
    //public int numerGracza = 1;
    int numerGracza;

    String StanGry[][];

    public Wyswietlacz() {
        ramkaSet();
        buttonSet();
        actionListeneradd();
        numerGracza = 1;
    }

    public void buttonSet() {
        b11 = new JButton(" ");
        b12 = new JButton(" ");
        b13 = new JButton(" ");
        b21 = new JButton(" ");
        b22 = new JButton(" ");
        b23 = new JButton(" ");
        b31 = new JButton(" ");
        b32 = new JButton(" ");
        b33 = new JButton(" ");

        panel.add(b11);
        panel.add(b12);
        panel.add(b13);
        panel.add(b21);
        panel.add(b22);
        panel.add(b23);
        panel.add(b31);
        panel.add(b32);
        panel.add(b33);

    }

    public void actionListeneradd() {

        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b31.addActionListener(this);
        b32.addActionListener(this);
        b33.addActionListener(this);
    }

    public void ramkaSet() {
        ramka = new JFrame("GRA");
        panel = new JPanel();
        ramka.add(panel);
        ramka.setVisible(true);
        ramka.setSize(500, 500);
       panel.setLayout(new GridLayout(3, 3));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Wcisnales przycisk");
        System.out.println("Oto numer gracza - "+numerGracza);

        if (numerGracza == 1) {
            if (e.getSource() == b11) {
                b11.setText("X");
            }
            if (e.getSource() == b12) {
                b12.setText("X");
            }
            if (e.getSource() == b13) {
                b13.setText("X");

            }
            if (e.getSource() == b21) {
                b21.setText("X");

            }
            if (e.getSource() == b22) {
                b22.setText("X");
            }
            if (e.getSource() == b23) {
                b23.setText("X");
            }
            if (e.getSource() == b31) {
                b31.setText("X");
            }
            if (e.getSource() == b32) {
                b32.setText("X");

            }
            if (e.getSource() == b33) {
                b33.setText("X");

            }
        }

        if (numerGracza == 2) {
            if (e.getSource() == b11) {
                b11.setText("O");

            }
            if (e.getSource() == b12) {
                b12.setText("O");

            }
            if (e.getSource() == b13) {
                b13.setText("O");

            }
            if (e.getSource() == b21) {
                b21.setText("O");

            }
            if (e.getSource() == b22) {
                b22.setText("O");

            }
            if (e.getSource() == b23) {
                b23.setText("O");

            }
            if (e.getSource() == b31) {
                b31.setText("O");

            }
            if (e.getSource() == b32) {
                b32.setText("O");

            }
            if (e.getSource() == b33) {
                b33.setText("O");

            }
        }
        if (numerGracza ==1 ){
            numerGracza =2;
            System.out.println("Zmienilem gracza na 2");
        }
        else {
            numerGracza = 1;
        }
        scann();

        //numerGracza = g.zmianaGracza(numerGracza);

    }

    @Override
    public String toString() {
        return "Wyswietlacz{" +
                "StanGry=" + Arrays.toString(StanGry) +
                '}';
    }

    public void scann() {
        System.out.println("Wykonalem SCANN");
        String str;

        StanGry = new String[3][3];
        StanGry[0][0] = b11.getText();
        StanGry[0][1] = b12.getText();
        StanGry[0][2] = b13.getText();
        StanGry[1][0] = b13.getText();
        StanGry[1][1] = b13.getText();
        StanGry[1][2] = b13.getText();
        StanGry[2][0] = b13.getText();
        StanGry[2][1] = b13.getText();
        StanGry[2][2] = b13.getText();

System.out.println ("oto element tablicy b11 -  "+StanGry[0][0]);
        System.out.println ("oto element tablicy b11 -  "+StanGry[0][0]);
        System.out.println ("oto element tablicy b12 -  "+StanGry[0][1]);
        System.out.println ("oto element tablicy b13 -  "+StanGry[0][2]);
        str = toString();
        System.out.println("Oto stan tablicy -  "+str);

        if (StanGry[0][0] == StanGry[0][1] && StanGry[0][1] == StanGry[0][2]) {
            System.out.println("Wygrane");

        }

/*
        if (StanGry[2][1] == StanGry[2][2] && StanGry[2][2] == StanGry[2][3]) {
            System.out.println("Wygrane");

        }

        if (StanGry[3][1] == StanGry[1][2] && StanGry[1][2] == StanGry[1][3]) {
            System.out.println("Wygrane");

        }

        if (StanGry[1][1] == StanGry[2][2] && StanGry[2][2] == StanGry[3][3]) {
            System.out.println("Wygrane");

        }


        if (StanGry[1][3] == StanGry[2][2] && StanGry[2][2] == StanGry[3][1]) {
            System.out.println("Wygrane");

        }
        */
    }

}







