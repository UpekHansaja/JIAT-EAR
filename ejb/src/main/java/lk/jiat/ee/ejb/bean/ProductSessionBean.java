package lk.jiat.ee.ejb.bean;

import jakarta.ejb.Stateless;
import lk.jiat.ee.core.model.Product;
import lk.jiat.ee.ejb.remote.ProductService;

import java.util.List;

@Stateless
public class ProductSessionBean implements ProductService {

    @Override
    public Product getProduct(int id) {
        return new Product(1, "Test Product", "This is a test product", 1000.0, 5);
    }

    @Override
    public List<Product> getProducts() {
        return List.of(
                new Product(1, "Product 1", "Description 1", 100.0, 10),
                new Product(2, "Product 2", "Description 2", 200.0, 20),
                new Product(3, "Product 3", "Description 3", 300.0, 30)
        );
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(int id) {

    }
}
