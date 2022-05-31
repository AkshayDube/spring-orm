package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.Dao.StudentDao;
import com.spring.orm.Dao.StudentDaoImpl;
import com.spring.orm.Entities.Student;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");

		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		StudentDao studentDao = context.getBean("studentDao", StudentDaoImpl.class);

		Integer a = studentDao.insertStudent(student);
		System.out.println(a); 
		
		System.out.println(studentDao.getStudent(101));
		  
		student.setCity("Mathura");
		  
		  studentDao.updateStudent(student);
		  
		  List<Student> students=studentDao.getAllStudents();
		 
	}
}
