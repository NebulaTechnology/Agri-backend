package com.nebula.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nebula.entity.Invoice;
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    // You can add custom query methods if needed
}
