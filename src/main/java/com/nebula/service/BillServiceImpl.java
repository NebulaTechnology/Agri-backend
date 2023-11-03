package com.nebula.service;

import com.nebula.entity.Bill;
import com.nebula.repo.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private  BillRepository billRepository;

    public Bill createBill(Bill bill) {
        return billRepository.save(bill);
    }

    public List<Bill> getAllBills() {
        return (List<Bill>) billRepository.findAll();
    }

    public Optional<Bill> getBillById(long billNo) {
        return billRepository.findById(billNo);
    }

    public Bill updateBill(Bill bill) {
        return billRepository.save(bill);
    }

    public void deleteBill(long billNo) {
        billRepository.deleteById(billNo);
    }
}
