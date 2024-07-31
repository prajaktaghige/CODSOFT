package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String studentId;
    private String name;

    @ManyToMany
    @JoinTable(
      name = "student_course", 
      joinColumns = @JoinColumn(name = "student_id"), 
      inverseJoinColumns = @JoinColumn(name = "course_id"))
    
    @JsonIgnore
    private List<Course> courses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", studentId=" + studentId + ", name=" + name + ", courses=" + courses + "]";
    }

    public Student(Long id, String studentId, String name, List<Course> courses) {
        super();
        this.id = id;
        this.studentId = studentId;
        this.name = name;
        this.courses = courses;
    }

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
}
