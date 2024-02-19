/**
 * 
 */
package com.innerClassUsingAbstractClass;

/**
 * @author 91888
 *
 */
public class RunnerClass {
	
	public static void main(String[] args) {
		
		// normally you cannot create object for abstract class(this looks like object creation for abstract class)
		// generally you have to create a child class and extend the abstract class for providing definition for abstract method
		// here using anonymous inner class, you can easily give definition for abstract method without a child class.
		
		ParentAbstractClass parent = new ParentAbstractClass() {
			@Override
			public void method1() {
				System.out.println("this is a overriden method using inner class");
			}
		};
		
		parent.method1();
		parent.method2();
		
		//output
		//this is a overriden method using inner class
		//this is a defined method from Abstract class
		

		
		
		
		
	}

}
