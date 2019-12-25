package controller;

import data.ProductDAO;
import data.dao.Product;
import ui.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductController implements Controller, ActionListener {
    private View amPnl;//원래 인터페이스로 설정후 인터페이스 안에 메소드를 정의해야 함
    private ProductDAO productDAO;
    private boolean editMode = false;

    public ProductController(View panel, ProductDAO product) {
        this.amPnl = panel;
        this.productDAO = product;
        amPnl.attachActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == amPnl.getBtnAddInfo()) {//등록

            int prcode = amPnl.getComboBoxIndex();
            String productName = amPnl.getProductName();
            int price = amPnl.getProductPrice();
            String manufacturer = amPnl.getManufacturer();

            Product product = new Product(prcode, productName, price, manufacturer);

            if (editMode) {//수정일 때
                edit(product);
            } else { //등록일 때
                insert(product);
            }
        } else if (obj == amPnl.getBtnPrint()) {//조회
            select();
        } else if (obj == amPnl.getBtnDelete()) {//삭제
            delete();
        }
        amPnl.refreshData();
    }

    private void edit(Product product) {
        if (productDAO.updateProduct(product))
            ;
        //clearField(); //TODO  아직 뭐하는 친구인지 몰라서 일단 주석처리 해뒀습니다.@see ppt page 79
        editMode = false;
    }

    private void insert(Product product) {
        if (productDAO.newProduct(product)) {
            amPnl.setMessage("상품을 등록했습니다.");
        } else amPnl.setMessage("상품 등록이 실패했습니다.");
    }

    private void select() {
        int prcode = amPnl.getComboBoxIndex();
        Product product = productDAO.getProduct(prcode);
        if (product != null) {
            amPnl.setMessage("상품 정보를 가져왔습니다.");
            amPnl.setProductName(product.getPrname());
            amPnl.setProductPrice(String.valueOf(product.getPrice()));
            amPnl.setManufacture(product.getManufacture());
            editMode = true;
        } else amPnl.setMessage("상품이 검색되지 않았습니다!");
    }

    private void delete() {
        int index = amPnl.getComboBoxIndex();
        if (index == 0) {
            amPnl.setMessage("전체 삭제는 되지 않습니다.");
        } else {
            if (productDAO.delProduct(index)) {
                amPnl.setMessage("상품이 삭제되었습니다.");
            } else amPnl.setMessage("상품이 삭제되지 않았습니다!!");
        }
    }


}
