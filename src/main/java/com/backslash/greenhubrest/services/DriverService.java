package com.backslash.greenhubrest.services;

import com.backslash.greenhubrest.models.Driver;
import com.backslash.greenhubrest.repository.DriverRepository;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    //    Insert
    public void addDriver(Driver driver) {
        driverRepository.insert(driver);
    }

    //    Update
//    public void updateExpense(Expense expense) {
//        Expense savedExpense = expenseRepository.findById(expense.getId())
//                .orElseThrow( () -> new RuntimeException(
//                        String.format("Cannot Find Expense by ID %s", expense.getId())
//                ));
//
//        savedExpense.setExpenseName(expense.getExpenseName());
//        savedExpense.setExpenseCategory(expense.getExpenseCategory());
//        savedExpense.setExpenseAmount(expense.getExpenseAmount());
//
//        expenseRepository.save(expense);
//    }
//
//    //    Get All
//    public List<Expense> getAllExpense() {
//        return expenseRepository.findAll();
//    }
//
//    //    Find By Name
//    public Expense getExpenseByName(String name) {
//        return expenseRepository.findByName(name)
//                .orElseThrow(() -> new RuntimeException(
//                        String.format("Cannot Find Expense by Name %s", name)
//                ));
//    }
//
//    //    Delete
//    public void deleteExpense(String id) {
//        expenseRepository.deleteById(id);
//    }


}
