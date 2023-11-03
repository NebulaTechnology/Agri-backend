package com.nebula.service;

import com.nebula.entity.Bill;
import com.nebula.repo.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
public interface BillService {

    public Bill createBill(Bill bill);
    public List<Bill> getAllBills();
    public Optional<Bill> getBillById(long billNo);
    public Bill updateBill(Bill bill);
    public void deleteBill(long billNo);
}
