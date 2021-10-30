package com.orderservice.restController;

import com.orderservice.entity.Order;
import com.orderservice.repository.Reposirott;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/order")
public class RestController {

    @Autowired
    private Reposirott repository;

    @GetMapping("/")
    public List<Order> getAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping("/add")
    public void Add(@RequestBody Order order){
        System.out.println("1");
       repository.save(order);
        System.out.println("2");
    }


}
