package data;

import data.dao.Product;

import java.util.Vector;
import java.util.ArrayList;

public interface ProductDAO {



    boolean newProduct(Product product);

    boolean delProduct(int prcode);

    boolean updateProduct(Product product);

    Product getProduct(int prcode);

    Vector<String> getPrcodeLists();

    ArrayList<Product> getAll();

    void closeDB();
}
