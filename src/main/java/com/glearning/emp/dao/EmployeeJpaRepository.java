package com.glearning.emp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glearning.emp.model.Employee;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, Long>{

}
