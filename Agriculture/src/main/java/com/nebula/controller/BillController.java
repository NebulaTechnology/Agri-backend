package com.nebula.controller;

import com.nebula.entity.Bill;
import com.nebula.exception.NotFoundException;
import com.nebula.repo.BillRepository;
import com.nebula.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bills")
public class BillController {
    @Autowired
    private  BillService billService;

    @Autowired
    private BillRepository billRepository;

    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        return billService.createBill(bill);
    }

    @GetMapping
    public List<Bill> getAllBills() {
        return billService.getAllBills();
    }

    @GetMapping("/{billNo}")
    public Bill getBillById(@PathVariable long billNo) {
        return billService.getBillById(billNo)
                .orElseThrow(() -> new NotFoundException("Bill not found"));
    }

    @PutMapping("/{billNo}")
    public Bill updateBill(@PathVariable long billNo, @RequestBody Bill bill) {
        if (!billRepository.existsById(billNo)) {
            throw new NotFoundException("Bill not found");
        }
        bill.setBillNo(billNo);
        return billService.updateBill(bill);
    }

    @DeleteMapping("/{billNo}")
    public void deleteBill(@PathVariable long billNo) {
        if (!billRepository.existsById(billNo)) {
            throw new NotFoundException("Bill not found");
        }
        billService.deleteBill(billNo);
    }
}

