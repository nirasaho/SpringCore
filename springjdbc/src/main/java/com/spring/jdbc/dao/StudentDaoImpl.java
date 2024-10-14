package com.spring.jdbc.dao;

import com.spring.jdbc.entites.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

//@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	
//	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		//insert query
        String query="insert into student(id,name,city) values(?,?,?)";
        int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return result;
	}

	@Override
	public int change(Student student) {
		// updating data
		String query="update student set name=?,city=? where id=?";
		int result = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return result;
	}

	@Override
	public int delete(int studentId) {
		// Deleting data
		String query="delete from student where id=?";
		int result=this.jdbcTemplate.update(query,studentId);
		return result;
	}

	@Override
	public Student getStudent(int studentId) {
		// select single student data
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		// Selecting  multiple student
		String query="select * from student";
		List<Student> students = this.jdbcTemplate.query(query,new RowMapperImpl());
		return students;
	}

	

}
