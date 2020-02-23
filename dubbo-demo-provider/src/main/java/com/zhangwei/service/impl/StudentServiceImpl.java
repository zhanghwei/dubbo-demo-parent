package com.zhangwei.service.impl;

import com.zhangwei.pojo.Student;
import com.zhangwei.service.StudentService;

public class StudentServiceImpl implements StudentService{

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setAge(20);
		student.setId(id);
		student.setName("张三"+id);
		
		return student;
	}

	@Override
	public Student addAge(Student stu,int n) {
		// TODO Auto-generated method stub
		//增加年龄
		stu.setAge(stu.getAge()+n);
		return stu;
	}

}
