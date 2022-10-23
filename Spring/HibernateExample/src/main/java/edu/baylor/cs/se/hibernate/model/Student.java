package edu.baylor.cs.se.hibernate.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "studentId", nullable = false)
    private Long studentId;


    @Column(name = "name")
    private String name;

   @Column(name = "email")
   private String email;

   @Column(name = "address")
   private String address;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
     {
         this.name = name;
     }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
