package com.yashwanthgajji.greatlearning.collegeevent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yashwanthgajji.greatlearning.collegeevent.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
