package ucuenca.example.store.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ucuenca.example.store.product.entity.Category;
import ucuenca.example.store.product.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);
}
