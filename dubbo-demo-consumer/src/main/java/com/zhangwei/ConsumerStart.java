package com.zhangwei;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhangwei.pojo.Student;
import com.zhangwei.service.StudentService;

public class ConsumerStart {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicantionContext.xml");
		StudentService studentService = context.getBean(StudentService.class);
		Student student = studentService.getById(20);
		System.out.println("student is"+student);
		
		studentService.addAge(student, 3);
		
		Student addAge = studentService.addAge(student, 3);
		
		System.out.println("加岁数以后的数据"+addAge);
	}
}
