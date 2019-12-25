package controller;

import data.ProductDAO;
import data.ProductDAOImpl;
import ui.AppMain;

public class ProductController {
    private AppMain amPnl;
    private final ProductDAO productDAO = ProductDAOImpl.getInstance();

    public ProductController(AppMain panel){
        amPnl = panel;

    }
}
