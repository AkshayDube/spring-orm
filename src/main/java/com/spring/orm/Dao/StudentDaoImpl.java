package com.spring.orm.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.Entities.Student;

public class StudentDaoImpl implements StudentDao {
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insertStudent(Student student) {
		Integer count=(Integer) this.hibernateTemplate.save(student);
		return count;
	}

	
	public Student getStudent(int id) {
		Student student=this.hibernateTemplate.get(Student.class,id);
		return student;
	}

	public List<Student> getAllStudents() {
		List<Student> students=this.hibernateTemplate.loadAll(Student.class);
		return students;
	}

	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}

	@Transactional
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.delete(id);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	

}
