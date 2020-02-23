package com.zhangwei.math.service.impl;

import com.zhangwei.math.service.CalulateService;

public class CaluateServiceImpl implements CalulateService{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int jian(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int chu(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
