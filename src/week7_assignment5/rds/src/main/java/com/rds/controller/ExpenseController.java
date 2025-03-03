package com.rds.controller;

import com.rds.entity.Expense;
import com.rds.repo.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class ExpenseController {

    private ExpenseRepository repo;

    @Autowired
    public ExpenseController(ExpenseRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/save")
    public String save(@RequestBody Expense expense)
    {
        System.out.println("incoming:"+expense);
        repo.save(expense);
        return "Success";
    }


    @GetMapping("/findall")
    public Iterable<Expense> findAll()
    {
        Iterable<Expense> i=repo.findAll();
        for(Expense e:i)
        {
            System.out.println(e);
        }

        return repo.findAll();
    }
}
