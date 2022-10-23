package edu.baylor.cs.se.hibernate.repository;

import edu.baylor.cs.se.hibernate.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public interface StudentRepository extends JpaRepository<Student,Long>{
    List<Student> findByName(String name);
}
