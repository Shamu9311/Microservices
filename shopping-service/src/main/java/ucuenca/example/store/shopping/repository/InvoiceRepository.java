package ucuenca.example.store.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ucuenca.example.store.shopping.entity.Invoice;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    public List<Invoice> findByCustomerId(Long customerId );
    public Invoice findByNumberInvoice(String numberInvoice);
}
