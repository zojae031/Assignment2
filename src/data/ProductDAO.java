package data;

import data.dao.Product;

import java.util.ArrayList;

public interface ProductDAO {



    boolean newProduct(Product product);

    boolean delProduct(int prcode);

    boolean updateProduct(Product product);

    Product getProduct(int prcode);

    ArrayList<Product> getAll();

    void closeDB();
}
