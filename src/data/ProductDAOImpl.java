package data;

import data.dao.Product;

public class ProductDAOImpl implements  ProductDAO{
    private static ProductDAO INSTANCE = null;
    public static ProductDAO getInstance() {
        if(INSTANCE == null)
            INSTANCE = new ProductDAOImpl();
        return INSTANCE;

    }

    @Override
    public boolean newProduct(Product product) {
        return false;
    }

    @Override
    public boolean delProduct(int prcode) {
        return false;
    }

    @Override
    public boolean updateProduct(Product product) {
        return false;
    }

    @Override
    public Product getProduct(int index) {
        return null;
    }
}
