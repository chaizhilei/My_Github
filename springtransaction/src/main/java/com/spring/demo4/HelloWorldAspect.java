package com.spring.demo4;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class HelloWorldAspect implements MethodBeforeAdvice{

	// 前置通知
	public void beforeAdvice() {
		System.out.println("===========before advice");
	}

	// 后置最终通知
	public void afterFinallyAdvice() {
		System.out.println("===========after finally advice");
	}

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("===========before advice");
	}
}
