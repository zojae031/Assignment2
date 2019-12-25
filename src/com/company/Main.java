package com.company;

import controller.ProductController;
import data.ProductDAOImpl;
import ui.AppMain;

public class Main {

    public static void main(String[] args) {
        new ProductController(new AppMain(), new ProductDAOImpl());
    }
}
