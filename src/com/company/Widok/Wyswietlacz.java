package com.company.Widok;

import com.company.Model.Pole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Wyswietlacz implements ActionListener {

    JPanel panel;
    JPanel panel2;
    JPanel panel3;
    JFrame ramka;
    JFrame ramka2;
    JPanel p1;


    JTextField imie1;
    JTextField imie2;
    String im1;
    String im2;
    JLabel label2;
    JLabel label;

    Pole sygnal;

    Pole[][] buttons = new Pole[3][3];
    ImageIcon ikona = new ImageIcon("C:/Users/Tomas/Desktop/Pingwin.jpg");
    int liczbaWolnych = 9;
    //LiczbaWolnych l = new LiczbaWolnych(liczbaWolnych);

    int numerGracza;

    public Wyswietlacz() {
        numerGracza = 1;
        imionaGraczy();

    }


    public void buttonSet() {
        System.out.println("Wszedlem do buttonSet");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++)
            {
                buttons[i][j] = new Pole();
                panel3.add(buttons[i][j]);
            }
            System.out.println("przyciski ustawione");
        }

    }

    public void actionListeneradd() {


        for (int i=0; i<3;i++){
            for (int j=0; j<3;j++){
                buttons[i][j].addActionListener(this);
            }
        }
    }


    public void imionaGraczy() {
        panel2 = new JPanel(new GridBagLayout());
        ramka = new JFrame();
        ramka.add(panel2);
        ramka.setVisible(true);
        ramka.setSize(500, 500);

        GridBagConstraints c = new GridBagConstraints();

        JLabel l1 = new JLabel("Wpisz imiona graczy");
        panel2.add(l1);
        l1.setFont(new Font("Arial", Font.BOLD, 16));

        c.fill = GridBagConstraints.VERTICAL;
        c.gridx = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.PAGE_END;
        panel2.add(l1, c);
/*
        JLabel l2 = new JLabel("Haslo");
        l2.setFont(new Font("Arial", Font.BOLD, 16));
        c.fill = GridBagConstraints.VERTICAL;
        c.gridx = 2;
        c.gridy = 0;
        c.anchor = GridBagConstraints.PAGE_END;
        panel2.add(l2, c);
*/
        JLabel i1 = new JLabel("Gracz 1");
        c.gridx = 0;
        c.gridy = 1;
        c.weighty = 0;
        panel2.add(i1, c);

        JLabel i2 = new JLabel("Gracz 2");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        panel2.add(i2, c);

        imie1 = new JTextField(25);
      //  imie1.setSize(25, 50);
        //c.weightx=0;
        c.gridx = 1;
        c.gridy = 1;
        c.ipady = 10;
        c.ipadx = 0;
        c.weightx = 1;
        panel2.add(imie1, c);
/*
        JPasswordField p1 = new JPasswordField(25);
        c.gridx = 2;
        c.gridy = 1;
        c.ipady = 10;
        panel2.add(p1, c);

        JLabel i2 = new JLabel("Gracz 2");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        panel2.add(i2, c);
*/
        imie2 = new JTextField(25);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        c.weightx = 1;
        panel2.add(imie2, c);
/*
        JPasswordField p2 = new JPasswordField(25);
        c.gridx = 2;
        c.gridy = 2;
        c.ipady = 10;
        panel2.add(p2, c);
*/


        JButton b1 = new JButton("Log in");

        c.gridx = 1;
        c.gridy = 3;
        c.weightx = 10;
        c.weighty = 0;
        c.ipady = 10;
        c.ipadx = 1;
        panel2.add(b1, c);
        ramka.repaint();
        ramka.validate();
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                im1 = imie1.getText();
                im2 = imie2.getText();
                System.out.println("Imie 1 - "+im1);
                System.out.println("Imie 2 -  "+im2);
                if (im1.equals("")||im2.equals("")){
                    System.out.println("Nie wpisano imienia2");
                    JOptionPane.showMessageDialog(null, "Nie wpisano imienia");
                }else {
                    ramka.remove(panel2);

                    System.out.println("Usunieto panel2");
                    ramkaSet();
                    buttonSet();
                    actionListeneradd();
                    pola();
                    ramka.repaint();
                    ramka.validate();
                }
            }
        });
