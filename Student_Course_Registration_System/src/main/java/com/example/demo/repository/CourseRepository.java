package com.example.demo.repository;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
    @Query("SELECT c FROM Course c WHERE c.startDate >= :startDate AND c.endDate <= :endDate")
    List<Course> findCoursesWithinDateRange(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
    
    // Add more custom queries if needed
}
