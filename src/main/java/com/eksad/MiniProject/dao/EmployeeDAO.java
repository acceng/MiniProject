package com.eksad.MiniProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eksad.MiniProject.model.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long>{

}
