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
		
		// normally you cannot create object for abstract class
		
		ParentAbstractClass p = new ParentAbstractClass() {
			@Override
			void method() {
				System.out.println("this method is running from inner class");
			}
		};
		
		p.method();
		
		
		
		
	}

}
