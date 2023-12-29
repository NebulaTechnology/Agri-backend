package com.nebula.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nebula.entity.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {
    // You can add custom query methods if needed
}
