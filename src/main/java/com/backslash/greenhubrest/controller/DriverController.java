package com.backslash.greenhubrest.controller;

import com.backslash.greenhubrest.models.Driver;
import com.backslash.greenhubrest.services.DriverService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/driver")
public class DriverController {

    private  final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping
    public ResponseEntity driverRegister(@RequestBody Driver driver) {
        driverService.addDriver(driver);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

//    @PutMapping
//    public ResponseEntity updateExpense(@RequestBody Expense expense) {
//        expenseService.updateExpense(expense);
//        return ResponseEntity.ok().build();
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Expense>> getAllExpense() {
//        return ResponseEntity.ok(expenseService.getAllExpense());
//    }
//
//    @GetMapping("/{name}")
//    public ResponseEntity<Expense> getExpenseByName(@PathVariable String name) {
//        return ResponseEntity.ok(expenseService.getExpenseByName(name));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity deleteExpense(@PathVariable String id) {
//        expenseService.deleteExpense(id);
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//    }

}
