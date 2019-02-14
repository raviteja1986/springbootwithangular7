package com.letsstartcoding.sprintbootrestapiexample.controller;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.letsstartcoding.sprintbootrestapiexample.model.User;


public interface EmployeeRepository extends JpaRepository<User, Long> {

}