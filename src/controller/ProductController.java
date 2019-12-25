package controller;

import data.ProductDAO;
import data.dao.Product;
import ui.AppMain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductController implements Controller, ActionListener {
    private AppMain amPnl;//원래 인터페이스로 설정후 인터페이스 안에 메소드를 정의해야 함
    private ProductDAO productDAO;
    private Product product = new Product();

    public ProductController(AppMain panel, ProductDAO product) {
        this.amPnl = panel;
        this.productDAO = product;
        amPnl.attachActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj ==)
    }
}
