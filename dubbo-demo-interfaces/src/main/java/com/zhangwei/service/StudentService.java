package com.zhangwei.service;

import com.zhangwei.pojo.Student;

public interface StudentService {
	//根据id获取学生
	Student getById(int id);
	//增加年龄
	Student addAge(Student stu,int n);
}
