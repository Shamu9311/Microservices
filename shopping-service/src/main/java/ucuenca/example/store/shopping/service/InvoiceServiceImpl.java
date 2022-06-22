package ucuenca.example.store.shopping.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ucuenca.example.store.shopping.entity.Invoice;

import java.util.List;

@Slf4j
@Service
public class InvoiceServiceImpl implements InvoiceService{
    @Override
    public List<Invoice> findInvoiceAll() {
        return null;
    }

    @Override
    public Invoice createInvoice(Invoice invoice) {
        return null;
    }

    @Override
    public Invoice updateInvoice(Invoice invoice) {
        return null;
    }

    @Override
    public Invoice deleteInvoice(Invoice invoice) {
        return null;
    }

    @Override
    public Invoice getInvoice(Long id) {
        return null;
    }
}
