package com.company;
import controller.ProductController;
import data.ProductDAO;
import data.ProductDAOImpl;
import ui.AppMain;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        new ProductController(new AppMain(), ProductDAOImpl.getInstance());


        ProductDAOImpl.getInstance().closeDB();
    }

}
