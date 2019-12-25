package data;

import data.dao.Product;

public interface ProductDAO {

    boolean newProduct(Product product);

    boolean delProduct(int prcode);

    boolean updateProduct(Product product);

    Product getProduct(int index);


}
