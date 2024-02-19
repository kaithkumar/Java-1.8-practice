/**
 * 
 */
package com.innerClassUsingConcreteClass;

/**
 * @author 91888
 *
 */
public class RunnerClass {
	
	public static void main(String[] args) {
		
		// if only one method from parent class has to be overriden
		// we have to create a child class and override it in the child class and call the child class method here 
		// but with inner class we can easily override the method with object creation itself
		
		ParentClass p = new ParentClass() {
			@Override
			public void definedMethod1() {
				System.out.println("this is a overriden method using inner class");
			}
		};
		
		p.definedMethod1();
		p.definedMethod2();
		p.definedMethod3();
		
		//output
//		this is a overriden method using inner class
//		this is method2 is from parent class
//		this is method3 is from parent class

		
	}
	


}
