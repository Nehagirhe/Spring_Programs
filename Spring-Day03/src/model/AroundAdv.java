package model;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdv implements MethodInterceptor
{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		Object ob;
		System.out.println("hi Before Method Here");
		ob=arg0.proceed();		
		System.out.println("hi After Method Here");
		return ob;
	}
	

}

	

