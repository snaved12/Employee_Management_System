package net.java.naved.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.naved.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