/*
        JMenuBar jmb = new JMenuBar();
        JMenuItem jmFile = new JMenu("Opcje");
        JMenuItem jmOpen = new JMenuItem("Ranking");
        JMenuItem jmClose = new JMenuItem("Dodaj gracza");
        JMenuItem jmSave = new JMenuItem("Usun gracza");

        jmFile.add(jmOpen);

        jmFile.add(jmClose);
        jmFile.add(jmSave);
        jmb.add(jmFile);

        c.gridx = 1;
        c.gridy = 5;
        c.weightx = 0;
        c.weighty = 0;
        c.ipady = 20;
        c.ipadx = 1;
        panel2.add(jmb, c);
*/
        ramka.repaint();
        ramka.validate();

    }
    public void imiona2(){
        System.out.println("Ustawiam ramke3");
        JFrame ramka3 = new JFrame();
        ramka3.setLayout(new BorderLayout());
        JPanel panel4 = new JPanel();
        ramka3.add(panel4);
        ramka3.setVisible(true);
        ramka3.setSize(500, 500);

        panel4.setLayout(new GridLayout(2, 3));
        panel4.setSize(200,200);
        ramka3.add(panel4, BorderLayout.CENTER);
        JLabel i1 = new JLabel ("imie 1");
        JTextField i11 = new JTextField(25);
        JTextField i22 = new JTextField(25);
        JLabel i2 = new JLabel ("imie 2");
        JPasswordField p1 = new JPasswordField(25);
        JPasswordField p2 = new JPasswordField(25);
        panel4.add(i1);
        panel4.add(i11);
        panel4.add(p1);
        panel4.add(i2);
        panel4.add(i22);
        panel4.add(p2);

        JMenuBar jmb = new JMenuBar();
        JMenuItem jmFile = new JMenu("Plik");
        JMenuItem jmOpen = new JMenuItem("ranking");
        JMenuItem jmClose = new JMenuItem("dodaj gracza");
        JMenuItem jmSave = new JMenuItem("usun gracza");

        jmFile.add(jmOpen);

        jmFile.add(jmClose);
        jmFile.add(jmSave);
        jmb.add(jmFile);
        jmb.add(jmFile);
        jmOpen.addActionListener(this);

        JPanel panel6 = new JPanel();
        panel6.add(jmb);
        panel6.setLayout(new FlowLayout());
        ramka3.add(panel6, BorderLayout.NORTH);

        JButton button = new JButton("OK");
        button.setSize(20,20);
        ramka3.add(button, BorderLayout.SOUTH);

        ramka3.repaint();
        ramka3.validate();

    }

    public void ramkaSet() {

        System.out.println("Ustawiam panel 1");

        p1 = new JPanel(new GridLayout(1,3));
        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(3, 3));
        ramka.setLayout(new BorderLayout());
        ramka.add(panel3, BorderLayout.CENTER);

        ramka.add(p1, BorderLayout.NORTH);
        ramka.repaint();
        ramka.validate();

        label = new JLabel("GRA");
        label2 = new JLabel("Kolej Gracza - ");

        JMenuBar jmb = new JMenuBar();
        JMenuItem jmFile = new JMenu("Plik");
        JMenuItem jmOpen = new JMenuItem("otworz");
        JMenuItem jmClose = new JMenuItem("zamknij");
        JMenuItem jmSave = new JMenuItem("zapisz");

        jmFile.add(jmOpen);

        jmFile.add(jmClose);
        jmFile.add(jmSave);
        jmb.add(jmFile);
        jmb.add(jmFile);
        jmOpen.addActionListener(this);

        jmb.setSize(50,25);
        p1.add(jmb);
        p1.add(label);
        p1.add(label2);


        ramka.setSize(500, 500);
        System.out.println("Panel 3 zostal ustawiony");
        ramka.repaint();
        ramka.validate();
    }

    public void buttonClick(Pole button, int numerGracza) {

        if (!scan2(button)){
            liczbaWolnych--;
            ustawPrzycik(numerGracza, button);
             System.out.println("oto wartosc ustawionego pola po kliknieciu = "+button.isZajete());
             System.out.println("Oto liczba wolnych pol  "+liczbaWolnych);
             czyGram();
        } else {
            JOptionPane.showMessageDialog(null, "Wcisniete zajete pole");
        }
    }

    public void czyGram (){
        if (liczbaWolnych == 0 || wygrany()){
            gameOver();
        } else {
            ZmienTure();
        }
    }

    public void ustawPrzycik (int numerGracza, Pole button){
        if (numerGracza == 1) {
            button.setText("X");
            button.setBackground(Color.YELLOW);
        } else {
            button.setText("O");
            button.setBackground(Color.lightGray);
        }
        button.setZajete(true);
    }

    public void pola() {
        for (int i=0; i<3;i++){
            for (int j=0; j<3;j++){
                buttons[i][j].poleWolne();
                System.out.println("ustawienie pole zajete = "+buttons[i][j].isZajete());
            }
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Wcisnales przycisk");
        System.out.println("Oto numer gracza - " + numerGracza);

        buttonClick((Pole) e.getSource(), numerGracza);
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

    public boolean scan2(Pole pole) {
        System.out.println("Wykonalem SCANN2");
        if (pole.isZajete()){

            System.out.println("kliknales zajete pole");
            System.out.println("Oto watrosc kliknietego pola - "+pole.isZajete());
            return true;
        }
        else
        {
            System.out.println("Klikniete pole jest wolne - "+pole.isZajete());
            return false;
        }
    }

    public void gameOver(){
        JOptionPane.showMessageDialog(null, "GRA ZAKONCZONA");
        for (int i=0; i<3;i++){
            for (int j=0; j<3;j++){
                buttons[i][j].removeActionListener(this);
            }
        }
    }

    public boolean wygrany() {
        System.out.println("Wykonalem SCANN");
        return (buttons[0][0].getText().equals("X") && buttons[0][1].getText().equals("X") && buttons[0][2].getText().equals("X"))||
                (buttons[1][0].getText().equals("X") && buttons[1][1].getText().equals("X") && buttons[1][2].getText().equals("X"))||
                (buttons[2][0].getText().equals("X") && buttons[2][1].getText().equals("X") && buttons[2][2].getText().equals("X"))||
                (buttons[0][0].getText().equals("X") && buttons[1][0].getText().equals("X") && buttons[2][0].getText().equals("X"))||
                (buttons[0][1].getText().equals("X") && buttons[1][1].getText().equals("X") && buttons[2][1].getText().equals("X"))||
                (buttons[0][2].getText().equals("X") && buttons[1][2].getText().equals("X") && buttons[2][2].getText().equals("X"))||
                (buttons[0][0].getText().equals("X") && buttons[1][1].getText().equals("X") && buttons[2][2].getText().equals("X"))||
                (buttons[0][2].getText().equals("X") && buttons[1][1].getText().equals("X") && buttons[2][0].getText().equals("X"));

       /* if (buttons[1][0].getText().equals("X") && buttons[1][1].getText().equals("X") && buttons[1][2].getText().equals("X")){
            System.out.println("Wygral gracz 1 - 2 linia pozioma");
        }
        if (buttons[2][0].getText().equals("X") && buttons[2][1].getText().equals("X") && buttons[2][2].getText().equals("X")){
            System.out.println("Wygral gracz 1 - 3 linia pozioma");
        }
        if (buttons[0][0].getText().equals("X") && buttons[1][0].getText().equals("X") && buttons[2][0].getText().equals("X")){
            System.out.println("Wygral gracz 1 - 1 linia pionowa");
        }
        if (buttons[0][1].getText().equals("X") && buttons[1][1].getText().equals("X") && buttons[1][2].getText().equals("X")){
            System.out.println("Wygral gracz 1 - 2 linia pionowa");
        }
        if (buttons[0][2].getText().equals("X") && buttons[1][2].getText().equals("X") && buttons[2][2].getText().equals("X")){
            System.out.println("Wygral gracz 1 - 3 linia pionowa");
        }
        if (buttons[0][0].getText().equals("X") && buttons[0][1].getText().equals("X") && buttons[0][2].getText().equals("X")){
            System.out.println("Wygral gracz 1 - 1 linia pozioma");
        }
        if (buttons[1][0].getText().equals("X") && buttons[1][1].getText().equals("X") && buttons[1][2].getText().equals("X")){
            System.out.println("Wygral gracz 1 - 2 linia pozioma");
        }
        if (buttons[2][0].getText().equals("X") && buttons[2][1].getText().equals("X") && buttons[2][2].getText().equals("X")){
            System.out.println("Wygral gracz 1 - 3 linia pozioma");
        }
        if (buttons[0][0].getText().equals("O") && buttons[1][0].getText().equals("O") && buttons[2][0].getText().equals("O")){
            System.out.println("Wygral gracz 2 - 1 linia pionowa");
        }
        if (buttons[0][1].getText().equals("O") && buttons[1][1].getText().equals("O") && buttons[1][2].getText().equals("O")){
            System.out.println("Wygral gracz 2 - 2 linia pionowa");
        }
        if (buttons[0][2].getText().equals("O") && buttons[1][2].getText().equals("O") && buttons[2][2].getText().equals("O")){
            System.out.println("Wygral gracz 2 - 3 linia pionowa");
        }
        if (buttons[1][0].getText().equals("O") && buttons[1][1].getText().equals("O") && buttons[1][2].getText().equals("O")){
            System.out.println("Wygral gracz 1 - 1 linia pionowa");
        }
        if (buttons[2][0].getText().equals("O") && buttons[2][1].getText().equals("O") && buttons[1][2].getText().equals("O")){
            System.out.println("Wygral gracz 1 - 2 linia pionowa");
        }
        if (buttons[0][2].getText().equals("O") && buttons[1][2].getText().equals("O") && buttons[2][2].getText().equals("O")){
            System.out.println("Wygral gracz 1 - 3 linia pionowa");
        }
        if (buttons[0][0].getText().equals("O") && buttons[0][1].getText().equals("O") && buttons[0][2].getText().equals("O")){
            System.out.println("Wygral gracz 2 - 1 linia pozioma");
        }
        if (buttons[1][0].getText().equals("O") && buttons[1][1].getText().equals("O") && buttons[1][2].getText().equals("O")){
            System.out.println("Wygral gracz 2 - 2 linia pozioma");
        }
        if (buttons[2][0].getText().equals("O") && buttons[2][1].getText().equals("O") && buttons[2][2].getText().equals("O")){
            System.out.println("Wygral gracz 2 - 3 linia pozioma");
        }
        if (buttons[0][0].getText().equals("O") && buttons[1][1].getText().equals("O") && buttons[2][2].getText().equals("O")){
            System.out.println("Wygral gracz 2 -  linia skosna ");
        }
        if (buttons[2][0].getText().equals("O") && buttons[1][1].getText().equals("O") && buttons[0][2].getText().equals("O")){
            System.out.println("Wygral gracz 2 - linia skosna");
        }
        if (buttons[0][0].getText().equals("X") && buttons[1][1].getText().equals("X") && buttons[2][2].getText().equals("X")){
            System.out.println("Wygral gracz 1 - linia skosna");
        }
        if (buttons[2][0].getText().equals("X") && buttons[1][1].getText().equals("X") && buttons[0][2].getText().equals("X")){
            System.out.println("Wygral gracz 1 - linia skosna");
        }
        */
    }

}






