package com.zhangwei;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhangwei.math.service.CalulateService;


public class ConsumerStart2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicantionContext2.xml");
		CalulateService cal = context.getBean(CalulateService.class);
		System.out.println("a=1,b=1");
		int add = cal.add(1, 1);
		System.out.println("加法："+add);
		int jian = cal.jian(1, 1);
		System.out.println("减法："+jian);
		int multiply = cal.multiply(1, 1);
		System.out.println("乘法："+multiply);
		int chu=cal.chu(1, 1);
		System.out.println("除法："+chu);
	}
}
