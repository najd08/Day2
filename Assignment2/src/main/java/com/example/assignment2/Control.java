package com.example.assignment2;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1")
public class Control {
    ArrayList<Customers> Customer =new ArrayList<>();
    @GetMapping("/Customers")
    public ArrayList<Customers> getCustomers(){
        return Customer;
    }
    @PostMapping("/add")
    public String addCustomers(@RequestBody Customers customers){
        Customer.add(customers);
        return "add";
    }
    @PutMapping("/Update/{index}")
    public String UpdateCustomers(@PathVariable int index,@RequestBody Customers customers){
        Customer.set(index,customers);
        return "Has been updated!";
    }
    @DeleteMapping("/delete")
    public String DeleteCustomers(@PathVariable int index){
        Customer.remove(index);
        return "Customer has been deleted!";
    }
    @PutMapping("/Depo")
    public String DepositCustomers(@PathVariable int index){
         double tot = Customer.getBalance();
        tot+=index;
        Customer.setBalance(tot);
        return "Deposit has been made!";
    }
    @PutMapping("/Withdraw")
    public String WithdrawCustomers(@PathVariable int index){
        double tot;
        tot = Customer.getBalance()- index;
        Customer.setBalance(tot);
        return "Withdraw done";
    }

}
