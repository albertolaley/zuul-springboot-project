package com.albertorosario.springboot_microservices.customerservice.model;

import java.time.LocalDate;

public class Customer {
  private String id;
  private String name;
  private String company;
  private LocalDate birthDate;

  public Customer() {
  }

  public Customer(String id, String name, String company, LocalDate birthDate) {
    this.id = id;
    this.name = name;
    this.company = company;
    this.birthDate = birthDate;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }
}
