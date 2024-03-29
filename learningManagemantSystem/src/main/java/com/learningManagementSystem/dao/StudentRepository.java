package com.learningManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learningManagementSystem.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
