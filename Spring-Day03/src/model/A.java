package model;

public class A {
public void newFun()
{
	System.out.println("This is main buissiness logic");
}
public int age(int a) throws ArithmeticException{	
	if(a<18)
		System.out.println("age is not valid");
	else
		System.out.println("age is valid");
	return a;
}

}
