package com.example.demo.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.serviceInterface.StudentService;

@Service
public class StudentServiceImpl implements StudentService{


	
	    @Autowired
	    private StudentRepository studentRepository;

	    @Autowired
	    private CourseRepository courseRepository;

	    @Override
	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }

	    @Override
	    public Student getStudentById(Long id) {
	        return studentRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Student saveStudent(Student student) {
	        return studentRepository.save(student);
	    }

	    @Override
	    public void deleteStudent(Long id) {
	        studentRepository.deleteById(id);
	    }

	    @Override
	    public Student registerCourse(Long studentId, Long courseId) {
	        Student student = studentRepository.findById(studentId).orElse(null);
	        Course course = courseRepository.findById(courseId).orElse(null);

	        if (student != null && course != null && course.getStudents().size() < course.getCapacity()) {
	            student.getCourses().add(course);
	            course.getStudents().add(student);
	            studentRepository.save(student);
	            courseRepository.save(course);
	        }

	        return student;
	    }

	    @Override
	    public Student dropCourse(Long studentId, Long courseId) {
	        Student student = studentRepository.findById(studentId).orElse(null);
	        Course course = courseRepository.findById(courseId).orElse(null);

	        if (student != null && course != null) {
	            student.getCourses().remove(course);
	            course.getStudents().remove(student);
	            studentRepository.save(student);
	            courseRepository.save(course);
	        }

	        return student;
	    }
	}

	
	


