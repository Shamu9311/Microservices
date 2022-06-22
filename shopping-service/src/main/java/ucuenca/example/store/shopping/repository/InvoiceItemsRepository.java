package ucuenca.example.store.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ucuenca.example.store.shopping.entity.InvoiceItem;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}
