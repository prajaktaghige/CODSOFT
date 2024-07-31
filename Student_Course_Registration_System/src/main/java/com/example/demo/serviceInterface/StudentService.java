package com.example.demo.serviceInterface;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    Student registerCourse(Long studentId, Long courseId);
    Student dropCourse(Long studentId, Long courseId);
	
	

}
