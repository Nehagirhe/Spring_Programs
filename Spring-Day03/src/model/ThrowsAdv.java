package model;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdv implements ThrowsAdvice {

	public void afterThrowing(Exception e){
		System.out.println("Hello I am Throw Advice "+e);
	}
}
