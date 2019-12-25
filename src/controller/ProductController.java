package controller;

import data.ProductDAO;
import data.ProductDAOImpl;
import ui.AppMain;

public class ProductController {
    private AppMain amPnl;
    private ProductDAOImpl productDAO;


    public ProductController(AppMain panel,ProductDAOImpl product){
        this.amPnl = panel;
        this.productDAO = product;
    }
}
