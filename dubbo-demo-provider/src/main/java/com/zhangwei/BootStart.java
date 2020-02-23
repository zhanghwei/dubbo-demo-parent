package com.zhangwei;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * 启动服务提供者
 * 
 */
public class BootStart {
	public static void main(String[] args) throws IOException {
		//加载上下文文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicantion.xml");
		//加载服务到容器
		context.start();
		//加一个阻塞
		System.in.read();
	}
}
