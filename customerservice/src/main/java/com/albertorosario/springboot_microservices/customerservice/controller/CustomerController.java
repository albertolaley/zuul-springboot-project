package com.albertorosario.springboot_microservices.customerservice.controller;

import com.albertorosario.springboot_microservices.customerservice.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

  @GetMapping
  public List<Customer> customerList() {
    Customer customer1 = new Customer();
    customer1.setId("1");
    customer1.setName("John Doe");
    customer1.setCompany("Acme");
    customer1.setBirthDate(LocalDate.now().minusYears(28));

    Customer customer2 = new Customer();
    customer2.setId("2");
    customer2.setName("Jane Doe");
    customer2.setCompany("Acme");
    customer2.setBirthDate(LocalDate.now().minusYears(22));

    List<Customer> result = new ArrayList<>();
    result.add(customer1);
    result.add(customer2);

    return result;
  }
}
