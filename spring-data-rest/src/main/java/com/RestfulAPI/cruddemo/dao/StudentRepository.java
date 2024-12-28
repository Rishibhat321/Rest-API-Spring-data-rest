package com.RestfulAPI.cruddemo.dao;

import com.RestfulAPI.cruddemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
