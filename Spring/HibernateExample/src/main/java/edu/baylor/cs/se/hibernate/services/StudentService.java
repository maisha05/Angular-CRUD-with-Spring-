package edu.baylor.cs.se.hibernate.services;

import edu.baylor.cs.se.hibernate.model.Student;
import edu.baylor.cs.se.hibernate.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service

public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student)
    {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {return studentRepository.findAll(); }

    public Student findById(Long id)
    {
        Optional<Student> std = studentRepository.findById(id);
        if(std.isPresent())
        {
            Student s = std.get();
            return s;
        }
        else
            return null;
    }

    public List<Student> findByName(String name) {return studentRepository.findByName(name); }

    @DeleteMapping("/delete/{id}")
    public List<Student> deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
        return studentRepository.findAll();
    }

    public Student update(Student student)
    {
        Optional<Student> std = studentRepository.findById(student.getStudentId());
        if(std.isPresent())
        {
            Student s = std.get();
            s.setName(student.getName());
            s.setEmail(student.getEmail());
            s.setAddress(student.getAddress());
            return studentRepository.save(s);
        }
        else
            return null;
    }
}
