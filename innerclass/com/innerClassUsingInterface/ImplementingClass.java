/**
 * 
 */
package com.innerClassUsingInterface;

/**
 * @author 91888
 *
 */
public class ImplementingClass {
	
	public static void main(String[] args) {
		
		
		
		// normally you cannot create object for abstract class
		
		ParentInterface p = new ParentInterface() {
			
			@Override
			public void method() {
				System.out.println("method from inner class");
			}

			@Override
			public void additionalMethod() {
				System.out.println("additionalMethod from inner class");
			}
		};
		
		
		
		p.method();
		p.additionalMethod();
	}

}
