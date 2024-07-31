package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
    
        private Long id;
        private String courseId;
        private String name;
        private int capacity;
        private LocalDate startDate;
        private LocalDate endDate;
        private LocalTime classStartTime;
        private LocalTime classEndTime;
        private String classDays;
        @ManyToMany(mappedBy = "courses")
        private List<Student> students = new ArrayList<>();
        // Getters and setters
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getCourseId() {
			return courseId;
		}
		public void setCourseId(String courseId) {
			this.courseId = courseId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		public LocalDate getStartDate() {
			return startDate;
		}
		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}
		public LocalDate getEndDate() {
			return endDate;
		}
		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}
		public LocalTime getClassStartTime() {
			return classStartTime;
		}
		public void setClassStartTime(LocalTime classStartTime) {
			this.classStartTime = classStartTime;
		}
		public LocalTime getClassEndTime() {
			return classEndTime;
		}
		public void setClassEndTime(LocalTime classEndTime) {
			this.classEndTime = classEndTime;
		}
		public String getClassDays() {
			return classDays;
		}
		public void setClassDays(String classDays) {
			this.classDays = classDays;
		}
		public List<Student> getStudents() {
			return students;
		}
		public void setStudents(List<Student> students) {
			this.students = students;
		}
		
        
        
        
    
}
