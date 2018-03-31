package com.company.Widok;

import javax.swing.*;

public class Dodatek {

    public Dodatek() {
        JMenuBar jmb = new JMenuBar();
        JMenuItem jmFile = new JMenu("Plik");
        JMenuItem jmOpen = new JMenuItem("otworz");
        jmFile.add(jmOpen);
        jmb.add(jmFile);
    }



}
