package com.company;
import View.AppMain;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AppMain appMain = new AppMain();
        frame.getContentPane().add(appMain);
        //System.out.println(appMain.getProductName());
        frame.pack();
        frame.setVisible(true);
    }
}
