package com.weather.controllers;

import com.weather.data.entities.AddressEntity;
import com.weather.data.entities.EmployeeEntity;
import com.weather.data.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepo employeeRepo;
    @PostMapping()
    public ResponseEntity<EmployeeEntity> createEmployee(@RequestBody EmployeeEntity employeeEntity){
        return ResponseEntity.ok(employeeRepo.save(employeeEntity));
    }

    @GetMapping()
    public ResponseEntity<List<EmployeeEntity>> getAllEmployees(){
        return ResponseEntity.ok(employeeRepo.findAll());
    }
}
