package lk.jiat.ee.ejb.remote;

import jakarta.ejb.Remote;
import lk.jiat.ee.core.model.Product;

import java.util.List;

@Remote
public interface ProductService {
    lk.jiat.ee.core.model.Product getProduct(int id);

    List<Product> getProducts();

    void addProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(int id);
}
