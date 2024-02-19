/**
 * 
 */
package com.innerClassUsingConcreteClass;

/**
 * @author 91888
 *
 */
public class ChildClass {
	
	public static void main(String[] args) {
		
		// ordinary object
		ParentClass p1 = new ParentClass();
		p1.definedMethod();
		
		
		
		
		// inner class object
		ParentClass p = new ParentClass() {
			@Override
			public void definedMethod() {
				System.out.println("this is from inner class");
			}
		};
		
		p.definedMethod();
		
	}
	


}
