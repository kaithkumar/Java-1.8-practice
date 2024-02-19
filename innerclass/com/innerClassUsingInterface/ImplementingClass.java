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
		
		// normally you cannot create object for interface class(this looks like object creation for interface)
		
		ParentInterface p = new ParentInterface() {
			@Override
			public void method() {
				System.out.println("overriden interface method from inner class");
			}
			@Override
			public void additionalMethod() {
				System.out.println("overriden interface additionalMethod from inner class");
			}
		};
		
		p.method();
		p.additionalMethod();
		
		//output
		//overriden interface method from inner class
		//overriden interface additionalMethod from inner class
	}

}
