package com.example.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
//    @Autowired  -> Field Injection
    private Employee employee;

    @Autowired //Constructor Injection
    public Manager(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
