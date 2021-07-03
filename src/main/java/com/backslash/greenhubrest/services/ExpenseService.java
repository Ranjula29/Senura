package com.backslash.greenhubrest.services;

import com.backslash.greenhubrest.models.Expense;
import com.backslash.greenhubrest.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

//    Insert
    public void addExpense(Expense expense) {
        expenseRepository.insert(expense);
    }

//    Update
    public void updateExpense(Expense expense) {
        Expense savedExpense = expenseRepository.findById(expense.getId())
                .orElseThrow( () -> new RuntimeException(
                        String.format("Cannot Find Expense by ID %s", expense.getId())
                ));

        savedExpense.setExpenseName(expense.getExpenseName());
        savedExpense.setExpenseCategory(expense.getExpenseCategory());
        savedExpense.setExpenseAmount(expense.getExpenseAmount());

        expenseRepository.save(expense);
    }

//    Get All
    public List<Expense> getAllExpense() {
        return expenseRepository.findAll();
    }

//    Find By Name
    public Expense getExpenseByName(String name) {
        return expenseRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException(
                        String.format("Cannot Find Expense by Name %s", name)
                ));
    }

//    Delete
    public void deleteExpense(String id) {
        expenseRepository.deleteById(id);
    }

}
