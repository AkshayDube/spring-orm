package com.spring.orm.Dao;

import java.util.List;

import com.spring.orm.Entities.Student;

public interface StudentDao {
	public int insertStudent(Student student);
	
	public Student getStudent(int id);
	
	public List<Student> getAllStudents();
	
	public void updateStudent(Student student);
	
	public void deleteStudent(int id);

}
