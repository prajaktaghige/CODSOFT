package com.example.demo.serviceImplementation;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import com.example.demo.serviceInterface.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	
	

	    @Autowired
	    private CourseRepository courseRepository;

	    @Override
	    public List<Course> getAllCourses() {
	        return courseRepository.findAll();
	    }

	    @Override
	    public Course getCourseById(Long id) {
	        return courseRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Course saveCourse(Course course) {
	        return courseRepository.save(course);
	    }

	    @Override
	    public void deleteCourse(Long id) {
	        courseRepository.deleteById(id);
	    }

	    @Override
	    public List<Course> findCoursesWithinDateRange(LocalDate startDate, LocalDate endDate) {
	        return courseRepository.findCoursesWithinDateRange(startDate, endDate);
	    }
	}

	
	
	
	
	
	

