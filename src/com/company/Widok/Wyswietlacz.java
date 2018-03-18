package com.company.Widok;

import com.company.Model.Gracz;
import com.company.Model.Pole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;



public class Wyswietlacz implements ActionListener {

    JPanel panel;
    JFrame ramka;

    JTextField imie1;
    JTextField imie2;
    String im1;
    String im2;
    JLabel label2;

    Gracz gracz1;
    Gracz gracz2;
    ArrayList<JButton> guziki = new ArrayList<>();
    ArrayList<Pole> stanPol = new ArrayList<>();
    ArrayList<Gracz> gracz = new ArrayList<>();


    //public int numerGracza = 1;
    int numerGracza;

    String StanGry[][];
    String pola[];

    public Wyswietlacz() {
        ramkaSet();
        buttonSet();
        actionListeneradd();
        numerGracza = 1;
        imionaGraczy();
        pola();
        nameSet();
    }

    public void nameSet() {
        gracz1 = new Gracz("Adam");
        gracz2 = new Gracz("Artur");
        System.out.println("Oto imiona - gracz1 -  " + gracz1.getImie() + "  gracz2 -  " + gracz2.getImie());

    }

    public void buttonSet() {

        for (int i = 0; i < 9; i++) {
            guziki.add(new JButton());
            panel.add(guziki.get(i));
        }

    }

    public void actionListeneradd() {


        for (int i = 0; i < 9; i++) {
            guziki.get(i).addActionListener(this);
        }

    }

    public void imionaGraczy() {
        JFrame ramka2 = new JFrame("Wpisz imiona Graczy");
        JPanel panel2 = new JPanel(new GridBagLayout());
        ramka2.setVisible(true);
        ramka2.add(panel2);
        ramka2.setSize(500, 500);
        ramka2.setLocation(100, 100);
        ramka2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka2.toFront();

        // ramka2.setResizable(false);
        GridBagConstraints c = new GridBagConstraints();

        JLabel l1 = new JLabel("Wpisz imiona");
        panel2.add(l1);
        l1.setFont(new Font("Arial", Font.BOLD, 16));
        // l1.setBounds(50,50,100,25);

        c.fill = GridBagConstraints.VERTICAL;
        //c.weightx = 0;
        c.gridx = 1;
        c.gridy = 0;
        // c.weighty = 0.1;
        c.anchor = GridBagConstraints.PAGE_END;
        // c.insets = new Insets(0,0,1,1);
        //c.insets = new Insets(0, 0, 0, 0);
        //+c.gridwidth = 50;
        panel2.add(l1, c);

        JLabel i1 = new JLabel("Gracz 1");
        c.gridx = 0;
        c.gridy = 1;
        c.weighty = 0;
        //c.weightx = 1;
        c.ipadx = 50;
        panel2.add(i1, c);

        imie1 = new JTextField(25);
        imie1.setSize(25, 50);
        //c.weightx=0;
        c.gridx = 1;
        c.gridy = 1;
        c.ipady = 10;
        panel2.add(imie1, c);

        JLabel i2 = new JLabel("Gracz 2");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        panel2.add(i2, c);

        imie2 = new JTextField(25);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        c.weightx = 0;
        panel2.add(imie2, c);


        JButton b1 = new JButton("OK");

        c.gridx = 1;
        c.gridy = 3;
        c.weightx = 0;
        c.weighty = 0;
        c.ipady = 10;
        c.ipadx = 10;
        panel2.add(b1, c);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                im1 = imie1.getText();
                im2 = imie2.getText();
                System.out.println("Imie 1 - "+im1);
                System.out.println("Imie 2 -  "+im2);
                if (im2 == null){
                    System.out.println("Nie wpisales imienia 2");
                }
                ramka2.dispose();
            }
        });
    }

    public void ramkaSet() {
        ramka = new JFrame("GRA");
        ramka.setLayout(new BorderLayout());
        panel = new JPanel();
        JPanel p1 = new JPanel(new GridLayout(2, 1,50,50));
        JLabel label = new JLabel("GRA");
        label2 = new JLabel("Kolej Gracza - ");

        ramka.add(panel, BorderLayout.CENTER);
        ramka.setVisible(true);
        ramka.setSize(500, 500);
        ramka.add(p1, BorderLayout.NORTH);

        p1.add(label);
        p1.add(label2);

        panel.setLayout(new GridLayout(3, 3));
        //panel.add(label);
        p1.setLayout(new GridLayout(2, 1));

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setLocation(150, 150);
    }

    public void buttonClick(JButton button, int numerGracza) {
        if (numerGracza == 1) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        ZmienTure();
        scann();

    }

    public void pola() {
        for (int i = 0; i < 9; i++) {
            stanPol.add(new Pole("0"));
            System.out.println("Oto element tablict StanPol - " + i + "    " + stanPol.get(i).getSymbol() + "  ;   ");
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Wcisnales przycisk");
        System.out.println("Oto numer gracza - " + numerGracza);

        buttonClick((JButton) e.getSource(), numerGracza);
        System.out.println(" Oto element z action listenera - " + (JButton) e.getSource());
    }


    public void ZmienTure() {
        if (numerGracza == 1) {
            numerGracza = 2;
            System.out.println("Zmienilem gracza na 2");
            label2.setText("Kolej Gracza numer 2");
        } else {
            numerGracza = 1;
            label2.setText("Kolej Gracza numer 1");
        }
    }

    public void scan2() {

    }


    public void scann() {
        System.out.println("Wykonalem SCANN");
        // String str;


        // StanGry = new String[3][3];
        pola = new String[9];

        for (int i = 0; i < 9; i++) {
            pola[i] = guziki.get(i).getText();
        }

        //pola = guziki.toArray(pola);
        for (int i = 0; i < 9; i++) {
            System.out.println("Oto element tablica pola - numer - " + i + "   " + pola[i] + "   ;   ");
        }
        if (pola[0] == pola[1] && pola[1] == pola[2] && pola[0].equals("X")) {
            System.out.println("WYGRANE - linia pozioma 1");
        }
        if (pola[3] == pola[4] && pola[4] == pola[5] && pola[3].equals("X")) {
            System.out.println("WYGRANE - linia pozioma 2");
        }
        if (pola[6] == pola[7] && pola[7] == pola[8] && pola[6].equals("X")) {
            System.out.println("WYGRANE - linia pozioma 3");
        }
        if (pola[0] == pola[3] && pola[3] == pola[6] && pola[0].equals("X")) {
            System.out.println("WYGRANE - linia pionowa 1");
        }
        if (pola[1] == pola[4] && pola[4] == pola[7] && pola[1].equals("X")) {
            System.out.println("WYGRANE - linia pionowa 2");
        }
        if (pola[2] == pola[5] && pola[5] == pola[8] && pola[2].equals("X")) {
            System.out.println("WYGRANE - linia pionowa 3");
        }
        if (pola[0] == pola[4] && pola[4] == pola[8] && pola[0].equals("X")) {
            System.out.println("WYGRANE - linia skosna");
        }
    }

}






