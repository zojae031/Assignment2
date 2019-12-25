package controller;

import data.ProductDAO;
import data.ProductDAOImpl;
import ui.AppMain;

public class ProductController {
    private AppMain amPnl;
    private ProductDAO productDAO;


    public ProductController(AppMain panel,ProductDAO product){
        this.amPnl = panel;
        this.productDAO = product;
    }
}
